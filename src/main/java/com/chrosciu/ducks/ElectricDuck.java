package com.chrosciu.ducks;

import lombok.Getter;

@Getter
public class ElectricDuck extends Duck {
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
        if (!batteriesPresent) {
            throw new IllegalStateException("Cannot give voice without batteries!");
        }
        return super.getVoice();
    }
}
