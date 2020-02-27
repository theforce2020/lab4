package com.theforce;

public abstract class Account {
    private String acctId;
    private double balance;

    public Account(String acctId, double balance) {
        this.acctId = acctId;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAcctId() {
        return acctId;
    }

    public abstract String getAccount();
    public abstract double computeUpdatedBalance();
}
