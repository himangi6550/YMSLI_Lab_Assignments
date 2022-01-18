package com.q5;

public class Convertible extends Car{
	private boolean isHoodOpen;
	
	
	public Convertible(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor, boolean isHoodOpen) {
		super(noOfWheel, noOfPassenger, model, make, noOfDoor);
		this.isHoodOpen = isHoodOpen;
	}
	
//	@Override
	public void display() {
		super.display();
		System.out.println("Hood Open: "+isHoodOpen);
		
	}

}
