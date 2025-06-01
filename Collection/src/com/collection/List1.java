package com.collection;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(1000);
		list1.add(2000);

		System.out.println("List 1: " + list1);

		List<Integer> l2 = new ArrayList<>();

		l2.add(2);
		l2.add(3);
		l2.add(4);

		System.out.println("List 2: " + l2);

		list1.addAll(l2);
		System.out.println("After Adding list1 with list2: " + list1);

		list1.retainAll(l2);
		System.out.println("After retainall List1: " + list1);

		list1.removeAll(l2);
		System.out.println("After removeall List1: " + list1);

		List<String> l3 = new ArrayList<>();

		l3.add("CR7");
		l3.add("Messi10");
		l3.add("MSD7");
		l3.add("VK18");
		l3.add("SRT10");

		System.out.println("After using String Wrapper Class in an ArrayList: " + l3);

		List<Character> l4 = new ArrayList<>();

		l4.add('K');
		l4.add('I');
		l4.add('N');
		l4.add('G');

		System.out.println("After using Character Wrapper Class in an ArrayList: " + l4);

		List<Double> l5 = new ArrayList<>();

		l5.add(97.8);
		l5.add(10.2);
		l5.add(89.335);

		System.out.println("After using Double Wrapper Class in an ArrayList: " + l5);

		List<Float> l6 = new ArrayList<>();

		l6.add(97.85f);
		l6.add(67.7f);
		l6.add(58.98f);

		System.out.println("After using Float Wrapper Class in an ArrayList: " + l6);

		List<Long> l7 = new ArrayList<>();

		l7.add(1233l);
		l7.add((long) 123456789);
		l7.add(528749613l);

		System.out.println("After using Long Wrapper Class in an ArrayList: " + l7);

		List<Integer> l8 = new ArrayList<>();

		l8.add(100);
		l8.add(200);
		l8.add(300);

		System.out.println("After using Integer Wrapper Class in an ArrayList: " + l8);

		int size = l8.size();
		System.out.println("Size of l8: " + size);

		Integer integer = l8.get(1);
		System.out.println(integer);

//		Integer set = l8.set(2, 1000);
//		System.out.println(set);

		l8.set(1, 500);
		System.out.println(l8);

		boolean contains = l8.contains(500);
		System.out.println(contains);
	}
}