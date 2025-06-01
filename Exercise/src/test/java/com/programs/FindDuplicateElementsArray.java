package com.programs;

public class FindDuplicateElementsArray {

	public static void main(String[] args) {

		String arr[] = { "java", "C++", "C++", "python", "cypress", "C#", "java" };

		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicates Found: " + arr[i]);
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("No Duplicates Found");
		}
	}
}
