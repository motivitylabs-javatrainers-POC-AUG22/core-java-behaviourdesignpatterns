package org.behaviour_design_patterns.chain_of_responsibility;

public class Withdraw100 implements IWithdrawMoney{

    private IWithdrawMoney chain;
    @Override
    public void setNextChain(IWithdrawMoney c2) {
        this.chain=c2;
    }

    @Override
    public void withdraw(int i) {
        while (i>=100){
            System.out.println("give 100 note");
            i=i-100;
        }
        if(i<100){
           // this.chain.withdraw(i);
        }
    }
}
