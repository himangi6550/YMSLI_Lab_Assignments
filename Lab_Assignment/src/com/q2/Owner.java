package com.q2;

public class Owner {
	private String name;
	private Date dateOfBirth;
	private String nic;

	public Owner() {
	}

	public Owner(String name, Date dateOfBirth, String nic) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.nic = nic;
	}

	public Owner(Owner owner) {
		this.name = owner.name;
		this.dateOfBirth = owner.dateOfBirth;
		this.nic = owner.nic;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Owner [name=").append(name).append(", dateOfBirth=").append(dateOfBirth).append(", nic=")
				.append(nic).append("]");
		return builder.toString();
	}

}