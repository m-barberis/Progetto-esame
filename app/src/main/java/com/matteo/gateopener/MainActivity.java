package com.matteo.gateopener;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.matteo.gateopener.classifier.MFCC_Classifier;
import com.matteo.gateopener.audio_framing.Audio_Framer;
import com.matteo.gateopener.fastdtw.DTW_Computing;
import com.matteo.gateopener.interfaces.IDTWResult;
import com.matteo.gateopener.interfaces.IRecordingDone;
import com.matteo.gateopener.interfaces.IRecordingProgress;
import com.matteo.gateopener.misc.Constants;
import com.matteo.gateopener.mfcc.MFCC_Extractor;
import com.matteo.gateopener.recorder.Recorder;

public class MainActivity extends AppCompatActivity implements IRecordingDone, IRecordingProgress, IDTWResult {
    private final String TAG = "MainActivity";
    private Button bttRecord;
    private TextView tvSpeaker, tvConfidence, tvPassword, tvGateStatus;
    private ProgressBar PGrecording, PGloading;
    private Recorder recorder;
    private Audio_Framer audioFramer;
    private MFCC_Extractor mfcc_extractor;
    private MFCC_Classifier mfcc_classifier;
    int frame_length_samples;
    int hop_size_samples;
    private int[] mfcc_results;
    private int topResult = 0;
    private double confidence = 0;
    private double[] distances;
    private DTW_Computing dtw_computing;
    private double[][] mfccMatrix;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        frame_length_samples = (int)((double)Constants.FRAME_LENGTH_MS / 1000.0 * (double)Constants.AUDIO_SAMPLING_FREQUENCY);
        hop_size_samples = (int)((double)Constants.FRAME_HOP_SIZE_MS / 1000.0 * (double)Constants.AUDIO_SAMPLING_FREQUENCY);
        recorder = new Recorder(this, Constants.AUDIO_SAMPLING_FREQUENCY, Constants.MAX_RECORDING_TIME_MS);
        audioFramer = new Audio_Framer(frame_length_samples, hop_size_samples);
        mfcc_extractor = new MFCC_Extractor(Constants.AUDIO_SAMPLING_FREQUENCY, frame_length_samples, hop_size_samples, Constants.MFCC_COUNT);
        mfcc_classifier = new MFCC_Classifier(Constants.MFCC_COUNT, Constants.NUM_PEOPLE_TO_CLASSIFY);
        mfcc_results = new int[Constants.NUM_PEOPLE_TO_CLASSIFY];
        dtw_computing = new DTW_Computing(this, Constants.NUM_REFERENCES);
        distances = new double[Constants.NUM_REFERENCES];
        reset_distances_array();


        bttRecord.setOnClickListener( (v) -> {
            recorder.start();
            bttRecord.setEnabled(false);
            tvSpeaker.setText("");
            tvConfidence.setText("");
            tvGateStatus.setText("");
            tvPassword.setText("");
        } );
    }

    void initViews() {
        bttRecord = findViewById(R.id.bttRecord);
        tvSpeaker = findViewById(R.id.tvSpeaker);
        tvConfidence = findViewById(R.id.tvConfidence);
        tvPassword = findViewById(R.id.tvPassword);
        tvGateStatus = findViewById(R.id.tvGateStatus);
        PGrecording = findViewById(R.id.PGrecording);
        PGloading = findViewById(R.id.PGloading);
    }

    @Override
    public void onRecordingDone(short[] audioData) {

        mfccMatrix = mfcc_extractor.extractMFCC(audioData);
        mfcc_classifier.classifyMFCCMatrix(mfccMatrix);
        int[] results = mfcc_classifier.getResults(); // per debug
        topResult = mfcc_classifier.getTopResult();
        confidence = mfcc_classifier.getConfidence();

        //dtw_computing.computeDistancesFaster(audioData, topResult); //7 sec circa
        dtw_computing.computeDistances(audioData);
        PGloading.setVisibility(ProgressBar.VISIBLE);//23 secondi

        //Test per DTW
        //Test.testDTW();

        //Test per MFCC
        //Test.testMFCC();

        tvSpeaker.setText(resultToString(topResult));
        tvConfidence.setText("Confidence: "+ String.format("%.2f", confidence));
        resetMfccData();
    }

    @Override
    public void onDTWSingleResult(double result, int position) {
        distances[position] = result;
        if (dtw_finished(distances)){
            double min_distance = DTW_Computing.getMinDistance(distances);
            PGloading.setVisibility(ProgressBar.INVISIBLE);
            setPasswordAndStatus(min_distance);
            resetDTWData();
            enableRecordButton();
        }
    }

    private boolean dtw_finished(double[] distances){
        for (int i = 0; i < distances.length; i++){
            if (distances[i] == -1){
                return false;
            }
        }
        return true;
    }

    @Override
    public void onRecordingProgress(long milliseconds) {
        int progress = (int)(((double)milliseconds / (double)Constants.MAX_RECORDING_TIME_MS) * 100);
        PGrecording.setProgress(progress);
    }

    private void setPasswordAndStatus(double warpDistance) {
        if (warpDistance >= 0 && warpDistance < Constants.HIGHER_DISTANCE_THRESHOLD) {
            tvPassword.setText("Right password!");
            if (topResult == Constants.GATE_OPENER_INDEX) {
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
    private void enableRecordButton(){
        bttRecord.setEnabled(true);
    }

    private void resetMfccData() {
        // Resetta i dati audio e MFCC
        mfccMatrix = null;

        // Resetta i risultati di classificazione
        for (int i = 0; i < mfcc_results.length; i++) {
            mfcc_results[i] = 0;
        }
        mfcc_classifier.reset();
    }

    private void resetDTWData(){
        dtw_computing.reset();
        reset_distances_array();
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

    private void reset_distances_array() {
        for (int i = 0; i < distances.length; i++){
            distances[i] = -1;
        }
    }
}