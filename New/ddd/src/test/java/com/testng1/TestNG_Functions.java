package com.testng1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNG_Functions {

	@Test
	public void aMethod() {

		System.out.println("A Method");
	}

	@Test
	@Ignore
	public void bMethod() {

		System.out.println("B Method");
	}

	@Test(priority = -1)
	public void cMethod() {

		System.out.println("C Method");
	}

	@Test(enabled = false)
	public void dMethod() {

		System.out.println("D Method");
	}

	@Test
	public void eMethod() {

		System.out.println("E Method");
	}

	@Test(invocationCount = 5)
	public void fMethod() {

		System.out.println("F Method");
	}

	@Test(timeOut = 2000, invocationCount = 3)
	public void gMethod() throws InterruptedException {

		Thread.sleep(3000);
		System.out.println("G Method");
	}

	@BeforeMethod
	public void login() {
		System.out.println("Logged in");
	}

	@AfterMethod
	public void logout() {
		System.out.println("Logged out");
	}

}