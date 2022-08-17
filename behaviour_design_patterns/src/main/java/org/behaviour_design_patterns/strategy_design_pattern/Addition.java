package org.behaviour_design_patterns.strategy_design_pattern;

public class Addition implements Strategy{
    @Override
    public float calculation(float a, float b) {
        return a+b;
    }
}
