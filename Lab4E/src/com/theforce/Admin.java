package com.theforce;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		return list.stream().map(Employee::computeUpdatedBalanceSum).reduce(0.0, Double::sum);
	}
}
