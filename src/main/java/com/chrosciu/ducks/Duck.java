package com.chrosciu.ducks;

import lombok.experimental.Delegate;

import static com.chrosciu.ducks.DuckBehaviourDelegate.DUMMY_PRE_CHECK;

public class Duck implements DuckBehaviour {
    @Delegate
    private final DuckBehaviourDelegate duckBehaviourDelegate =
            new DuckBehaviourDelegate(DUMMY_PRE_CHECK, DUMMY_PRE_CHECK);
}
