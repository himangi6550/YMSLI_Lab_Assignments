package com.q3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class q3 {
	public static void main(String[] args) {
		Employee emp=new Employee("Raj","12","Delhi",60000.0);
		try {
			serialisation(emp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			deserialisation();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static void serialisation(Employee emp) throws FileNotFoundException, IOException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("foo.txt")));
		oos.writeObject(emp);
		System.out.println("Serialization is done");
	}
	
	static void deserialisation() throws ClassNotFoundException, IOException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("foo.txt")));
		Employee emp=(Employee) ois.readObject();
		System.out.println("Deserialization is done");
		emp.display();
	}
	

}
