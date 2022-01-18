package com.q3;

public class SavingsAccount extends Account {
	private double interest = 5;
	private double maxWithdrawLimit = 25000;

	public SavingsAccount(String memberName, double accountBalance) {
		super(memberName, accountBalance);

	}

	public double getAccountBalance() {
		return (accountBalance + ((interest * accountBalance) / 100));
	}

	public void withdraw(double amount) {
		if (amount <= maxWithdrawLimit) {
			if (accountBalance >= amount) {
				accountBalance -= amount;
			} else
				System.out.println("Not sufficient balance");
		} else
			System.out.println("Amount is more than maximum withdraw amount limit.");

	}

}
