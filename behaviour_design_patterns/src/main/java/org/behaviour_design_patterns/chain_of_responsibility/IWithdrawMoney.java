package org.behaviour_design_patterns.chain_of_responsibility;

public interface IWithdrawMoney {
    void setNextChain(IWithdrawMoney c2);
    void withdraw(int i);
}
