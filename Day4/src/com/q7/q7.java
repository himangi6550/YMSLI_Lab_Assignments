package com.q7;

import java.io.IOException;
public class q7 {
	public static void throwException() throws IOException {
		throw new IOException();
	}
	
	public static void main(String[] args) {
		try {
			throwException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
