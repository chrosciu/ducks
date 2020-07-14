package com.chrosciu.ducks;

public abstract class BaseDuck implements DuckBehaviour {
    public static final String VOICE = "Quack!";
    public static final String SWIM_VOICE = "Splash!";

    @Override
    public String getVoice() {
        return VOICE;
    }

    @Override
    public String getSwimVoice() {
        return SWIM_VOICE;
    }
}
