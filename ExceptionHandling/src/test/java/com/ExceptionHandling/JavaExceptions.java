package com.ExceptionHandling;

public class JavaExceptions {

	public static void findSquare(int num) {
		
		int square=1;
		
		if (num>0) {
			square = num*num;
		}
		else {
				throw new ArithmeticException("Negative number given, Invalid input given ");
		}
		System.out.println(square);
	}
	
	public static void main(String[] args) {

		try {
		int num=-6;
		findSquare(num);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally { 
			System.out.println("Finally Block is Executed");
		}
		System.out.println("======Exceptions=======");
	
		try {
			String s1="abc";
			int parseInt = Integer.parseInt(s1);
			int c= parseInt+10;
			System.out.println(c);
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("Remaining 1000 line of codes");
		
		System.out.println("=====Arithmetic Exception======");
		
		try {
		int a=10;
		int b=a/0;
		System.out.println(b);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Remaining 1000 line of codes");
		
		System.out.println("=====Null Pointer Exception======");
		
		try {
		String s=null;
		int length = s.length();
		System.out.println(length);
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("Exception Handled and remaining codes");
	}	
}