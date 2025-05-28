package com.matteo.gateopener;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.matteo.gateopener.interfaces.IRecordingDone;
import com.matteo.gateopener.processor.Processor;
import com.matteo.gateopener.recorder.Recorder;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity implements IRecordingDone {
    private final String TAG = "MainActivity";
    private Button bttRecord, bttStop;
    private TextView tvSpeaker;
    private Recorder recorder;
    private boolean shouldRecordingKeepGoing = false;
    private File wavFile;
    float[][] mfccMatrix;
    private final int FS = 8000; //da cambiare
    private final int RECORDING_LENGTH_IN_SEC = 1; //volendo pure




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        recorder = new Recorder(this, FS, RECORDING_LENGTH_IN_SEC);

        bttRecord.setOnClickListener( (v) -> {
            shouldRecordingKeepGoing = true;
            recorder.start();
            bttRecord.setEnabled(false);
            bttStop.setEnabled(true);

        } );
        bttStop.setOnClickListener( (v) -> {
            shouldRecordingKeepGoing = false;
            recorder.stop();
            bttRecord.setEnabled(true);
            bttStop.setEnabled(false);
        } );
    }

    void initViews() {
        bttRecord = findViewById(R.id.bttRecord);
        bttStop = findViewById(R.id.bttStop);
        tvSpeaker = findViewById(R.id.tvSpeaker);
    }

    @Override
    public void onRecordingDone(short[] audioData) {
        //TODO
        try {
            wavFile = recorder.saveAsWav(new File(getExternalFilesDir(null), "recorded.wav"));
            mfccMatrix = Processor.extractMFCC(wavFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}