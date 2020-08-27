package com.chrosciu.ducks;

import lombok.Getter;
import lombok.experimental.Delegate;

@Getter
public class ElectricDuck implements DuckBehaviour {
    @Delegate
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
