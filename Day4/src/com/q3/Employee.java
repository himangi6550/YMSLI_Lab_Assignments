package com.q3;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name,id;
	private String address;
	private transient double salary;
	public Employee(String name, String id, String address, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + ", salary=" + salary + "]";
	}
	
	public void display() {
		System.out.println("Name: "+ name +" ID: "+ id+" Address: "+address+" Salary: "+salary);
	}

}
