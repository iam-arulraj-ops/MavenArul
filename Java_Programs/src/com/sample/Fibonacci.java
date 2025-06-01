package com.sample;

public class Fibonacci {

	public static void main(String[] args) {

		int a=0;
		int b=1;
		int sum=0;
		System.out.print(a+","+b);
		for(int i=0;i<7;i++) {
			sum=a+b;
			System.out.print(","+sum);
			a=b;
			b=sum;
		}
	}

}
