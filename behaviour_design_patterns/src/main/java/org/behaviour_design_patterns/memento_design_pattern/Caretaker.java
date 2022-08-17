package org.behaviour_design_patterns.memento_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<Memento> mementoList=new ArrayList<>();
    public void add(Memento state){
        mementoList.add(state);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
