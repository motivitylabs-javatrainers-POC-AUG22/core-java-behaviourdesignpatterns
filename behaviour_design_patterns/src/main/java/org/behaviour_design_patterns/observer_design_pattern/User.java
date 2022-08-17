package org.behaviour_design_patterns.observer_design_pattern;

public class User implements  Observer{
    public User(String username) {
        this.username = username;
    }

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void update(String msg) {
        System.out.println("hello "+username+" new video uploaded ==> "+msg);
    }
}
