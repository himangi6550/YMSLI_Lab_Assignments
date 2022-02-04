package com.java8.Q1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StudentTest {
	private static Map<Student, Integer> loadAllStudents() {
		Map<Student, Integer> map=new HashMap<>();
		map.put(new Student(109, "keta", 95), 95);
		map.put(new Student(61, "raj", 78), 78);
		map.put(new Student(11, "gunika", 98), 98);
		map.put(new Student(19, "keshav", 97), 97);
		
		System.out.println("------printing map------");
		//Set<Map.Entry<String, Integer>> entries = map.entrySet();
		return map;
	}
	
	public static void main(String[] args) {
		
		Map<Student, Integer> allStudents=loadAllStudents();
		
		// Print all records sorted as per name of the student
		System.out.println("------1------");
		allStudents.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName)))
		.forEach(e-> System.out.println(
				e.getKey()
				+" : "+e.getValue()));
		
		//  Print all records as per id of the student
		System.out.println("------2------");
		allStudents.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getId)))
		.forEach(e-> System.out.println(
				e.getKey()
				+" : "+e.getValue()));
	}

}
