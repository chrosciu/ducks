package com.chrosciu.ducks;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DuckBehaviourDelegate implements DuckBehaviour {
    private final Runnable voicePreCheck;
    private final Runnable swimVoicePreCheck;

    public static final String VOICE = "Quack!";
    public static final String SWIM_VOICE = "Splash!";

    public static final Runnable DUMMY_PRE_CHECK = () -> {};

    @Override
    public String getVoice() {
        voicePreCheck.run();
        return VOICE;
    }

    @Override
    public String getSwimVoice() {
        swimVoicePreCheck.run();
        return SWIM_VOICE;
    }
}
