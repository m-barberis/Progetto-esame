package com.matteo.gateopener;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.matteo.gateopener.interfaces.IRecordingDone;
import com.matteo.gateopener.misc.Constants;
import com.matteo.gateopener.processor.MFCC_Extractor;
import com.matteo.gateopener.recorder.Recorder;

public class MainActivity extends AppCompatActivity implements IRecordingDone {
    private final String TAG = "MainActivity";
    private Button bttRecord, bttStop;
    private TextView tvSpeaker;
    private Chronometer chronometer;
    private Recorder recorder;
    private MFCC_Extractor mfcc_extractor;
    private boolean shouldRecordingKeepGoing = false;
    //private File wavFile;
    float[][] mfccMatrix;
    private final int FS = 16000; //da cambiare




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        recorder = new Recorder(this, Constants.AUDIO_SAMPLING_FREQUENCY, Constants.MAX_RECORDING_TIME_S, Constants.DEFAULT_SILENCE_THRESHOLD, Constants.FRAME_LENGTH_SAMPLES);
        mfcc_extractor = new MFCC_Extractor(Constants.AUDIO_SAMPLING_FREQUENCY, Constants.FRAME_SIZE, Constants.FRAME_HOP_SIZE, Constants.MFCC_COUNT);


        bttRecord.setOnClickListener( (v) -> {
            shouldRecordingKeepGoing = true;
            recorder.start();
            bttRecord.setEnabled(false);
            bttStop.setEnabled(true);
            chronometer.setBase(SystemClock.elapsedRealtime());
            chronometer.start();
        } );

        bttStop.setOnClickListener( (v) -> {
            shouldRecordingKeepGoing = false;
            recorder.stop();
        } );
    }

    void initViews() {
        bttRecord = findViewById(R.id.bttRecord);
        bttStop = findViewById(R.id.bttStop);
        tvSpeaker = findViewById(R.id.tvSpeaker);
        chronometer = findViewById(R.id.chronometer);
    }

    @Override
    public void onRecordingDone(short[] audioData) {
        short[] y = new short[400];
        for (int i = 0; i < 400; i++){
            y[i] = (short)i;
        }
        //TODO
        //wavFile = recorder.saveAsWav(new File(getExternalFilesDir(null), "recorded.wav"));
        mfccMatrix = mfcc_extractor.extractMFCC(audioData);
        resetWidgets();
        float[][] testdata = mfcc_extractor.extractMFCC(y);
        tvSpeaker.setText(testdata.toString());
    }

    private void resetWidgets(){
        bttRecord.setEnabled(true);
        bttStop.setEnabled(false);
        chronometer.stop();
    }
}