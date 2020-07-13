package com.chrosciu.ducks;

public class Duck implements DuckBehaviour {
    public static final String VOICE = "Quack!";

    @Override
    public String getVoice() {
        return VOICE;
    }
}
