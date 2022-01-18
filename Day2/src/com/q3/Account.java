package com.q3;

import java.util.Random;

public abstract class Account {
	private String memberName, accountNumber;
	protected double accountBalance;

	public Account(String memberName, double accountBalance) {
		Random rand = new Random();
		String num = 10000 + rand.nextInt(89999) + "";
		this.accountBalance = accountBalance;
		this.memberName = memberName;
		accountNumber = num;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	void deposit(double amount) {
		accountBalance += amount;
	}

	abstract public void withdraw(double withdrawalAmount);

}
