package com.q2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		File file = new File("story.txt");
		readFile(file);
		writeFile(file);		
	}
	
	private static String readFile(File file) {
		String line = null;
	
		try(BufferedReader br= new BufferedReader(new FileReader(file))){
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			System.out.println("File Read Successfully");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return line;
	}
	
	private static void writeFile(File file) {
		Scanner sc = new Scanner(System.in);
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
			System.out.println("Enter text to be written");
			String dataToBeWritten = sc.nextLine();
			bw.write(dataToBeWritten);
			System.out.println("File updated Succesfully");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
}
