package com.chrosciu.ducks;

public class Duck implements DuckBehaviour {
    private final DuckBehaviourDelegate duckBehaviourDelegate = new DuckBehaviourDelegate();

    @Override
    public String getVoice() {
        return duckBehaviourDelegate.getVoice();
    }

    @Override
    public String getSwimVoice() {
        return duckBehaviourDelegate.getSwimVoice();
    }
}
