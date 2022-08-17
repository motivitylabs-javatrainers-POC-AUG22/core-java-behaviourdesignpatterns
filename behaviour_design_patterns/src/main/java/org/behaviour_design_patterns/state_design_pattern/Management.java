package org.behaviour_design_patterns.state_design_pattern;


public class Management implements Connection {

    public void open() {
        System.out.println("management connection open");
    }

    public void close() {
        System.out.println("management connection closed");
    }

}
