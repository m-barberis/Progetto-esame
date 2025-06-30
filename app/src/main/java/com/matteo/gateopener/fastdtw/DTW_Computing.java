package com.matteo.gateopener.fastdtw;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import com.matteo.gateopener.R;
import com.matteo.gateopener.fastdtw.dtw.FastDTW;
import com.matteo.gateopener.fastdtw.timeseries.TimeSeries;
import com.matteo.gateopener.fastdtw.util.DistanceFunction;
import com.matteo.gateopener.fastdtw.util.EuclideanDistance;
import com.matteo.gateopener.interfaces.IDTWResult;
import com.matteo.gateopener.misc.Constants;
import com.matteo.gateopener.misc.DTW_Reference;
import java.util.Objects;

public class DTW_Computing {
    private Context context;
    private double[] audioData_toDouble;


    static private DistanceFunction distanceFunction;
    private int numReferences;
    private double distance;
    private IDTWResult iDtwDone;
    TimeSeries tsInput;
    TimeSeries[] tsRef;
    public DTW_Computing(Context context, int numReferences) {
        this.context = context;
        this.iDtwDone = (IDTWResult) context;
        this.numReferences = numReferences;
        distanceFunction = new EuclideanDistance();
        tsRef = new TimeSeries[numReferences];

        tsRef[0] = new TimeSeries(Objects.requireNonNull(DTW_Reference.loadDoubleArrayFromRawBinary(context, R.raw.berto, DTW_Reference.ref_0_length)));
        tsRef[1] = new TimeSeries(Objects.requireNonNull(DTW_Reference.loadDoubleArrayFromRawBinary(context, R.raw.iazze, DTW_Reference.ref_1_length)));
        tsRef[2] = new TimeSeries(Objects.requireNonNull(DTW_Reference.loadDoubleArrayFromRawBinary(context, R.raw.matteob, DTW_Reference.ref_2_length)));
        tsRef[3] = new TimeSeries(Objects.requireNonNull(DTW_Reference.loadDoubleArrayFromRawBinary(context, R.raw.torny, DTW_Reference.ref_3_length)));
    }

    public void computeDistances(short[] audioData) {
        Handler handler = new Handler(Looper.getMainLooper());
        if (checkSilence(audioData, Constants.SILENCE_THRESHOLD_DTW)){
            handler.post(() -> {
                iDtwDone.onDTWSingleResult(-2, 0);
            });
            return;
        }
        normalizeAudioData(audioData);
        tsInput = new TimeSeries(audioData_toDouble);
        for (int i = 0; i < tsRef.length; i++) {
            final int finalI = i; //Serve per lambda expression
            new Thread(() -> {
                distance = FastDTW.getWarpDistBetween(tsInput, tsRef[finalI], Constants.SEARCH_RADIUS, distanceFunction);
                handler.post(() -> {
                    iDtwDone.onDTWSingleResult(distance, finalI);
                });
            }).start();
        }
    }
    /*
    public void computeDistancesFaster(short[] audioData, int speakerIndex) {
        new Thread(() -> {
            Handler handler = new Handler(Looper.getMainLooper());
            if (checkSilence(audioData, Constants.SILENCE_THRESHOLD_DTW)){
                handler.post(() -> {
                    iDtwDone.onDTWSingleResult(-1);
                });
                return;
            }
            normalizeAudioData(audioData);
            tsInput = new TimeSeries(audioData_toDouble);
            switch (speakerIndex) {
                case 0:
                    distances[0] = FastDTW.getWarpDistBetween(tsInput, tsRef0, Constants.SEARCH_RADIUS, distanceFunction);
                    break;
                case 1:
                    distances[1] = FastDTW.getWarpDistBetween(tsInput, tsRef1, Constants.SEARCH_RADIUS, distanceFunction);
                    break;
                case 2:
                    distances[2] = FastDTW.getWarpDistBetween(tsInput, tsRef2, Constants.SEARCH_RADIUS, distanceFunction);
                    break;
                case 3:
                    distances[3] = FastDTW.getWarpDistBetween(tsInput, tsRef3, Constants.SEARCH_RADIUS, distanceFunction);
                    break;
            }
            handler.post(() -> {
                iDtwDone.onDTWSingleResult(getDistance());
            });

        }).start();
    }
    */
    public static double getMinDistance(double[] distances) {
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

    private boolean checkSilence(short[] audioData, double silenceThreshold) {
        double total = 0;
        for (int i = 0; i < audioData.length; i++){
            total += (double)audioData[i] * (double)audioData[i];
        }
        if (total <= silenceThreshold){
            return true;
        }
        return false;
    }

    public void reset(){
        distance = -1;
    }

}
