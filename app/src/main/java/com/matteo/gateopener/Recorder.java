package com.matteo.gateopener;

import android.content.Context;
import android.media.AudioRecord;

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

}
