package com.programs;

import java.util.HashSet;

public class FindDuplicatesElementsArray {

	public static void main(String[] args) {

		String[] arr = { "java", "python", "cypress", "java", "selenium" };

//		boolean flag = false;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					System.out.println("Duplicates Found: " + arr[i]);
//					flag = true;
//				}
//			}
//		}
//		if (flag == false) {
//			System.out.println("Duplicates not Found");
//		}

		HashSet<String> set = new HashSet<>();

		boolean flag = false;
		for (String l : arr) {
			if (set.add(l) == false) {
				System.out.println("Duplicates found: " + l);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("No Duplicates Found");
		}
	}
}