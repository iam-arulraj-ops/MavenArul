package com.testng;

import org.testng.annotations.Test;

public class TestNGFunctionsDependsOnMethods {

	@Test
	public void aMethod() {

		int a = 1 / 0;

		System.out.println("A Method");
	}

	@Test(dependsOnMethods = "cMethod")
	public void bMethod() {
		System.out.println("B Method");
	}

	@Test(dependsOnMethods = "aMethod")
	public void cMethod() {
		System.out.println("C Method");
	}

}
