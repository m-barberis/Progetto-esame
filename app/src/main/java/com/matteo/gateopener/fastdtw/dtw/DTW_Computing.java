package com.matteo.gateopener.fastdtw.dtw;

import android.content.Context;

import com.matteo.gateopener.R;
import com.matteo.gateopener.fastdtw.distance.EuclideanDistance;
import com.matteo.gateopener.fastdtw.timeseries.TimeSeries;
import com.matteo.gateopener.interfaces.DistanceFunction;
import com.matteo.gateopener.misc.DTW_Reference;

import java.util.ArrayList;
import java.util.List;

public class DTW_Computing {
    Context context;
    static double[] audioData_toDouble;

    static private DistanceFunction distanceFunction;
    int numReferences;
    static double[] distances;
    static List<double[]> inputList;
    List<double[]> referenceList_0;
    List<double[]> referenceList_1;
    List<double[]> referenceList_2;
    List<double[]> referenceList_3;
    static TimeSeries tsInput, tsRef0, tsRef1, tsRef2, tsRef3;
    public DTW_Computing(Context context, int numReferences) {
        this.context = context;
        this.numReferences = numReferences;
        this.distances = new double[numReferences];
        distanceFunction = new EuclideanDistance();

        referenceList_0 = new ArrayList<>();
        referenceList_0.add(DTW_Reference.loadDoubleArrayFromRawBinary(context, R.raw.berto, DTW_Reference.ref_0_length));
        tsRef0 = new TimeSeries(referenceList_0);
        referenceList_1 = new ArrayList<>();
        referenceList_1.add(DTW_Reference.loadDoubleArrayFromRawBinary(context, R.raw.iazze, DTW_Reference.ref_1_length));
        tsRef1 = new TimeSeries(referenceList_1);
        referenceList_2 = new ArrayList<>();
        referenceList_2.add(DTW_Reference.loadDoubleArrayFromRawBinary(context, R.raw.matteob, DTW_Reference.ref_2_length));
        tsRef2 = new TimeSeries(referenceList_2);
        referenceList_3 = new ArrayList<>();
        referenceList_3.add(DTW_Reference.loadDoubleArrayFromRawBinary(context, R.raw.torny, DTW_Reference.ref_3_length));
        tsRef3 = new TimeSeries(referenceList_3);
    }

    private static void computeDistances(short[] audioData) {
        normalizeAudioData(audioData);
        inputList = new ArrayList<>();
        inputList.add(audioData_toDouble);
        tsInput = new TimeSeries(inputList);

        distances[0] = FastDTW.getWarpDistance(tsInput, tsRef0, distanceFunction);
        distances[1] = FastDTW.getWarpDistance(tsInput, tsRef1, distanceFunction);
        distances[2] = FastDTW.getWarpDistance(tsInput, tsRef2, distanceFunction);
        distances[3] = FastDTW.getWarpDistance(tsInput, tsRef3, distanceFunction);
    }
    public static double getMinDistance(short[] audioData) {
        computeDistances(audioData);

        int first = 0;
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] <= distances[first]) {
                first = i;
            }
        }
        return distances[first];
    }

    private static void normalizeAudioData(short[] audioData) {
        audioData_toDouble = new double[audioData.length];
        for (int i = 0; i < audioData.length; i++) {
            audioData_toDouble[i] = audioData[i] / 32768.0;
        }
    }

    public void reset() {
        for (int i = 0; i < numReferences; i++) {
            distances[i] = 0;
        }
        inputList = null;
    }

}
