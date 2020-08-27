package com.chrosciu.ducks;

public class DuckBehaviourDelegate {
    public static final String VOICE = "Quack!";
    public static final String SWIM_VOICE = "Splash!";

    public String getVoice() {
        return VOICE;
    }

    public String getSwimVoice() {
        return SWIM_VOICE;
    }
}
