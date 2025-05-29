package com.matteo.gateopener.recorder;

import com.matteo.gateopener.interfaces.IRecordingDone;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.List;

import androidx.core.app.ActivityCompat;

public class Recorder {
    private final String TAG = "Recorder";
    private final Context context;
    private int samplingRate_inHz;
    private int max_recordingLength_inSec;
    private short[] audioData;

    int silenceThreshold;
    private volatile boolean isRecording = false;
    private List<Short> audioDataList = new ArrayList<>();
    private AudioRecord audioRecord;
    private IRecordingDone IRecordingDone;
    private int frame_length_samples;

    public Recorder(Context context, int samplingRate_inHz, int max_recordingLength_inSec, int silenceThreshold, int frame_length_samples) {
        this.context = context;
        this.samplingRate_inHz = samplingRate_inHz;
        this.max_recordingLength_inSec = max_recordingLength_inSec;
        this.silenceThreshold = silenceThreshold;
        this.frame_length_samples = frame_length_samples;

        IRecordingDone = (IRecordingDone) context;
    }

    public void start() {
        new Thread( ()-> {
            initRecorder();
            isRecording = true;
            if (doRecording() != 0){

            };
            audioData = new short[audioDataList.size()];
            for (int i = 0; i < frame_length_samples; i++){
                audioData[i] = audioDataList.get(i);
            }
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(()-> {
                IRecordingDone.onRecordingDone(audioData);
            });
        }).start();
    }

    public void stop() {
        isRecording = false;
        audioRecord.stop();
        audioRecord.release();
        audioRecord = null;
    }

    private void initRecorder() {

        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            Log.e(TAG, "RECORD_AUDIO permission not granted!");
            return;
        }

        Log.i(TAG, "Initializing AudioRecord");
        audioRecord = new AudioRecord(MediaRecorder.AudioSource.MIC,
                samplingRate_inHz,
                AudioFormat.CHANNEL_IN_MONO,
                AudioFormat.ENCODING_PCM_16BIT,
                2*frame_length_samples);
        //audioData = new short[nSamples];
    }

    private boolean doRecording() {
        Log.i(TAG, "doRecording");

        int read = 0;

        boolean hasStarted = false;

        int bufferSize = AudioRecord.getMinBufferSize(samplingRate_inHz, AudioFormat.CHANNEL_IN_MONO, AudioFormat.ENCODING_PCM_16BIT);

        short[] buffer = new short[bufferSize];

        audioRecord.startRecording();

        long start_time = System.currentTimeMillis();

        while (isRecording) {
            if (System.currentTimeMillis() - start_time >= 1000 * max_recordingLength_inSec){
                return;
            }
            read = audioRecord.read(buffer, 0, frame_length_samples);
            if (read > 0){
                if (hasStarted){
                    for (int i = 0; i < frame_length_samples; i++){
                        audioDataList.add(buffer[i]);
                    }
                }
                else {
                    if (!isSilent(buffer, silenceThreshold, frame_length_samples)){
                        hasStarted = true;
                    }
                }
            }
        }


    }

    private boolean isSilent(short[] audioBuffer, int nBufferSamples, int threshold){
        for (int i = 0; i < nBufferSamples; i++){
            if (audioBuffer[i] > threshold){
                return false;
            }
        }
        return true;
    }

    public File saveAsWav(File file) throws IOException {
        byte[] byteData = shortToByte(audioData);
        int byteRate = samplingRate_inHz * 2;

        try (FileOutputStream out = new FileOutputStream(file)) {
            writeWavHeader(out, audioData.length * 2, samplingRate_inHz, (short) 1, (short) 16);
            out.write(byteData);
        }
        return file;
    }

    private byte[] shortToByte(short[] data) {
        byte[] bytes = new byte[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            bytes[i * 2] = (byte) (data[i] & 0xFF);
            bytes[i * 2 + 1] = (byte) ((data[i] >> 8) & 0xFF);
        }
        return bytes;
    }

    private void writeWavHeader(OutputStream out, int audioLength, int sampleRate, short channels, short bitsPerSample) throws IOException {
        int byteRate = sampleRate * channels * bitsPerSample / 8;
        int blockAlign = channels * bitsPerSample / 8;
        int chunkSize = 36 + audioLength;

        DataOutputStream dos = new DataOutputStream(out);

        dos.writeBytes("RIFF");
        dos.writeInt(Integer.reverseBytes(chunkSize));
        dos.writeBytes("WAVE");

        dos.writeBytes("fmt ");
        dos.writeInt(Integer.reverseBytes(16));
        dos.writeShort(Short.reverseBytes((short) 1));
        dos.writeShort(Short.reverseBytes(channels));
        dos.writeInt(Integer.reverseBytes(sampleRate));
        dos.writeInt(Integer.reverseBytes(byteRate));
        dos.writeShort(Short.reverseBytes((short) blockAlign));
        dos.writeShort(Short.reverseBytes(bitsPerSample));

        dos.writeBytes("data");
        dos.writeInt(Integer.reverseBytes(audioLength));
    }

}
