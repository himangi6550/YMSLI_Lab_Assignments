package com.q5;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfWheel, noOfPassenger, model, noOfDoor;
		String make, isHoodOpen;

		System.out.println("Enter make: ");
		make = sc.nextLine();
		System.out.print("Enter model: ");
		model = sc.nextInt();
		System.out.println("Enter no. of Wheels: ");
		noOfWheel = sc.nextInt();
		System.out.println("Enter no. of Passengers: ");
		noOfPassenger = sc.nextInt();
		System.out.println("Enter no. of Doors: ");
		noOfDoor = sc.nextInt();
		
		System.out.println("Enter 1 for Vehicle , 2 for Car, 3 for Convertible, 4 for SportCar:");
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			Vehicle vehicle = new Vehicle(noOfWheel, noOfPassenger, model, make);
			vehicle.display();
			break;
		case 2:
			Car car = new Car(noOfWheel, noOfPassenger, model, make, noOfDoor);
			car.display();
			break;
		case 3:
			System.out.println("Is Hood Open? [Yes/No]");
			isHoodOpen = sc.nextLine();
			boolean hoodOpen = isHoodOpen.equalsIgnoreCase("yes") ? true : false;
			Convertible convertible = new Convertible(noOfWheel, noOfPassenger, model, make, noOfDoor, hoodOpen);
			convertible.display();
			break;
		case 4: 
			SportCar sports = new SportCar(noOfWheel,noOfPassenger,model,make,noOfDoor);
			sports.display();
			break;
		default: 
			System.out.println("Invalid Choice");
		}
		
		sc.close();
	}

}
