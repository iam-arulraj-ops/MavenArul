package com.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("java", 1);
		map.put("python", 2);
		map.put("cypress", 3);
		map.put("angular", 4);
		// map.put("java", 5);

		System.out.println(map);

		int size = map.size();
		System.out.println("Size: " + size);

		Integer value = map.get("java");
		System.out.println("Value:" + value);

		Set<String> keySet = map.keySet();
		System.out.println("KeySet: " + keySet);

		Map<Integer, Integer> map1 = new HashMap<>();
		map1.put(5, 6);
		map1.put(7, 8);

		System.out.println("===========================");

		Set<Integer> keySet1 = map1.keySet();
		System.out.println("KeySet: " + keySet1);

		System.out.println("===========================");

		Collection<Integer> values = map.values();
		System.out.println("Values: " + values);

		boolean contains = map.containsKey("angular");
		System.out.println("Contains Key: " + contains);

		boolean containsValue = map.containsValue(2);
		System.out.println("Contains Value: " + containsValue);

		System.out.println("===================================");

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		System.out.println(entrySet);
		
		System.out.println("=====================================");
		
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 0) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}
		}
	}
}
