package org.behaviour_design_patterns.state_design_pattern;

public class State_design_pattern {
    Controller controller;

    State_design_pattern(String con) {
        controller = new Controller();
        //the following trigger should be made by the user
        if (con.equalsIgnoreCase("management"))
            controller.setManagementConnection();
        if (con.equalsIgnoreCase("accounting"))
            controller.setAccountingConnection();
        controller.open();
        controller.close();
    }
    public static void main(String args[]) {

        new State_design_pattern("management");

    }
}
