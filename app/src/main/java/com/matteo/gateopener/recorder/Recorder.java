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
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;

import androidx.core.app.ActivityCompat;

public class Recorder {
    private final String TAG = "Recorder";
    private final Context context;
    private int samplingRate_inHz;
    private int recordingLength_inSec;
    private int nSamples;
    private short[] audioData;

    private AudioRecord audioRecord;
    private IRecordingDone IRecordingDone;

    public Recorder(Context context, int samplingRate_inHz, int recordingLength_inSec) {
        this.context = context;
        this.samplingRate_inHz = samplingRate_inHz;
        this.recordingLength_inSec = recordingLength_inSec;

        nSamples = samplingRate_inHz*recordingLength_inSec;
        IRecordingDone = (IRecordingDone) context;
    }

    public void start() {
        new Thread( ()-> {
            initRecorder();
            doRecording();
            /*
            audioRecord.release();
            audioRecord = null;
             */

            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(()-> {
                IRecordingDone.onRecordingDone(audioData);
            });

        }).start();
    }

    public void stop() {
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
                2*nSamples);
        audioData = new short[nSamples];
    }

    private void doRecording() {
        Log.i(TAG, "doRecording");

        audioRecord.startRecording();
        audioRecord.read(audioData, 0, nSamples);
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
