package com.reprograms;

public class CountWithoutUsingLength {

	public static void main(String[] args) {

		int count = 0;
		String str = "Arul";
		char c[] = str.toCharArray();
		for (char ch : c) {
			count++;
		}
		System.out.println("Count without using length: " + count + "=" + str.length());
	}
}