package com.matteo.gateopener.mfcc;

import com.matteo.gateopener.audio_framing.Audio_Framer;
import com.matteo.gateopener.misc.Constants;
import com.matteo.gateopener.processor.Processor;

import java.util.ArrayList;
import java.util.List;

public class MFCC_Extractor {
    private final String TAG = "MFCC_Extractor";
    private final Processor processor;
    private final int SAMPLE_RATE;
    private final int FRAME_SIZE; // 25 ms a 16kHz
    private final int HOP_SIZE;   // 10 ms
    private final int MFCC_COUNT;
    private final int melFilterCount = Constants.MEL_FILTER_COUNT;
    private Audio_Framer audioFramer;
    private short[][] frames;
    private float[] frequencyArray;
    public MFCC_Extractor(int sample_rate, int frame_size, int hop_size, int mfcc_count) {
        this.SAMPLE_RATE = sample_rate;
        this.FRAME_SIZE = frame_size;
        this.HOP_SIZE = hop_size;
        this.MFCC_COUNT = mfcc_count;
        this.processor = new Processor(sample_rate);
        this.audioFramer = new Audio_Framer(frame_size, hop_size);

        frequencyArray = generateFrequencyArray(FRAME_SIZE, SAMPLE_RATE); //TODO da capire bene perchè 257!! (frame size prima era 257 = 512/2 +1)

    }

    /**
     * Estrae MFCC da un array di short (PCM 16-bit mono).
     *
     * @param audioData Array di campioni audio in formato short (PCM 16-bit mono)
     * @return Matrice MFCC [frame][coefficiente]
     */
    public double[][] extractMFCC(short[] audioData) {
        if (audioData == null || audioData.length < FRAME_SIZE) {
            return new double[0][MFCC_COUNT];
        }
        prepareData(audioData);
        List<double[]> mfccList = new ArrayList<>();

        for (int start = 0; start + FRAME_SIZE <= frames.length; start += FRAME_SIZE) {
            short[] currentFrame = new short[FRAME_SIZE];
            System.arraycopy(frames, start, currentFrame, 0, FRAME_SIZE); //estraggo currentFrame dalla matrice di frames
            double[] frame_mfcc = computeFrameMFCC(currentFrame, frequencyArray);

            mfccList.add(frame_mfcc.clone());
        }
        return mfccList.toArray(new double[0][MFCC_COUNT]);
    }

    private void prepareData(short[] audioData) {
        frames = audioFramer.audioToFrames(audioData);
    }

    private float[] generateFrequencyArray(int FRAME_SIZE, int AUDIO_SAMPLING_FREQUENCY) {
        float[] f = new float[FRAME_SIZE];
        for (int i = 0; i < FRAME_SIZE; i++){
            f[i] = (AUDIO_SAMPLING_FREQUENCY / (2 * (FRAME_SIZE - 1))) * i;
        }
        return f;
    }

    private double[] computePowerSpectrum(short[] frame){
        processor.run(frame);
        double[] powerSpectrum = processor.getSpectrum();
        return powerSpectrum;
    }

    private double[] computeFrameMFCC(short[] frame, float[] frequencyArray) {
        double[] filterBankEnergies = new double[melFilterCount];
        double[] powerSpectrum = computePowerSpectrum(frame);
        List<float[]> melFilterBank = MelFilterBank.computeFilters(melFilterCount, 0, SAMPLE_RATE / 2, frequencyArray);

        for (int i = 0; i < melFilterCount; i++){
            float[] melFilter = melFilterBank.get(i);
            for (int x = 0; x < FRAME_SIZE/2; x++){ //qui prima framesize/2 era 256
                filterBankEnergies[i] += powerSpectrum[x] * melFilter[x];
            }
            filterBankEnergies[i] = Math.log(filterBankEnergies[i]);
        }
        double[] frame_mfcc = DCT.computeDCT(filterBankEnergies, 13);

        return frame_mfcc;
    }

}
