package org.behaviour_design_patterns.memento_design_pattern;

public class Memento_design_pattern {
    public static void main(String[] args) {
        Originator originator=new Originator();
        Caretaker caretaker=new Caretaker();
        originator.setState("state 1");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("state 2");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("state 3");
        caretaker.add(originator.saveStateToMemento());

        System.out.println("current state"+originator.getState());
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("first saved state "+originator.getState());
        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("second saved state "+originator.getState());
    }

}
