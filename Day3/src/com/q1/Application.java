package com.q1;

public class Application {
	public static void main(String[] args) {
		Employee emp1 = new SalariedEmployee(1000, 45000);
		System.out.println(emp1.getPayment());
		Employee emp2 = new HourlyEmployee(1000, 50000, 40);
		System.out.println(emp2.getPayment());
		Employee emp3 = new CommissionEmployee(1000, 40000, 40);
		System.out.println(emp3.getPayment());
		Invoice invoice = new Invoice("375748", "Engine", 43, 32849.7);
		System.out.println(invoice + "  " + invoice.getPayment());
	}
}
