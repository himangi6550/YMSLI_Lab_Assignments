package com.q3;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Account account = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name and account type(Curr/Sav)");
		String name = sc.next();
		String sav = sc.next();
		double initialBalance = sc.nextDouble();
		if (sav.contentEquals("Sav"))
			account = new SavingsAccount(name, initialBalance);
		else {
			System.out.println("Enter Trade Licence Number");
			String tradeLicence = sc.next();
			account = new CurrentAccount(name, initialBalance, tradeLicence);
		}
		while (true) {
			System.out.println("1 for deposit money");
			System.out.println("2 for withdraw money");
			System.out.println("3 for display balance");
			System.out.println("4 for exit");
			int opt = sc.nextInt();
			double amount;
			switch (opt) {
			case 1:
				System.out.println("Enter amount to be deposited:");
				amount = sc.nextDouble();
				// account.deposit(amount);
				System.out.println("Wanna know the balance?(Yes/No)");
				String resp1 = sc.next();
				if (resp1.contentEquals("Yes")) {
					System.out.println("Amount before deposit:" + account.getAccountBalance());
					account.deposit(amount);
					System.out.println("Amount after deposit:" + account.getAccountBalance());
				} else
					account.deposit(amount);
				break;

			case 2:
				System.out.println("Enter amount to be withdrawn:");
				amount = sc.nextDouble();
				System.out.println("Wanna know the balance?(Yes/No)");
				String resp = sc.next();

				if (resp.contentEquals("Yes")) {
					System.out.println("Amount before deposit:" + account.getAccountBalance());
					if (sav.contentEquals("Sav"))
						account.withdraw(amount);
					else
						account.withdraw(amount);
					System.out.println("Amount after deposit:" + account.getAccountBalance());
				} else if (sav.contentEquals("Sav"))
					account.withdraw(amount);
				else
					account.withdraw(amount);
				break;

			case 3:
				System.out.println("Account Balance: " + account.getAccountBalance());
				break;

			default:
				System.exit(0);
			}

		}
	}
}
