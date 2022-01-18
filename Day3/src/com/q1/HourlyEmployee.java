package com.q1;

public class HourlyEmployee extends Employee {
	private double noOfHours;

	public HourlyEmployee(double rate, double salary, double noOfHours) {
		super(rate, salary);
		// TODO Auto-generated constructor stub
		this.noOfHours = noOfHours;
	}

	public double getPayment() {
		this.setSalary(this.getRate() * noOfHours);
		return this.getSalary();

	}

	public double increaseSalary(double rate) {
		this.setRate(this.getRate() + rate);
		getPayment();
		return this.getSalary();
	}

}
