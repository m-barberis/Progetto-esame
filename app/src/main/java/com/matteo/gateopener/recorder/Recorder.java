package com.matteo.gateopener.recorder;

import com.matteo.gateopener.interfaces.IRecordingDone;
import com.matteo.gateopener.interfaces.IRecordingProgress;

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
    private int max_recordingLength_ms;
    private short[] audioData;

    int silenceThreshold;
    private volatile boolean isRecording = false;
    private List<Short> audioDataList = new ArrayList<>();
    private AudioRecord audioRecord;
    private IRecordingDone IRecordingDone;
    private IRecordingProgress IRecordingProgress;

    public Recorder(Context context, int samplingRate_inHz, int max_recordingLength_ms) {
        this.context = context;
        this.samplingRate_inHz = samplingRate_inHz;
        this.max_recordingLength_ms = max_recordingLength_ms;
        this.silenceThreshold = silenceThreshold;

        IRecordingDone = (IRecordingDone) context;
        IRecordingProgress = (IRecordingProgress) context;
    }

    public void start() {
        new Thread( ()-> {
            audioDataList = new ArrayList<>();
            audioData = null;
            Handler handler = new Handler(Looper.getMainLooper());

            initRecorder();
            isRecording = true;
            doRecording(handler);
            audioData = listToShortArray(audioDataList);
            handler.post(()-> {
                IRecordingDone.onRecordingDone(audioData);
                audioData = null;
                audioDataList = null;
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

    private void doRecording(Handler handler) {
        long timeElapsed = 0;

        Log.i(TAG, "doRecording");

        int bufferSize = AudioRecord.getMinBufferSize(samplingRate_inHz, AudioFormat.CHANNEL_IN_MONO, AudioFormat.ENCODING_PCM_16BIT);

        short[] buffer = new short[bufferSize];

        audioRecord.startRecording();

        long start_time = System.currentTimeMillis();

        // WARM-UP: ignora i primi N frame
        int warmupFrames = 5;
        for (int i = 0; i < warmupFrames; i++) {
            audioRecord.read(buffer, 0, buffer.length);
        }

        while (isRecording) {
            timeElapsed = System.currentTimeMillis() - start_time;
            if (timeElapsed >= max_recordingLength_ms || audioRecord == null){
                break;
            }
            else {
                long finalTimeElapsed = timeElapsed; //Non gli piace se non uso questo valore che è "effecticely final" a causa dell'uso della lambda expression
                handler.post(() -> {
                    IRecordingProgress.onRecordingProgress(finalTimeElapsed);
                });
            }
            if (audioRecord.read(buffer, 0, buffer.length) > 0) {
                for (int i = 0; i < buffer.length; i++) {
                    audioDataList.add(buffer[i]);
                }
            }
        }
        stop();
    }

    private short[] listToShortArray(List<Short> list) {
        short[] result = new short[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}
