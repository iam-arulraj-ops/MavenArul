package com.reprograms;

public class MaxAndMinElementsArray1 {

	public static void main(String[] args) {

		int arr[] = { 1000, 999, 997 };

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}