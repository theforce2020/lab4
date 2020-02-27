package com.theforce;

public class SavingsAccount extends Account {
    private double interestRate;


    public SavingsAccount(String acctId, double interestRate, double startBalance) {
        super(acctId, startBalance);
        this.interestRate = interestRate;
    }

    @Override
    public String getAccount() {
        return "saving";
    }

    @Override
    public double computeUpdatedBalance() {
        return getBalance() + (interestRate * getBalance());
    }
}
