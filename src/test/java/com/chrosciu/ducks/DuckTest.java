package com.chrosciu.ducks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.chrosciu.ducks.DuckBehaviourDelegate.SWIM_VOICE;
import static com.chrosciu.ducks.DuckBehaviourDelegate.VOICE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuckTest {
    @ParameterizedTest
    @MethodSource("getDucks")
    public void shouldGiveProperVoice(Duck duck) {
        //when
        String voice = duck.getVoice();
        //then
        assertEquals(VOICE, voice);
    }

    @ParameterizedTest
    @MethodSource("getDucks")
    public void shouldGiveProperSwimVoice(Duck duck) {
        //when
        String voice = duck.getSwimVoice();
        //then
        assertEquals(SWIM_VOICE, voice);
    }

    private static Stream<Duck> getDucks() {
        return Stream.of(new Duck());
    }
}
