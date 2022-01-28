package com.q4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class BiggestDouble {
	public static void main(String[] args) {

		String line = null;
		double val, large = 0.0;
		try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
			while ((line = br.readLine()) != null) {
				val = Double.parseDouble(line);
				if (val > large)
					large = val;
			}
			System.out.println(large);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
