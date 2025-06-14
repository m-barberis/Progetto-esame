package com.matteo.gateopener.fastdtw.timeseries;

import java.util.List;

public class TimeSeries {
    private List<double[]> sequence;

    public TimeSeries(List<double[]> sequence) {
        this.sequence = sequence;
    }

    public int size() {
        return sequence.size();
    }

    public double[] getPoint(int i) {
        return sequence.get(i);
    }
}