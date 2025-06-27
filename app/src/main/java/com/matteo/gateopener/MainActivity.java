package com.matteo.gateopener;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.matteo.gateopener.classifier.MFCC_Classifier;
import com.matteo.gateopener.audio_framing.Audio_Framer;
import com.matteo.gateopener.fastdtw.dtw.FastDTW;
import com.matteo.gateopener.fastdtw.timeseries.TimeSeries;
import com.matteo.gateopener.interfaces.DistanceFunction;
import com.matteo.gateopener.fastdtw.util.EuclideanDistance;
import com.matteo.gateopener.interfaces.DTWDone;
import com.matteo.gateopener.interfaces.IRecordingDone;
import com.matteo.gateopener.interfaces.IRecordingProgress;
import com.matteo.gateopener.misc.Constants;
import com.matteo.gateopener.mfcc.MFCC_Extractor;
import com.matteo.gateopener.misc.Test;
import com.matteo.gateopener.recorder.Recorder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IRecordingDone, IRecordingProgress, DTWDone {
    private final String TAG = "MainActivity";
    private Button bttRecord;
    private TextView tvSpeaker, tvConfidence, tvPassword, tvGateStatus;
    private ProgressBar PGrecording;
    private Recorder recorder;
    private Audio_Framer audioFramer;
    private MFCC_Extractor mfcc_extractor;
    private MFCC_Classifier mfcc_classifier;
    private DistanceFunction distanceFunction;

    private int[] results;
    private int topResult = 0;
    private double confidence = 0;
    private double distance = 0;
    private FastDTW fastDTW;

    private boolean shouldRecordingKeepGoing = false;
    private boolean dtw_free;
    double[][] mfccMatrix;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        recorder = new Recorder(this, Constants.AUDIO_SAMPLING_FREQUENCY, Constants.MAX_RECORDING_TIME_MS);
        audioFramer = new Audio_Framer(Constants.FRAME_SIZE, Constants.FRAME_HOP_SIZE);
        mfcc_extractor = new MFCC_Extractor(Constants.AUDIO_SAMPLING_FREQUENCY, Constants.FRAME_SIZE, Constants.FRAME_HOP_SIZE, Constants.MFCC_COUNT);
        mfcc_classifier = new MFCC_Classifier(Constants.MFCC_COUNT, Constants.NUM_PEOPLE_TO_CLASSIFY);
        results = new int[Constants.NUM_PEOPLE_TO_CLASSIFY];
        fastDTW = new FastDTW();
        dtw_free = true;
        distanceFunction = new EuclideanDistance();



        bttRecord.setOnClickListener( (v) -> {
            shouldRecordingKeepGoing = true;
            recorder.start();
            bttRecord.setEnabled(false);
        } );
    }

    void initViews() {
        bttRecord = findViewById(R.id.bttRecord);
        tvSpeaker = findViewById(R.id.tvSpeaker);
        tvConfidence = findViewById(R.id.tvConfidence);
        tvPassword = findViewById(R.id.tvPassword);
        tvGateStatus = findViewById(R.id.tvGateStatus);
        PGrecording = findViewById(R.id.PGrecording);
    }

    @Override
    public void onRecordingDone(short[] audioData) {
        mfccMatrix = mfcc_extractor.extractMFCC(audioData);
        mfcc_classifier.classifyMFCCMatrix(mfccMatrix);
        int[] results = mfcc_classifier.getResults();
        topResult = mfcc_classifier.getTopResult();
        confidence = mfcc_classifier.getConfidence();


        //Test per DTW
        //Test.testDTW();

        //Test per MFCC
        //Test.testMFCC();

        resetWidgets();
        tvSpeaker.setText(resultToString(topResult));
        tvConfidence.setText("Confidence: "+ String.format("%.2f", confidence));
        resetMfccData();
    }
    @Override
    public void onDTWResult(double result) {
        distance = result;
        setPasswordAndStatus();
        resetDTWData();
        resetWidgets();
    }

    @Override
    public void onRecordingProgress(long milliseconds) {
        int progress = (int)(((double)milliseconds / (double)Constants.MAX_RECORDING_TIME_MS) * 100);
        PGrecording.setProgress(progress);
    }

    private void setPasswordAndStatus() {
        if (distance > Constants.LOWER_DISTANCE_THRESHOLD && distance < Constants.HIGHER_DISTANCE_THRESHOLD) {
            tvPassword.setText("Right password!");
            if (topResult == 2) {
                tvGateStatus.setText("GATE OPENING...");
            }
            else {
                tvGateStatus.setText("GATE CLOSED");
            }
        }
        else {
            tvPassword.setText("Wrong password!");
            tvGateStatus.setText("GATE CLOSED");
        }
    }
    private void resetWidgets(){
        bttRecord.setEnabled(true);
    }

    private void resetMfccData() {
        // Resetta i dati audio e MFCC
        mfccMatrix = null;

        // Resetta i risultati di classificazione
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        topResult = 0;
        mfcc_classifier.reset();
    }

    private void resetDTWData(){
        distance = 0;

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