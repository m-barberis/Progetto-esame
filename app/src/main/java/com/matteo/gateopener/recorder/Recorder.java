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
            doRecording();
            audioData = listToShortArray(audioDataList);
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(()-> {
                IRecordingDone.onRecordingDone(audioData);
            });
        }).start();
    }

    public void stop() {
        isRecording = false;
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
                AudioRecord.getMinBufferSize(samplingRate_inHz, AudioFormat.CHANNEL_IN_MONO, AudioFormat.ENCODING_PCM_16BIT));
        //audioData = new short[nSamples];
    }

    private void doRecording() {
        Log.i(TAG, "doRecording");

        int read = 0;

        boolean hasStarted = false;//Every microphone needs time to "warm up"

        int bufferSize = AudioRecord.getMinBufferSize(samplingRate_inHz, AudioFormat.CHANNEL_IN_MONO, AudioFormat.ENCODING_PCM_16BIT);

        short[] buffer = new short[bufferSize];

        audioRecord.startRecording();

        long start_time = System.currentTimeMillis();

        while (isRecording) {
            if (System.currentTimeMillis() - start_time >= 1000L * max_recordingLength_inSec || audioRecord == null){
                break;
            }
            if (audioRecord.read(buffer, 0, frame_length_samples) > 0){
                if (hasStarted){
                    for (int i = 0; i < frame_length_samples; i++){
                        audioDataList.add(buffer[i]);
                    }
                    continue;
                }// if !hasStarted => Check if buffer is no longer silent
                if (!isSilent(buffer, silenceThreshold, frame_length_samples)){
                    hasStarted = true;
                }
            }
        }
        stop();
    }

    private boolean isSilent(short[] audioBuffer, int nBufferSamples, int threshold){
        for (int i = 0; i < nBufferSamples; i++){
            if (audioBuffer[i] > threshold){
                return false;
            }
        }
        return true;
    }

    private short[] listToShortArray(List<Short> list) {
        short[] result = new short[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}
