package org.behaviour_design_patterns.observer_design_pattern;

import java.util.ArrayList;

public class Channel implements Subject{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Channel(String name) {
        this.name = name;
    }

    private String name;
    private ArrayList<Observer> list=new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        list.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyAllSubscribers(String msg) {
        for(Observer o:list){
            o.update(msg);
        }
    }
    public void videoUpload(String message){
        notifyAllSubscribers(message);
    }
}
