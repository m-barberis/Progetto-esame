package com.matteo.gateopener.fastdtw.distance;

import com.matteo.gateopener.interfaces.DistanceFunction;

public class EuclideanDistance implements DistanceFunction {
    public double distance(double[] a, double[] b) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            double d = a[i] - b[i];
            sum += d * d;
        }
        return Math.sqrt(sum);
    }
}