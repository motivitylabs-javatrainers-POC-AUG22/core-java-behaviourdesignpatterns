package org.behaviour_design_patterns.state_design_pattern;

public class Controller {
    public static Accounting acct;
    public static Management management;
    private static Connection con;

    Controller() {
        acct = new Accounting();
        management = new Management();
    }

    public void setAccountingConnection() {
        con = acct;
    }

    public void setManagementConnection() {
        con  = management;
    }
    public void open() {
        con .open();
    }
    public void close() {
        con .close();
    }
}
