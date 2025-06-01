package com.java;

import java.util.HashMap;
import java.util.Set;

public class Mappings {

	public static void main(String[] args) {

		String str = "the the a a a yes the yes go";

		HashMap<String, Integer> map = new HashMap<>();

		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			String word = words[i];

			if (map.containsKey(word)) {
				int count = map.get(word);
				count++;
				map.replace(word, count);
			} else {
				map.put(word, 1);
			}}

		Set<String> value = map.keySet();

		for (String v : value) {
			System.out.println(v + " " + map.get(v));
		}
		
		//	System.out.println(map);
		
	}

}
