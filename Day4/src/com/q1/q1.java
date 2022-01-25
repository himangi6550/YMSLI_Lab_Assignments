package com.q1;

import java.io.File;
import java.io.FileInputStream;

public class q1 {
	private static byte[] readFile(File file)
	{
		byte[] arr = new byte[(int)file.length()];
		try(FileInputStream input = new FileInputStream(file)){
			//convert file into array of bytes
			input.read(arr);
			//Printing in byte format
			for(byte a: arr) {
				System.out.print(a);
			}
			System.out.println();
			//Printing in char format
			for(byte a: arr) {
				System.out.print((char)a);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		File file = new File("hello");
		readFile(file);
	}

}
