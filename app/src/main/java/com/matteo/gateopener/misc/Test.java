package com.matteo.gateopener.misc;

import com.matteo.gateopener.fastdtw.dtw.FastDTW;
import com.matteo.gateopener.fastdtw.timeseries.TimeSeries;
import com.matteo.gateopener.fastdtw.util.EuclideanDistance;
import com.matteo.gateopener.fastdtw.util.DistanceFunction;
import com.matteo.gateopener.fastdtw.util.ManhattanDistance;
import com.matteo.gateopener.mfcc.MFCC_Extractor;


public class Test {

    private static DistanceFunction distanceFunction;
    private MFCC_Extractor mfcc_extractor;
    public static void testDTW() {
        distanceFunction = new EuclideanDistance();
        double[] x = new double[200];
        for (int i = 0; i < 200; i++) {
            x[i] = i;
        }
        double[] x2 = new double[100];
        for (int i = 0; i < 100; i++) {
            x2[i] = (double) -i;
        }
        double distance;
        TimeSeries tsTest1 = new TimeSeries(x);
        TimeSeries tsTest2 = new TimeSeries(x2);
        distance = FastDTW.getWarpDistBetween(tsTest1, tsTest2, distanceFunction);
    }



    public void testMFCC() {
        mfcc_extractor = new MFCC_Extractor(Constants.AUDIO_SAMPLING_FREQUENCY, Constants.FRAME_SIZE, Constants.FRAME_HOP_SIZE, Constants.MFCC_COUNT);
        short[] y = new short[400];
        for (int i = 0; i < 400; i++){
            y[i] = (short)i;
        }
        double[][] mfccMatrix = mfcc_extractor.extractMFCC(y);
    }
}
