package com.matteo.gateopener;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import androidx.core.app.ActivityCompat;

public class Recorder {
    private final String TAG = "Recorder";
    private final Context context;
    private int samplingRate_inHz;
    private int recordingLength_inSec;
    private int nSamples;
    private short[] audioData;

    private AudioRecord audioRecord;

    public Recorder(Context context, int samplingRate_inHz, int recordingLength_inSec) {
        this.context = context;
        this.samplingRate_inHz = samplingRate_inHz;
        this.recordingLength_inSec = recordingLength_inSec;

        nSamples = samplingRate_inHz*recordingLength_inSec;
    }

    public void start() {
        new Thread( ()-> {
            initRecorder();
            doRecording();

            audioRecord.release();
            audioRecord = null;

            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(()-> {
                IRecordingDone.onRecordingDone(audioData);
            });

        }).start();
    }

    private void initRecorder() {

        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
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

}
