package com.topics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);

		System.out.println(list);

		List<Integer> list1 = new ArrayList();

		list1.add(400);
		list1.add(500);
		System.out.println(list1);
		list1.addAll(list);

		System.out.println("After adding the list with list1: " + list1);

		Collections.sort(list1);

		System.out.println("After sorting using collections: " + list1);

		list.retainAll(list1);
		System.out.println(list);

		System.out.println("==========After removing:========");
		list.removeAll(list1);
		System.out.println(list);
	}
}