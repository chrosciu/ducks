package com.chrosciu.ducks;

import static com.chrosciu.ducks.DuckBehaviourDelegate.DUMMY_PRE_CHECK;

public class Duck implements DuckBehaviour {
    private final DuckBehaviourDelegate duckBehaviourDelegate =
            new DuckBehaviourDelegate(DUMMY_PRE_CHECK, DUMMY_PRE_CHECK);

    @Override
    public String getVoice() {
        return duckBehaviourDelegate.getVoice();
    }

    @Override
    public String getSwimVoice() {
        return duckBehaviourDelegate.getSwimVoice();
    }
}
