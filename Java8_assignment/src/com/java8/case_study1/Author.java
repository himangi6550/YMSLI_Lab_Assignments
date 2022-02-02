package com.java8.case_study1;

public class Author {
	private String name;
	private String lastName;
	private String country;
	public Author(String name, String lastName, String country) {
//		super();
		this.name = name;
		this.lastName = lastName;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Author [name=").append(name).append(", lastName=").append(lastName).append(", country=")
				.append(country).append("]");
		return builder.toString();
	}
	

}
