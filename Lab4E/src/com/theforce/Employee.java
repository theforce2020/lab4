package com.theforce;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    List<Account> accounts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public Employee(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public double computeUpdatedBalanceSum() {
        return accounts.stream().map(Account::computeUpdatedBalance).reduce(0.0, Double::sum);
	}

    public void addAccount(Account someCheckingAccount) {
        accounts.add(someCheckingAccount);
    }
}
