package com.q3;

class CurrentAccount extends Account {
	private String tradeLicenseNumber;
	
	public CurrentAccount(String memberName,double accountBalance, String tradeLicenseNumber) {
		super(memberName,accountBalance);
		this.tradeLicenseNumber=tradeLicenseNumber;
	}
	
	 public double getAccountBalance() {
		return accountBalance;
	}
	 
	 public void withdraw(double amount) {
			if (accountBalance >= amount) {
				accountBalance -= amount;
			}
			else 
				System.out.println("Not sufficient balance.");
		}

}
