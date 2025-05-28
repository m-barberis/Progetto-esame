package com.matteo.gateopener.processor;
import android.util.Log;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import be.tarsos.dsp.AudioDispatcher;
import be.tarsos.dsp.AudioEvent;
import be.tarsos.dsp.AudioProcessor;
import be.tarsos.dsp.io.jvm.WaveformSimilarityBasedOverlapAdd;
import be.tarsos.dsp.io.android.AudioDispatcherFactory;
import be.tarsos.dsp.mfcc.MFCC;

public class Processor {

    private static final int SAMPLE_RATE = 16000;
    private static final int BUFFER_SIZE = 1024;
    private static final int HOP_SIZE = 512;
    private static final int MFCC_COUNT = 13;

    public static float[][] extractMFCC(File wavFile) {
        AudioDispatcher dispatcher = AudioDispatcherFactory.fromPipe(wavFile.getAbsolutePath(), SAMPLE_RATE, BUFFER_SIZE, HOP_SIZE);

        MFCC mfccProcessor = new MFCC(BUFFER_SIZE, SAMPLE_RATE, MFCC_COUNT, 40, 300, SAMPLE_RATE / 2);

        List<float[]> mfccList = new ArrayList<>();

        dispatcher.addAudioProcessor(mfccProcessor);
        dispatcher.addAudioProcessor(new AudioProcessor() {
            @Override
            public boolean process(AudioEvent audioEvent) {
                float[] mfccs = mfccProcessor.getMFCC();
                mfccList.add(mfccs.clone());  // clone per evitare riferimenti
                return true;
            }

            @Override
            public void processingFinished() {
                // nothing to do
            }
        });

        dispatcher.run();  // blocca finché finisce

        return mfccList.toArray(new float[0][MFCC_COUNT]);
    }
}
