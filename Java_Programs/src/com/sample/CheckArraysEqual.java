package com.sample;

import java.util.Arrays;

public class CheckArraysEqual {

	public static void main(String[] args) {

		int a1[] = { 1, 3, 5, 7, 9 ,8};
		int a2[] = { 1, 3, 5, 7, 9 ,8};

//		boolean status = Arrays.equals(a1, a2);
//
//		if (status == true)
//			System.out.println("Arrays are equal");
//		else
//			System.out.println("Arrays are not equal");
//	

	boolean status = true;
	if(a1.length==a2.length) {
		for(int i=0;i<a1.length;i++) {
			if(a1[i]==a2[i]) {
				//status=false;
			}
			}
		}
	
	else {
		status=false;
		
	}
	if(status==true) {
		System.out.println("Arrays are equal");
		
	}
	else
		System.out.println("Arrays are not equal");
	}

}
