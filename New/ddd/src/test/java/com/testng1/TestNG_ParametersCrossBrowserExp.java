package com.testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_ParametersCrossBrowserExp {

	@BeforeClass
	@Parameters({ "browser" })
	public void browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Launching the chrome browser");
		} else if (browser.equalsIgnoreCase("edge")) {
			System.out.println("Launching the Microsoft edge browser");
		} else {
			System.out.println("Invalid browser");
		}
	}

	@Test
	public void login() {
		System.out.println("Logged in");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Close the browser");
	}

}
