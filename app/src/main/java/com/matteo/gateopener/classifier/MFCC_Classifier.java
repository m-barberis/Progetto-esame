package com.matteo.gateopener.classifier;

import com.matteo.gateopener.misc.Constants;

import java.util.List;

public class MFCC_Classifier {
    private int mfcc_count;
    private int[] results;
    private int num_classes;
    public MFCC_Classifier(int mfcc_count, int num_classes){
        this.mfcc_count = mfcc_count;
        this.num_classes = num_classes;
        results = new int[num_classes];
    }

    public void classifyMFCCMatrix(double[][] mfccMatrix){
        int num_frames = mfccMatrix.length;
        for (int i = 0; i < num_frames; i++){
            results[(int)WekaClassifier.classify(mfccMatrix[i])]++;
        }
    }

    public int[] getResults(){
        return results;
    }

    public int getTopResult() {
        int first = 0;
        for (int i = 0; i < results.length; i++) {
            if (results[i] >= results[first]) {
                first = i;
            }
        }
        return first;
    }

    public void reset() {
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
    }
    public double getConfidence(){
        int total = 0;
        int topVotes = 0;
        for (int count : results) {
            total += count;
        }
        topVotes = results[getTopResult()];

        if (total == 0) return 0.0; // per evitare divisioni per zero
        return (double) topVotes / (double) total;
    }
}
