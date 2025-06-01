package com.testng1;

import org.testng.annotations.Test;

public class TestNG_Groups {

	@Test(groups = "test1")
	public void aMethod() {
		System.out.println("A Method is executed");
	}

	@Test(groups = "test2")
	public void bMethod() {
		System.out.println("B Method is executed");
	}

	@Test(groups = "test3")
	public void cMethod() {
		System.out.println("C Method is executed");
	}

	@Test(groups = { "test1", "test2", "test3" })
	public void dMethod() {
		System.out.println("D Method is executed");
	}

	@Test(groups = "test1")
	public void eMethod() {
		System.out.println("E Method is executed");
	}
}