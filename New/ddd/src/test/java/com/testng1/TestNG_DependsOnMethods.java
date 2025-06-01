package com.testng1;

import org.testng.annotations.Test;

public class TestNG_DependsOnMethods {

	@Test
	public void aMethod() {

		System.out.println("A Method");
	}

	@Test(dependsOnMethods = "cMethod")
	public void bMethod() {

		System.out.println("B Method");
	}

	@Test(dependsOnMethods = "aMethod")
	public void cMethod() {

		int a = 10 / 0;

		System.out.println("C Method");
	}
}
