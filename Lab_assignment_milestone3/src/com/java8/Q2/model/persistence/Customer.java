package com.java8.Q2.model.persistence;

import java.sql.Date;

public class Customer {
	private int id;
	private String name;
	private String address;
	private String phone;
	private Date date;
	public Customer(String name, String address, String phone, Date date) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.date = date;
	}
	
	public Customer(int id, String name, String address, String phone, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.date = date;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=").append(id).append(", name=").append(name).append(", address=").append(address)
				.append(", phone=").append(phone).append(", date=").append(date).append("]");
		return builder.toString();
	}

}
