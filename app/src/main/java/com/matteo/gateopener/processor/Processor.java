package com.matteo.gateopener.processor;

import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import be.tarsos.dsp.AudioDispatcher;
import be.tarsos.dsp.AudioEvent;
import be.tarsos.dsp.AudioProcessor;
import be.tarsos.dsp.io.android.AudioDispatcherFactory;
import be.tarsos.dsp.mfcc.MFCC;

public class Processor {

    private static final int SAMPLE_RATE = 16000;
    private static final int FRAME_SIZE = 400;  // frame da 25 ms
    private static final int HOP_SIZE = 160;    // sovrapposizione tra frame (ogni frame inizia 10 ms dopo quello prima)
    private static final int MFCC_COUNT = 13;

    public static float[][] extractMFCC(File wavFile) {
        if (wavFile == null || !wavFile.exists()) {
            Log.e("Processor", "File non trovato o nullo");
            return new float[0][MFCC_COUNT];
        }

        AudioDispatcher dispatcher = AudioDispatcherFactory.fromPipe(
                wavFile.getAbsolutePath(),
                SAMPLE_RATE,
                FRAME_SIZE,
                HOP_SIZE
        );

        MFCC mfccProcessor = new MFCC(FRAME_SIZE, SAMPLE_RATE, MFCC_COUNT, 40, 300, SAMPLE_RATE / 2);

        List<float[]> mfccList = new ArrayList<>();

        dispatcher.addAudioProcessor(mfccProcessor);
        dispatcher.addAudioProcessor(new AudioProcessor() {
            @Override
            public boolean process(AudioEvent audioEvent) {
                float[] mfccs = mfccProcessor.getMFCC();
                if (mfccs != null) {
                    mfccList.add(mfccs.clone()); // clone per evitare riferimenti condivisi
                }
                return true;
            }

            @Override
            public void processingFinished() {
                // Nessuna azione necessaria alla fine
            }
        });

        dispatcher.run();  // Bloccante fino al completamento

        return mfccList.toArray(new float[0][MFCC_COUNT]);
    }
}
