package com.chrosciu.ducks;

import lombok.Getter;

@Getter
public class ElectricDuck {
    private final DuckBehaviourDelegate duckBehaviourDelegate = new DuckBehaviourDelegate();

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

    public String getVoice() {
        if (!batteriesPresent) {
            throw new IllegalStateException("Cannot give voice without batteries!");
        }
        return duckBehaviourDelegate.getVoice();
    }

    public String getSwimVoice() {
        if (!batteriesPresent) {
            throw new IllegalStateException("Cannot swim without batteries!");
        }
        return duckBehaviourDelegate.getSwimVoice();
    }
}
