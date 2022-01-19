package com.q2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Account account = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter Account number");
		String accNumber = sc.next();
		System.out.println("Enter Account Balance");
		float accBalance = sc.nextFloat();
		System.out.println("Enter type Of account:" + "1. for Savings" + "2. for Current");
		int option = sc.nextInt();
		System.out.println("Enter NIC:");
		String nic = sc.next();
		System.out.println("Enter date :");
		int date = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		Date d = new Date(date, month, year);
		Owner owner = new Owner(name, d, nic);

		if (option == 1)
			account = new SavingsAccount(owner, accBalance, accNumber, 3);
		else {

			account = new CurrentAccount(10000);
		}
		System.out.println(account.getBalance());
		System.out.println(account.getOwner());
		sc.close();

	}
}