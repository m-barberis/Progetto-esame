package com.matteo.gateopener.mfcc;

import java.util.ArrayList;
import java.util.List;

public class MelFilterBank {

    public static double fromHzToMel(double freqHz) {
        return 1125 * Math.log(1 + freqHz / 700.0);
    }


    public static double fromMelToHz(double mel) {
        return 700 * (Math.exp(mel / 1125.0) - 1);
    }


    private static int[] computeMelFiltersIndexes(int nFilter, double firstFreq, double lastFreq, float[] f) {
        int nPoints = nFilter + 2;

        double firstMel = fromHzToMel(firstFreq);
        double lastMel = fromHzToMel(lastFreq);

        //Creo un array di frequenze di mel equispaziate
        double[] melVector = new double[nPoints];
        for (int i = 0; i < nPoints; i++) {
            melVector[i] = firstMel + (lastMel - firstMel) * i / (nPoints - 1);
        }

        //Riporto le frequenze di mel nel dominio della frequenza con la trasformazione inversa
        //NB non sono più equispaziate
        double[] freqVector = new double[nPoints];
        for (int i = 0; i < nPoints; i++) {
            freqVector[i] = fromMelToHz(melVector[i]);
        }

        //trovo gli indici nell'array f[] delle frequenze più vicine (f>=target)
        //alle frequenze appena calcolate
        int[] filterIndexes = new int[nPoints];
        for (int i = 0; i < nPoints; i++) {
            filterIndexes[i] = findIndex(f, (float) freqVector[i]); //f asse delle frequenze "normale", freqVector array dei punti Mel in frequenze.
        }

        return filterIndexes;
    }

    /**
     * Find the first index in f where f >= target.
     * @param f The array of frequencies.
     * @param target The target frequency.
     * @return The index.
     */
    private static int findIndex(float[] f, float target) {
        for (int i = 0; i < f.length; i++) {
            if (f[i] >= target) {
                return i;
            }
        }
        // If target is higher than all frequencies, return last index
        return f.length - 1;
    }

    public static List<float[]> computeFilters(int nFilter, double firstFreq, double lastFreq, float[] f) {
        int[] filterIndexes = computeMelFiltersIndexes(nFilter, firstFreq, lastFreq, f);
        int nFilters = filterIndexes.length - 2;
        int fftSize = f.length;
        List<float[]> melFilters = new ArrayList<>();

        for (int i = 0; i < nFilters; i++) {
            int f_m_m1 = filterIndexes[i];
            int f_m = filterIndexes[i + 1];
            int f_m_p1 = filterIndexes[i + 2];

            float[] filter = new float[fftSize]; // Full-length filter initialized with zeros

            // Rising slope
            for (int k = f_m_m1; k < f_m; k++) {
                filter[k] = (float) (k - f_m_m1) / (f_m - f_m_m1);
            }

            // Falling slope
            for (int k = f_m; k < f_m_p1; k++) {
                filter[k] = (float) (f_m_p1 - k) / (f_m_p1 - f_m);
            }

            melFilters.add(filter);
        }

        return melFilters;
    }


}
