package org.behaviour_design_patterns.strategy_design_pattern;

public class Strategy_design_pattern {
    public static void main(String[] args) {
        Context c=new Context(new Addition());
        float f=c.executeOperation(10, 12);
        System.out.println("addition is "+f);
        c=new Context(new Substraction());
        f=c.executeOperation(11, 2);
        System.out.println("substraction is:"+f);
    }
}
