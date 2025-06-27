package com.matteo.gateopener.fastdtw.dtw;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import com.matteo.gateopener.R;
import com.matteo.gateopener.fastdtw.distance.EuclideanDistance;
import com.matteo.gateopener.fastdtw.timeseries.TimeSeries;
import com.matteo.gateopener.interfaces.DTWDone;
import com.matteo.gateopener.interfaces.DistanceFunction;
import com.matteo.gateopener.misc.DTW_Reference;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DTW_Computing {
    Context context;
    private DTWDone onDtwDone;
    double[] audioData_toDouble;

    private DistanceFunction distanceFunction;
    private int numReferences;
    private double[] distances;
    private List<double[]> inputList;
    private TimeSeries tsInput, tsRef0, tsRef1, tsRef2, tsRef3;
    public DTW_Computing(Context context, int numReferences) throws IOException {
        this.context = context;
        onDtwDone = (DTWDone) context;
        this.numReferences = numReferences;
        this.distances = new double[numReferences];
        distanceFunction = new EuclideanDistance();

        List<double[]> referenceList_0 = new ArrayList<>();
        referenceList_0.add(DTW_Reference.loadDoubleArrayFromRawBinary(context, R.raw.berto, DTW_Reference.ref_0_length));
        tsRef0 = new TimeSeries(referenceList_0);
        List<double[]> referenceList_1 = new ArrayList<>();
        referenceList_1.add(DTW_Reference.loadDoubleArrayFromRawBinary(context, R.raw.iazze, DTW_Reference.ref_1_length));
        tsRef1 = new TimeSeries(referenceList_1);
        List<double[]> referenceList_2 = new ArrayList<>();
        referenceList_2.add(DTW_Reference.loadDoubleArrayFromRawBinary(context, R.raw.matteob, DTW_Reference.ref_2_length));
        tsRef2 = new TimeSeries(referenceList_2);
        List<double[]> referenceList_3 = new ArrayList<>();
        referenceList_3.add(DTW_Reference.loadDoubleArrayFromRawBinary(context, R.raw.torny, DTW_Reference.ref_3_length));
        tsRef3 = new TimeSeries(referenceList_3);
    }

    private void computeDistances(short[] audioData) {
        normalizeAudioData(audioData);
        inputList = new ArrayList<>();
        inputList.add(audioData_toDouble);
        tsInput = new TimeSeries(inputList);

        distances[0] = FastDTW.getWarpDistance(tsInput, tsRef0, distanceFunction);
        distances[1] = FastDTW.getWarpDistance(tsInput, tsRef1, distanceFunction);
        distances[2] = FastDTW.getWarpDistance(tsInput, tsRef2, distanceFunction);
        distances[3] = FastDTW.getWarpDistance(tsInput, tsRef3, distanceFunction);
    }

    public void computeMinDistance(short[] audioData){
        new Thread(() -> {
            computeDistances(audioData);
            double min_distance = getMinDistance(distances);

            android.os.Handler handler = new Handler(Looper.getMainLooper());
            handler.post(() -> {
                onDtwDone.onDTWResult(min_distance);
            });
        }).start();
    }
    private double getMinDistance(double[] distances) {
        int first = 0;
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] <= distances[first]) {
                first = i;
            }
        }
        return distances[first];
    }

    private void normalizeAudioData(short[] audioData) {
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
