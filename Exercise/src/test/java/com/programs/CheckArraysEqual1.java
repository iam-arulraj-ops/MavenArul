package com.programs;

import java.util.Arrays;

public class CheckArraysEqual1 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

//		boolean status = Arrays.equals(arr, arr1);
//
//		if (status == true) {
//			System.out.println("Arrays are equal");
//		} else {
//			System.out.println("Arrays are not equal");
//		}

		boolean status = true;
		if (arr.length == arr1.length) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != arr1[i]) {
					status = false;

				}
			}
		} else {
			status = false;
		}
		if (status == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
	}
}