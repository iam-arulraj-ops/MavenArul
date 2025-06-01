package com.topics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(200);
		set.add(null);
		set.add(null);
		System.out.println("The output of the set values without duplicates: " + set);

		Set<Integer> set1 = new TreeSet<>();

		set1.add(10);
		set1.add(5);
		set1.add(25);
		set1.add(20);
		System.out.println("The output of the set1 values in sorted order is: " + set1);
	}
}