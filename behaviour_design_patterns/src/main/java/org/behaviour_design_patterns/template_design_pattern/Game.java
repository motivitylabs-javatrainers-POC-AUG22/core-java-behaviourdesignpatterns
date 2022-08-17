package org.behaviour_design_patterns.template_design_pattern;

public abstract class Game {
    abstract void start();
    abstract void end();
    public final void play(){
        start();
        end();
    }
}
