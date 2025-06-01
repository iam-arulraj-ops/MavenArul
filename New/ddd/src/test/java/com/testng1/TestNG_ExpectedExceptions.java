package com.testng1;

import org.testng.annotations.Test;

public class TestNG_ExpectedExceptions {

	@Test(expectedExceptions = ArithmeticException.class)
	public void aMethod() {

		int a = 1 / 0;

		System.out.println("A method");
	}

	@Test
	public void bMethod() {

		System.out.println("B method");
	}
}