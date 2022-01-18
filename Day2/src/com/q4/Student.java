package com.q4;

public class Student {
	private String name, id;
	private double grade;

	public Student(String name, String id, double grade) {
		this(name,id);
		this.grade=grade;

	}

	public Student(String name, String id) {
		this(id);
		this.name=name;

	}

	public Student(String id) {
		this.id=id;

	}

	public void display() {
		if (id != null)
			System.out.print(id+" ");
		if (name != null)
			System.out.print(name+" ");
		if(grade !=0.0)
			System.out.print(grade+" ");
		System.out.println();

	}

	public void display(int yearOfStudy) {
		this.display();
		System.out.println(yearOfStudy);

	}

}
