package com.q1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class FIlereader {

	public static void main(String args[]) {
		ArrayList<Merchandise> merchandise = new ArrayList<>();
		try (BufferedReader read = new BufferedReader(new FileReader("input.dat"))) {
			String str = null;
			while ((str = read.readLine()) != null) {
				String[] element = str.split(" ");
				merchandise
						.add(new Merchandise(element[0], Integer.parseInt(element[1]), Double.parseDouble(element[2])));
			}
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		for (Merchandise merch : merchandise) {
			merch.print();
		}
		Collections.sort(merchandise, new SortingAsPerName());
		System.out.println("Sorting by Name");
		for (Merchandise merch : merchandise) {
			merch.print();
		}
		Collections.sort(merchandise, new SortingAsPerPrice());
		System.out.println("Sorting by Price");
		for (Merchandise merch : merchandise) {
			merch.print();
		}
	}
}