package org.behaviour_design_patterns.state_design_pattern;

public class Accounting implements Connection{

    public void open() {
        System.out.println("accounting connection open");
    }

    public void close() {
        System.out.println("accounting connection closed");
    }

}
