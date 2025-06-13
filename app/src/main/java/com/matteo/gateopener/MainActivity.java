package com.matteo.gateopener; //ciao

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.matteo.gateopener.fastdtw.dtw.FastDTW;
import com.matteo.gateopener.fastdtw.timeseries.TimeSeries;
import com.matteo.gateopener.fastdtw.util.DistanceFunction;
import com.matteo.gateopener.fastdtw.util.EuclideanDistance;
import com.matteo.gateopener.interfaces.IRecordingDone;
import com.matteo.gateopener.misc.Constants;
import com.matteo.gateopener.mfcc.MFCC_Extractor;
import com.matteo.gateopener.recorder.Recorder;

import java.util.ArrayList;
import java.util.List;

//import fastdtw.dtw.FastDTW;
//import fastdtw.timeseries.DoubleTimeSeries;
//import fastdtw.timeseries.TimeSeries;
//import fastdtw.util.EuclideanDistance;
//import fastdtw.util.DistanceFunction;

public class MainActivity extends AppCompatActivity implements IRecordingDone {
    private final String TAG = "MainActivity";
    private Button bttRecord, bttStop;
    private TextView tvSpeaker;
    private Chronometer chronometer;
    private Recorder recorder;
    private MFCC_Extractor mfcc_extractor;
    private FastDTW fastDTW;
    private TimeSeries tsTest1, tsTest2;
    private DistanceFunction distanceFunction;
    private boolean shouldRecordingKeepGoing = false;
    //private File wavFile;
    double[][] mfccMatrix;
    private final int FS = 16000; //da cambiare




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        recorder = new Recorder(this, Constants.AUDIO_SAMPLING_FREQUENCY, Constants.MAX_RECORDING_TIME_S, Constants.DEFAULT_SILENCE_THRESHOLD, Constants.FRAME_LENGTH_SAMPLES);
        mfcc_extractor = new MFCC_Extractor(Constants.AUDIO_SAMPLING_FREQUENCY, Constants.FRAME_SIZE, Constants.FRAME_HOP_SIZE, Constants.MFCC_COUNT);
        fastDTW = new FastDTW();
        distanceFunction = new EuclideanDistance();


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
        //Test per DTW
        List<double[]> xlist1 = new ArrayList<>();
        double[] x = new double[200];
        for (int i = 0; i < 200; i++) {
            x[i] = (double) i;
        }
        xlist1.add(x.clone());
        List<double[]> xlist2 = new ArrayList<>();
        double[] x2 = new double[200];
        for (int i = 0; i < 200; i++) {
            x2[i] = (double) i-1;
        }
        xlist2.add(x2.clone());
        double distance;
        tsTest1 = new TimeSeries(xlist1);
        tsTest2 = new TimeSeries(xlist2);
        distance = FastDTW.getWarpDistance(tsTest1, tsTest2, distanceFunction);

        //TODO
        mfccMatrix = mfcc_extractor.extractMFCC(y);
        resetWidgets();
        //double[][] testdata = mfcc_extractor.extractMFCC(y);
        //tvSpeaker.setText(testdata.toString());
    }

    private void resetWidgets(){
        bttRecord.setEnabled(true);
        bttStop.setEnabled(false);
        chronometer.stop();
    }

    private void testDTW() {

    }
}