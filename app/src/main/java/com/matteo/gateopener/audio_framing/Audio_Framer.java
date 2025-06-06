package com.matteo.gateopener.audio_framing;

import java.util.ArrayList;
import java.util.List;

public class Audio_Framer {
    private final String TAG = "Audio_Framer";
    private int frame_size;
    private int hop_size;
    public Audio_Framer(int frame_size, int hop_size) {
        this.frame_size = frame_size;
        this.hop_size = hop_size;
    }

    public short[][] audioToFrames (short[] audioData) {
        List<short[]> framesList = new ArrayList<>();
        for (int start = 0; start + frame_size <= audioData.length; start += hop_size) {
            short[] frame = new short[frame_size]; // in questo caso non è previsto padding fino alla potenza di 2 più vicina
            System.arraycopy(audioData, start, frame, 0, frame_size);
            framesList.add(frame.clone());
        }
        return framesList.toArray(new short[0][frame_size]);
    }
}
