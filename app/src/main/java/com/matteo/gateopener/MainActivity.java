package com.matteo.gateopener;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.matteo.gateopener.classifier.MFCC_Classifier;
import com.matteo.gateopener.interfaces.IRecordingDone;
import com.matteo.gateopener.misc.Constants;
import com.matteo.gateopener.mfcc.MFCC_Extractor;
import com.matteo.gateopener.recorder.Recorder;

public class MainActivity extends AppCompatActivity implements IRecordingDone {
    private final String TAG = "MainActivity";
    private Button bttRecord, bttStop;
    private TextView tvSpeaker;
    private Chronometer chronometer;
    private Recorder recorder;
    private MFCC_Extractor mfcc_extractor;
    private MFCC_Classifier mfcc_classifier;
    private int[] results;
    private int topResult = 0;
    private boolean shouldRecordingKeepGoing = false;
    //private File wavFile;
    double[][] mfccMatrix;
    private final int FS = Constants.AUDIO_SAMPLING_FREQUENCY; //da cambiare




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        recorder = new Recorder(this, Constants.AUDIO_SAMPLING_FREQUENCY, Constants.MAX_RECORDING_TIME_S, Constants.DEFAULT_SILENCE_THRESHOLD, Constants.FRAME_LENGTH_SAMPLES, Constants.WAIT_TIME_BEFORE_RECORDING_MS);
        mfcc_extractor = new MFCC_Extractor(Constants.AUDIO_SAMPLING_FREQUENCY, Constants.FRAME_SIZE, Constants.FRAME_HOP_SIZE, Constants.MFCC_COUNT);
        mfcc_classifier = new MFCC_Classifier(Constants.MFCC_COUNT, Constants.NUM_PEOPLE_TO_CLASSIFY);
        results = new int[Constants.NUM_PEOPLE_TO_CLASSIFY];

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
        mfccMatrix = mfcc_extractor.extractMFCC(audioData);
        mfcc_classifier.classifyMFCCMatrix(mfccMatrix);
        int[] results = mfcc_classifier.getResults();
        topResult = mfcc_classifier.getTopResult();
        resetWidgets();
        tvSpeaker.setText(resultToString(topResult));
    }

    private void resetWidgets(){
        bttRecord.setEnabled(true);
        bttStop.setEnabled(false);
        chronometer.stop();
    }

    private String resultToString(int result){
        switch (result){
            case 0:
                return "Berto";
            case 1:
                return "Iazze";
            case 2:
                return "MatteBarba";
            case 3:
                return "MatteTornar";
            default:
                return "Invalid result";
        }
    }
}