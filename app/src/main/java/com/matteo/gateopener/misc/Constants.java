package com.matteo.gateopener.misc;

public class Constants {
    public static final int AUDIO_SAMPLING_FREQUENCY = 8000; //campioniamo a 8 kHz
    public static final int FRAME_SIZE = 200;  // frame da 25 ms
    public static final int FRAME_HOP_SIZE = 80;    // sovrapposizione tra frame (ogni frame inizia 10 ms dopo quello prima)
    public static final int MFCC_COUNT = 13;
    public static final int MEL_FILTER_COUNT = 26;
    public static final int MAX_RECORDING_TIME_MS = 3000;
    public static final int FRAME_LENGTH_SAMPLES = 400;
    public static final int NUM_PEOPLE_TO_CLASSIFY = 4;
}
