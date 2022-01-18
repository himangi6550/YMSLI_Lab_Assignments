package com.q1;

public class Employee implements Payable {
	private double rate, salary;
	
	public Employee(double rate, double salary) {
		super();
		this.rate = rate;
		this.salary = salary;
		
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getPayment() {
		return salary;

	}

}
