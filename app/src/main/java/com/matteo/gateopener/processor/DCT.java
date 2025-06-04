package com.matteo.gateopener.processor;

public class DCT {

    /**
     * Computes the DCT-II of the given mel coefficients.
     *
     * @param melCoefficients Input array of mel filterbank energies.
     * @param numCepstra      Number of cepstral coefficients to return.
     * @return Array of MFCCs.
     */
    public static double[] computeDCT(double[] melCoefficients, int numCepstra) {
        int N = melCoefficients.length;
        double[] mfccs = new double[numCepstra];

        for (int k = 0; k < numCepstra; k++) {
            double sum = 0.0;
            for (int n = 0; n < N; n++) {
                sum += melCoefficients[n] * Math.cos(Math.PI * k * (2 * n + 1) / (2.0 * N));
            }
            // Optional normalization (common in MFCC computation)
            mfccs[k] = sum * Math.sqrt(2.0 / N);
        }

        return mfccs;
    }
}
