package com.q5;

public class Vehicle {
	private int noOfWheel, noOfPassenger, model;
	private String make;
	
	public Vehicle(int noOfWheel, int noOfPassenger, int model, String make) {
		super();
		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
	}
	
	public void display() {
		System.out.println("Make :"+make);
		System.out.println("Model : :"+model);
		System.out.println("No. of Wheels :"+noOfWheel);
		System.out.println("No. of Passangers :"+noOfPassenger);
	}
	
	

}
