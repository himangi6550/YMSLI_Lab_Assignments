package com.q2;

public class CurrentAccount extends Account {
	private float minimumBalance;

	public CurrentAccount() {
	}

	public CurrentAccount(float minimumBalance) {
		super();
		this.minimumBalance = minimumBalance;
	}

	public float getCharges() {
		return minimumBalance;
	}
}