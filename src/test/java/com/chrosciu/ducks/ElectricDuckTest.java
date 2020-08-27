package com.chrosciu.ducks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ElectricDuckTest {
    @Test
    public void shouldNotGiveVoiceWithoutInsertingBatteries() {
        //given
        ElectricDuck electricDuck = new ElectricDuck();
        //then
        assertThrows(IllegalStateException.class, electricDuck::getVoice);
    }

    @Test
    public void shouldNotGiveSwimVoiceWithoutInsertingBatteries() {
        //given
        ElectricDuck electricDuck = new ElectricDuck();
        //then
        assertThrows(IllegalStateException.class, electricDuck::getSwimVoice);
    }
}
