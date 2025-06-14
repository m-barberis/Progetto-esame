package com.matteo.gateopener.fastdtw.dtw;

import com.matteo.gateopener.fastdtw.timeseries.TimeSeries;
import com.matteo.gateopener.fastdtw.util.DistanceFunction;

public class FastDTW {
    public static double getWarpDistance(TimeSeries ts1, TimeSeries ts2, DistanceFunction distFn) {
        int len1 = ts1.size();
        int len2 = ts2.size();
        double[][] cost = new double[len1 + 1][len2 + 1];

        for (int i = 0; i <= len1; i++)
            for (int j = 0; j <= len2; j++)
                cost[i][j] = Double.POSITIVE_INFINITY;

        cost[0][0] = 0;

        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                double d = distFn.distance(ts1.getPoint(i - 1), ts2.getPoint(j - 1));
                cost[i][j] = d + Math.min(Math.min(cost[i - 1][j], cost[i][j - 1]), cost[i - 1][j - 1]);
            }
        }

        return cost[len1][len2];
    }
}