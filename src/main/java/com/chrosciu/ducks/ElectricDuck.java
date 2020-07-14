package com.chrosciu.ducks;

import lombok.Getter;

@Getter
public class ElectricDuck implements DuckBehaviour {
    private final DuckBehaviourDelegate duckBehaviourDelegate =
            new DuckBehaviourDelegate(this::getVoicePreCheck, this::getSwimVoicePreCheck);
    private boolean batteriesPresent = false;

    public void insertBatteries() {
        if (batteriesPresent) {
            throw new IllegalStateException("Cannot insert batteries twice!");
        }
        batteriesPresent = true;
    }

    public void removeBatteries() {
        if (!batteriesPresent) {
            throw new IllegalStateException("Batteries already removed!");
        }
        batteriesPresent = false;
    }

    @Override
    public String getVoice() {
        return duckBehaviourDelegate.getVoice();
    }

    @Override
    public String getSwimVoice() {
        return duckBehaviourDelegate.getVoice();
    }

    private void getVoicePreCheck() {
        if (!batteriesPresent) {
            throw new IllegalStateException("Cannot give voice without batteries!");
        }
    }

    private void getSwimVoicePreCheck() {
        if (!batteriesPresent) {
            throw new IllegalStateException("Cannot swim without batteries!");
        }
    }
}
