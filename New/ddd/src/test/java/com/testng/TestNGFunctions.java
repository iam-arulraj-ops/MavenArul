package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGFunctions {

	@Test(priority = -1)
	public void mobile() {
		System.out.println("Mobile is ordered");
	}

	@Test(timeOut = 2000, invocationCount = 4)
	public void laptop() throws InterruptedException {
		System.out.println("Laptop is ordered");
		Thread.sleep(3000);
		System.out.println("ThreadTimeOutException Occurs Before this test case is executed");
	}

	@Test(priority = 1, invocationCount = 5)
	public void books() {
		System.out.println("Books are ordered");
	}

	@Test
	@Ignore
	public void watch() {
		System.out.println("Watch is ordered");
	}

	@Test
	public void excludeMethod() {
		System.out.println("Excluding this method");
	}

	@BeforeMethod
	public void login() {
		System.out.println("login page");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout page");
	}

	@AfterTest
	public void tearDown() {
		System.out.println("Close the page");
	}

	@BeforeClass
	public void urlLaunch() {
		System.out.println("URL is launched");
	}

	@BeforeSuite
	public void browserLaunch() {
		System.out.println("Browser Launched");
	}
}