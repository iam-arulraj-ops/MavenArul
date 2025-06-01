package com.sample;

public class EvenOddFromArray {

	public static void main(String[] args) {

		int [] a= {1,2,3,4,5,6};
		
		System.out.println("Printing Even Numbers from Array(for loop)");
		
		for(int  i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Printing Even Numbers from Array(for each loop)");
		
		for(int value:a) {
			if(value%2==0) {
				System.out.println(value);
			}
		}
		System.out.println("Printing Odd Numbers from Array(for loop)");
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
				
			}
		}
		System.out.println("Printing Odd Numbers from Array(for each loop)");
		
		for(int value:a) {
			if(value%2!=0) {
				System.out.println(value);
			}
		}
	}

}
