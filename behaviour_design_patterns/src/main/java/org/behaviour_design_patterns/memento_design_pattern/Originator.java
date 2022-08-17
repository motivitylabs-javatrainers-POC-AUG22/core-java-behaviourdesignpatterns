package org.behaviour_design_patterns.memento_design_pattern;

public class Originator {
    private String state;
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Memento saveStateToMemento(){
        return new Memento(state);
    }
    public void getStateFromMemento(Memento memento){
        state=memento.getState();
    }

}
