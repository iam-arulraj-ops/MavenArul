package com.interview;

public class ReverseString {

	public static void main(String[] args) {

		String str = "my name is Arul";

		// String str1="";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
