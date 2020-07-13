package com.chrosciu.ducks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuckTest {
    @ParameterizedTest
    @MethodSource
    public void shouldGiveProperVoice(Duck duck) {
        //when
        String voice = duck.getVoice();
        //then
        assertEquals(Duck.VOICE, voice);
    }

    private static Stream<Duck> shouldGiveProperVoice() {
        return Stream.of(new Duck()/*, new ElectricDuck() */);
    }
}
