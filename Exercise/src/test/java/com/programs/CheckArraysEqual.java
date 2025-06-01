package com.programs;

import java.util.Arrays;

public class CheckArraysEqual {

	public static void main(String[] args) {

		int[] a1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] a2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//
//		boolean status = Arrays.equals(a1, a2);
//		if (status == true) {
//			System.out.println("Arrays are equal");
//		} else {
//			System.out.println("Arrays are not equal");
//		}
		
		boolean status = true;
		if(a1.length==a2.length) {
			for(int i=0;i<a2.length;i++) {
				if(a1[i]!=a2[i]) {
					status=false;
				}
			}
		}
		if(status==false) {
			System.out.println("Arrays are not equal");
		}
		else {
			System.out.println("Arrays are equal");
		}
	}
}