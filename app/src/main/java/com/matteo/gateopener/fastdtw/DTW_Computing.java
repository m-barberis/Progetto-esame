package com.matteo.gateopener.fastdtw;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import com.matteo.gateopener.R;
import com.matteo.gateopener.fastdtw.dtw.FastDTW;
import com.matteo.gateopener.fastdtw.timeseries.TimeSeries;
import com.matteo.gateopener.fastdtw.util.DistanceFunction;
import com.matteo.gateopener.fastdtw.util.EuclideanDistance;
import com.matteo.gateopener.interfaces.IDTWDone;
import com.matteo.gateopener.misc.Constants;
import com.matteo.gateopener.misc.DTW_Reference;
import java.util.Objects;

public class DTW_Computing {
    private Context context;
    private double[] audioData_toDouble;


    static private DistanceFunction distanceFunction;
    private int numReferences;
    private double[] distances;
    private IDTWDone iDtwDone;
    TimeSeries tsInput, tsRef0, tsRef1, tsRef2, tsRef3;
    public DTW_Computing(Context context, int numReferences) {
        this.context = context;
        this.iDtwDone = (IDTWDone) context;
        this.numReferences = numReferences;
        distances = new double[numReferences];
        distanceFunction = new EuclideanDistance();

        tsRef0 = new TimeSeries(Objects.requireNonNull(DTW_Reference.loadDoubleArrayFromRawBinary(context, R.raw.berto, DTW_Reference.ref_0_length)));
        tsRef1 = new TimeSeries(Objects.requireNonNull(DTW_Reference.loadDoubleArrayFromRawBinary(context, R.raw.iazze, DTW_Reference.ref_1_length)));
        tsRef2 = new TimeSeries(Objects.requireNonNull(DTW_Reference.loadDoubleArrayFromRawBinary(context, R.raw.matteob, DTW_Reference.ref_2_length)));
        tsRef3 = new TimeSeries(Objects.requireNonNull(DTW_Reference.loadDoubleArrayFromRawBinary(context, R.raw.torny, DTW_Reference.ref_3_length)));
    }

    public void computeDistances(short[] audioData) {
        new Thread(() -> {
            Handler handler = new Handler(Looper.getMainLooper());
            if (checkSilence(audioData, Constants.SILENCE_THRESHOLD_DTW)){
                handler.post(() -> {
                    iDtwDone.onDTWResult(-1);
                });
                return;
            }
            normalizeAudioData(audioData);
            tsInput = new TimeSeries(audioData_toDouble);

            distances[0] = FastDTW.getWarpDistBetween(tsInput, tsRef0, Constants.SEARCH_RADIUS, distanceFunction);
            distances[1] = FastDTW.getWarpDistBetween(tsInput, tsRef1, Constants.SEARCH_RADIUS, distanceFunction);
            distances[2] = FastDTW.getWarpDistBetween(tsInput, tsRef2, Constants.SEARCH_RADIUS, distanceFunction);
            distances[3] = FastDTW.getWarpDistBetween(tsInput, tsRef3, Constants.SEARCH_RADIUS, distanceFunction);
            handler.post(() -> {
                iDtwDone.onDTWResult(getMinDistance(distances));
            });
        }).start();
    }
    public void computeDistancesFaster(short[] audioData, int speakerIndex) {
        new Thread(() -> {
            Handler handler = new Handler(Looper.getMainLooper());
            if (checkSilence(audioData, Constants.SILENCE_THRESHOLD_DTW)){
                handler.post(() -> {
                    iDtwDone.onDTWResult(-1);
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
                iDtwDone.onDTWResult(getDistance());
            });

        }).start();
    }
    public double getMinDistance(double[] distances) {
        int first = 0;
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] <= distances[first]) {
                first = i;
            }
        }
        return distances[first];
    }

    public double getDistance(){
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] != 0)
                return distances[i];
        }
        return -1;
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
        audioData_toDouble = null;
        tsInput = null;
    }

    private boolean checkSilence(short[] audioData, short silenceThreshold) {
        int i = 0;
        while (i < audioData.length){
            if (audioData[i] > silenceThreshold){
                return false;
            }
            i++;
        }
        return true;
    }


}
