package org.behaviour_design_patterns.observer_design_pattern;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyAllSubscribers(String msg);
}
