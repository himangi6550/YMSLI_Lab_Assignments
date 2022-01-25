package com.q4;

import java.io.BufferedReader;
import java.io.FileReader;

public class BiggestDouble {
	public static void main(String[] args) {
		String line = null;
		double val;
		try(BufferedReader br= new BufferedReader(new FileReader("data.txt"))){
			while((line=br.readLine())!=null) {
				val=Double.parseDouble(line);
				
				System.out.println(val);
			}
			System.out.println("File Read Successfully");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
