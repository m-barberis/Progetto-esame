package com.matteo.gateopener.processor;

import java.util.ArrayList;
import java.util.List;

import be.tarsos.dsp.AudioEvent;
import be.tarsos.dsp.io.TarsosDSPAudioFormat;
import be.tarsos.dsp.mfcc.MFCC;

public class MFCC_Extractor {

    private int SAMPLE_RATE;
    private int FRAME_SIZE = 400; // 25 ms
    private int HOP_SIZE = 160;   // 10 ms
    private int MFCC_COUNT = 13;

    public MFCC_Extractor(int sample_rate, int frame_size, int hop_size, int mfcc_count) {
        this.SAMPLE_RATE = sample_rate;
        this.FRAME_SIZE = frame_size;
        this.HOP_SIZE = hop_size;
        this.MFCC_COUNT = mfcc_count;
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

        // Conversione in float [-1.0, 1.0]
        float[] floatData = new float[audioData.length];
        for (int i = 0; i < audioData.length; i++) {
            floatData[i] = audioData[i] / 32768.0f;
        }

        return computeMFCC(floatData);
    }

    /**
     * Divide il segnale in frame e calcola i MFCC per ciascun frame.
     *
     * @param audio Array di campioni normalizzati (float tra -1.0 e 1.0)
     * @return Matrice MFCC [frame][coefficiente]
     */
    private float[][] computeMFCC(float[] audio) {
        MFCC mfcc = new MFCC(FRAME_SIZE, SAMPLE_RATE, MFCC_COUNT, 40, 300, SAMPLE_RATE / 2);
        List<float[]> mfccList = new ArrayList<>();
        TarsosDSPAudioFormat format = new TarsosDSPAudioFormat(SAMPLE_RATE, 16, 1, true, false);

        for (int start = 0; start + FRAME_SIZE <= audio.length; start += HOP_SIZE) {
            float[] frame = new float[FRAME_SIZE];
            System.arraycopy(audio, start, frame, 0, FRAME_SIZE);

            // Crea un AudioEvent a partire dal frame
            AudioEvent audioEvent = new AudioEvent(format);
            audioEvent.setFloatBuffer(frame);

            mfcc.process(audioEvent);
            float[] mfccs = mfcc.getMFCC();
            if (mfccs != null) {
                mfccList.add(mfccs.clone());
            }
        }

        return mfccList.toArray(new float[0][MFCC_COUNT]);
    }
}
