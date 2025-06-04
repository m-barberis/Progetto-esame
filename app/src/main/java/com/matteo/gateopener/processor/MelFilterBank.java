package com.matteo.gateopener.processor;

import java.util.ArrayList;
import java.util.List;

public class MelFilterBank {
    /**
     * Converts a frequency in Hz to Mel scale.
     * @param freqHz Frequency in Hz.
     * @return Frequency in Mels.
     */
    public static double fromHzToMel(double freqHz) {
        return 1125 * Math.log(1 + freqHz / 700.0);
    }

    /**
     * Converts a frequency in Mel scale to Hz.
     * @param mel Frequency in Mels.
     * @return Frequency in Hz.
     */
    public static double fromMelToHz(double mel) {
        return 700 * (Math.exp(mel / 1125.0) - 1);
    }

    /**
     * Compute filter indexes for the MEL filter bank.
     * @param nFilter Number of MEL filters.
     * @param firstFreq Starting frequency.
     * @param lastFreq Ending frequency.
     * @param f Array of discrete frequencies.
     * @return Array of filter indexes (size: nFilter + 2)
     */
    public static int[] computeMelFiltersIndexes(int nFilter, double firstFreq, double lastFreq, float[] f) {
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
            filterIndexes[i] = findIndex(f, (float) freqVector[i]);
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

    /**
     * Compute the MEL filters as arrays of filter values.
     * Each filter is stored as a float array with its shape.
     * @param filterIndexes Filter indexes computed from computeMelFiltersIndexes.
     * @param f Frequency array.
     * @return List of filter shapes, each as a float[].
     */
    public static List<float[]> computeFilters(int[] filterIndexes, float[] f) {
        int nFilters = filterIndexes.length - 2;
        List<float[]> melFilters = new ArrayList<>();

        for (int i = 0; i < nFilters; i++) {
            int f_m_m1 = filterIndexes[i];
            int f_m = filterIndexes[i + 1];
            int f_m_p1 = filterIndexes[i + 2];

            // Rising slope
            int nRaise = f_m - f_m_m1 + 1;
            float[] fRaise = new float[nRaise];
            for (int k = 0; k < nRaise; k++) {
                fRaise[k] = (float) k / (float) (f_m - f_m_m1);
            }

            // Falling slope
            int nFall = f_m_p1 - f_m;
            float[] fFall = new float[nFall];
            for (int k = 1; k <= nFall; k++) {
                fFall[k - 1] = (float) (f_m_p1 - (f_m + k)) / (float) (f_m_p1 - f_m);
            }

            // Concatenate
            float[] singleFilterValues = new float[fRaise.length + fFall.length];
            System.arraycopy(fRaise, 0, singleFilterValues, 0, fRaise.length);
            System.arraycopy(fFall, 0, singleFilterValues, fRaise.length, fFall.length);

            melFilters.add(singleFilterValues);
        }

        return melFilters;
    }

}
