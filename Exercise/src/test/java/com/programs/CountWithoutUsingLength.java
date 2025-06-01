package com.programs;

public class CountWithoutUsingLength {

	public static void main(String[] args) {

		int count = 0;
		String str = "Software Test Engineer";
		char[] ch = str.toCharArray();
		for (char c : ch) {
			count++;
		}
		System.out.println("Count Without Using Length: " + count + "=" + str.length());
	}
}