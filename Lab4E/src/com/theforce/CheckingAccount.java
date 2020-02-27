package com.theforce;

public class CheckingAccount extends Account {
    private double monthlyFee;

    public CheckingAccount(String acctId, double fee, double startBalance) {
        super(acctId, startBalance);
        this.monthlyFee = fee;
    }

    @Override
    public String getAccount() {
        return "checking";
    }

    @Override
    public double computeUpdatedBalance() {
        return getBalance() - monthlyFee;
    }
}
