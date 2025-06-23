package com.matteo.gateopener.misc;

import android.content.Context;

import com.matteo.gateopener.fastdtw.timeseries.TimeSeries;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public class DTW_Reference {
    public final int ref_0_length = 36000;
    public final int ref_1_length = 37400;
    public final int ref_2_length = 34600;
    public final int ref_3_length = 34600;
    public double[] loadDoubleArrayFromRawBinary(Context context, int resId, int numDoubles) {
        double[] result = new double[numDoubles];

        try (InputStream is = context.getResources().openRawResource(resId);
             DataInputStream dis = new DataInputStream(new BufferedInputStream(is))) {

            for (int i = 0; i < numDoubles; i++) {
                result[i] = dis.readDouble();
            }

            return result;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}