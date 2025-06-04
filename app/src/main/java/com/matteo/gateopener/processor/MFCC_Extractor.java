package com.matteo.gateopener.processor;

import java.util.ArrayList;
import java.util.List;

public class MFCC_Extractor {
    private Processor processor;
    private int SAMPLE_RATE;
    private int FRAME_SIZE = 400; // 25 ms a 16khz
    private int HOP_SIZE = 160;   // 10 ms
    private int MFCC_COUNT = 13;

    public MFCC_Extractor(int sample_rate, int frame_size, int hop_size, int mfcc_count) {
        this.SAMPLE_RATE = sample_rate;
        this.FRAME_SIZE = frame_size;
        this.HOP_SIZE = hop_size;
        this.MFCC_COUNT = mfcc_count;
        this.processor = new Processor(sample_rate);
    }

    /**
     * Estrae MFCC da un array di short (PCM 16-bit mono).
     *
     * @param audioData Array di campioni audio in formato short (PCM 16-bit mono)
     * @return Matrice MFCC [frame][coefficiente]
     */
    public float[][] extractMFCC(short[] audioData) {
        if (audioData == null || audioData.length < FRAME_SIZE) {
            return new float[0][MFCC_COUNT];
        }

        return computeMFCC(audioData);
    }

    /**
     * Divide il segnale in frame e calcola i MFCC per ciascun frame.
     *
     * @return Matrice MFCC [frame][coefficiente]
     */
    private float[][] computeMFCC(short[] audio) {
        List<double[]> mfccList = new ArrayList<>();
        for (int start = 0; start + FRAME_SIZE <= audio.length; start += HOP_SIZE) {
            short[] frame = new short[FRAME_SIZE];
            System.arraycopy(audio, start, frame, 0, FRAME_SIZE);
            double[] mfccs = computePowerSpectrum(frame);
            if (mfccs != null) {
                mfccList.add(mfccs.clone());
            }
        }

        return mfccList.toArray(new float[0][MFCC_COUNT]);
    }

    private double[] computePowerSpectrum(short[] frame){
        processor.run(frame);
        double[] fft = processor.getSpectrum();
        return fft;
    }
}
