package com.matteo.gateopener.misc;

public class Constants {
    public static final int AUDIO_SAMPLING_FREQUENCY = 8000;//scendere a 8kHz
    public static final int FRAME_SIZE = 400;  // frame da 25 ms
    public static final int FRAME_HOP_SIZE = 160;    // sovrapposizione tra frame (ogni frame inizia 10 ms dopo quello prima)
    public static final int MFCC_COUNT = 13;
    public static final int MEL_FILTER_COUNT = 26;
    public static final int DEFAULT_SILENCE_THRESHOLD = 100;
    public static final int MAX_RECORDING_TIME_S = 10;
    public static final int FRAME_LENGTH_SAMPLES = 400;
    public static final int WAIT_TIME_BEFORE_RECORDING_MS = 500;
    public static final int NUM_PEOPLE_TO_CLASSIFY = 4;
}
