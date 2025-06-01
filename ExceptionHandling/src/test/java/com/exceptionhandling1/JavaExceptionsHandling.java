package com.exceptionhandling1;

public class JavaExceptionsHandling {

	public static void findSquare(int num) {

		int square = 1;

		if (num > 0) {
			square = num * num;
		} else {
			throw new ArithmeticException("Negative values given, Invalid input given");
		}
		System.out.println(square);
	}

	public static void main(String[] args) {

		try {
			int num = -6;
			findSquare(num);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally block is executed");
		}
		System.out.println("================Exceptions===========================");

		try {
			String s1 = "abc";
			int parseInt = Integer.parseInt(s1);
			int c = parseInt + 10;
			System.out.println(c);
		} catch (NumberFormatException n) {
			n.printStackTrace();
		}
		System.out.println("Remaining 1000 lines of codes");

		System.out.println("==========Null Pointer Exception================");

		try {
			String s2 = null;
			// System.out.println(s2);
			int length = s2.length();
			System.out.println(length);
		} catch (NullPointerException p) {
			p.printStackTrace();
		}
		System.out.println("=========Exception handled and remaining 1000 lines of codes executed");
	}
}