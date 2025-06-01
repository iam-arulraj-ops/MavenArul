package com.sample;

public class Swapping2Numbers {

	public static void main(String[] args) {

		int a = 10, b = 20;

		System.out.println("Before Swapping 2 Numbers:" + a + "," + b);

		// Logic1 by using third variable

//		int t=a;
//		a=b;
//		b=t;
//		System.out.println("After Swapping 2 Numbers:"+a+","+b);
//	
		// Logic2 by using + and - using without third variable

//	a=a+b;
//	b=a-b;
//	a=a-b;
//	System.out.println("After Swapping 2 Numbers:"+a+","+b);

		//Logic3 by using * & / without using third variable, values should not be zero
		
//		a=a*b;
//		b=a/b;
//		a=a/b;
//
//		System.out.println("After Swapping 2 Numbers:"+a+","+b);
		
		//Logic4 by using bitwise XOR
//		
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		System.out.println("After Swapping 2 Numbers:"+a+","+b);
		
		//Logic5 by using a single statement
		
		b=a+b-(a=b);
		System.out.println("After Swapping 2 Numbers:"+a+","+b);
	}
}
