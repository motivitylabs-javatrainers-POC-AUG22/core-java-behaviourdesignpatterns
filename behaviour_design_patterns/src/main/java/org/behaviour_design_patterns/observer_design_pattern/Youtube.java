package org.behaviour_design_patterns.observer_design_pattern;

public class Youtube {
    public static void main(String[] args) {
        Channel channel=new Channel("javahub");
        User u1=new User("das");
        User u2=new User("ramana");
        channel.subscribe(u1);
        channel.subscribe(u2);

        channel.videoUpload("uploaded java videos");
    }
}
