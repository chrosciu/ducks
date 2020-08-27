package com.chrosciu.ducks;

public abstract class BaseDuck {
    public static final String VOICE = "Quack!";
    public static final String SWIM_VOICE = "Splash!";

    public String getVoice() {
        return VOICE;
    }

    public String getSwimVoice() {
        return SWIM_VOICE;
    }
}
