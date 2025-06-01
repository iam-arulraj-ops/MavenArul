package com.testng1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider {

	@DataProvider(name = "test")
	public Object[][] testData() {

		return new Object[][] {

				{ "arulraj123@gmail.com", "Greatest of all time" },
				{ "cyrilsebastian456@gmail.com", "Master the Blaster" },
				{ "ponasiramali123@gmail.com", "God is the master of all" },
				{ "sahayarajan678554@gmail.com", "Money making many things" } };
	}

	@Test(dataProvider = "test")
	public void aMethod(String email, String password) {

		System.out.println("Username is: " + email + ", Password is: " + password);
	}
}