package org.behaviour_design_patterns.chain_of_responsibility;

public class ChainOfResponsibility {
    private IWithdrawMoney c1;
    public ChainOfResponsibility(){
        this.c1=new Withdraw1000();
        IWithdrawMoney c2=new Withdraw100();

        c1.setNextChain(c2);
    }
    public static void main(String[] args) {
       ChainOfResponsibility c=new ChainOfResponsibility();
       c.c1.withdraw(1200);
    }
}