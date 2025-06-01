package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_ParameterizationCrossBrowserExp {

	@Parameters({ "browser" })
	@BeforeClass
	public void browserLaunch(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {

			System.out.println("Chrome Browser Launched");
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.out.println("Internet Explorer Browser Launched");
		} else {
			System.out.println("Invalid Browser");
		}
	}

	@Test
	public void login() {
		System.out.println("Account Logged in");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Closed the browser");
	}
}
