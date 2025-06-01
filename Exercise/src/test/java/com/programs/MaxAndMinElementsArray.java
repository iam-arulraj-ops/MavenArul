package com.programs;

public class MaxAndMinElementsArray {

	public static void main(String[] args) {

		int a[] = { 10, 9, 15, 18, 17, 25, 20, 50, 75, 100 };

		int max = a[0];

		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
