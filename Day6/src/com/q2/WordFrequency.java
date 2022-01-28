package com.q2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequency {
	public static void main(String[] args) {
		int frequency = 0;

		Map<String, Integer> map = new TreeMap<String, Integer>();
		try (BufferedReader br = new BufferedReader(new FileReader(new File("story.txt")))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split(" ");
				for (String word : tokens) {
					if (map.containsKey(word)) {
						frequency = map.get(word);
						map.put(word, frequency + 1);
					} else
						map.put(word, 1);

				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " appear " + entry.getValue());
		}
	}
}
