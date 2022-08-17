package org.behaviour_design_patterns.chain_of_responsibility;

public class Withdraw1000 implements IWithdrawMoney{
    private IWithdrawMoney chain;
    @Override
    public void setNextChain(IWithdrawMoney c2) {
        this.chain=c2;
    }
    @Override
    public void withdraw(int i) {
        while (i>=1000){
            System.out.println("give 1000 note");
            i=i-1000;
        }
        if(i<1000){
            this.chain.withdraw(i);
        }
    }
}