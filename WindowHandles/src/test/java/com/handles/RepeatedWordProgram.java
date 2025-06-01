package com.handles;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWordProgram {

	public static void main(String[] args) {

		String s1 = "this topic is all about java and java is a platform independent because java is a object oriented programming language in which the topic deals with selenium";

		String[] words = s1.split(" ");

		Map<String, Integer> map = new HashMap<>();

		for (String w : words) {

			if (map.containsKey(w)) {

				Integer it = map.get(w);
				map.put(w, it + 1);

			} else {
				map.put(w, 1);
			}
		}
		System.out.println("Occurence of each word: " + map);

		System.out.println("Only Unique words: " + map.keySet());

		System.out.println("Repeated words in a given string: ");

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		for (Entry<String, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}
		}

		Map<String, Integer> map1 = new LinkedHashMap<>();

		for (String w : words) {

			if (map1.containsKey(w)) {

				Integer it1 = map1.get(w);
				map1.put(w, it1 + 1);

			} else {
				map1.put(w, 1);
			}
		}
		System.out.println("Occurence of each word in insertion order: " + map1);

		System.out.println("Only Unique words in insertion order: " + map1.keySet());

		System.out.println("Repeated words or duplicate (first element) in insertion string order: ");

		Set<Entry<String, Integer>> entrySet2 = map1.entrySet();

		for (Entry<String, Integer> entry2 : entrySet2) {

			if (entry2.getValue() > 1) {

				System.out.println(entry2.getKey() + "=" + entry2.getValue());
				break;
			}
		}
	}
}