package com.java8.Q1;

import java.util.*;
import java.util.stream.Stream;

public class Q1 {
	private static Map<String, Integer> loadAllValues() {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("raj", 95);
		map.put("ekta", 75);
		map.put("rajiv", 85);
		map.put("sunita", 66);
		map.put("gunika", 99);
		
		System.out.println("------printing map------");
		//Set<Map.Entry<String, Integer>> entries = map.entrySet();
		return map;
	}
	public static void main(String[] args) {
		
//		Set<Map.Entry<String, Integer>> allValues=loadAllValues();
//		
//		Stream<Map.Entry<String, Integer>> entriesStream = allValues.stream();
//		entriesStream.forEach(System.out::println);
		Map<String, Integer> allValues=loadAllValues();
		
		// 1. print map using stream
		
		allValues.entrySet()
		.stream().forEach(e-> System.out.println(e));
		
		// 2. print only that recrods that contain key contains raj
		allValues
		.entrySet()
		.stream()
		.filter(k->k.getKey().contains("raj"))
		.forEach(e-> System.out.println(e));
		
		//3. print map sorted by key
		allValues.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(e-> System.out.println(e));
		
		// 4. print map sorted by values
		
		allValues.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(e-> System.out.println(e));
		
		// 5. print map reverse sorted by the key
		
		allValues.entrySet()
		.stream()
		.sorted((k1,k2)->k2.getKey().compareTo(k1.getKey()))
		.forEach(e-> System.out.println(e));
		
		
		
		
		
		
	}

}
