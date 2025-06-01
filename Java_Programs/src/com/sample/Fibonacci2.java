package com.sample;

public class Fibonacci2 {

	public static void main(String[] args) {

		int a=0;
		int b=1;
		int sum=0;
		
		System.out.print(a+","+b);
		for(int i=0;i<10;i++) {
			sum=a+b;
			System.out.print(","+sum);
			a=b;
			b=sum;
		}
	}

}
