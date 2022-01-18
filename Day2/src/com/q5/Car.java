package com.q5;

public class Car extends Vehicle {
	private int noOfDoor;
	
	
	
	public Car(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor) {
		super(noOfWheel, noOfPassenger, model, make);
		// TODO Auto-generated constructor stub
		this.noOfDoor = noOfDoor;
	}
	
	public void display() {
		super.display();
		System.out.println("No. of doors: "+noOfDoor);
	}



}
