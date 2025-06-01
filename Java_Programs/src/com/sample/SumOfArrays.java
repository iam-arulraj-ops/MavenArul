package com.sample;

public class SumOfArrays {

	public static void main(String[] args) {

		int a[]= {1,3,5,7};
		
		int sum=0;
		
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//		}
//		System.out.println("Sum of arrays: "+sum);
		
		for(int value:a) {
			sum=sum+value;
		}
			System.out.println(sum);
		}
	}


