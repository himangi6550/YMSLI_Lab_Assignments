package com.q5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = 0;
		while (value != -1) {
			System.out.println("“Please enter a number or enter ‘-1’ if you want to quit");
			try {
				value = sc.nextInt();
				if (value == -1)
					break;
				if (value > 100)
					throw new Exception();
				if (value % 2 == 0)
					System.out.println("You have entered an even number");
				else
					System.out.println("You have entered an odd number");
			} catch (InputMismatchException ex) {
				System.out.println("You must enter an integer.");
				sc.nextLine();
			} catch (Exception ex) {
				System.out.println("Number can’t be greater than 100.");
				sc.nextLine();
			}

		}
		sc.close();

	}

}
