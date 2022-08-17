package org.behaviour_design_patterns.strategy_design_pattern;

public class Context {
    Context(Strategy s){
        this.s=s;
    }

    Strategy s;
    float executeOperation(float a, float b){
        return s.calculation(a,b);
    }
}
