package com.chrosciu.ducks;

public class Duck {
    private final DuckBehaviourDelegate duckBehaviourDelegate = new DuckBehaviourDelegate();

    public String getVoice() {
        return duckBehaviourDelegate.getVoice();
    }

    public String getSwimVoice() {
        return duckBehaviourDelegate.getSwimVoice();
    }
}
