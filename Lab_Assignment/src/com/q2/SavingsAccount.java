package com.q2;

public class SavingsAccount extends Account {
	private float interestRate;

	public SavingsAccount() {
	}

	public SavingsAccount(Owner owner, float balance, String number, float interestRate) {
		super(owner,balance, number);
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SavingsAccount [interestRate=").append(interestRate).append("]");
		return builder.toString();
	}

	public float getInterest() {
		float interest = getBalance() * interestRate;
		return interest;
	}

}