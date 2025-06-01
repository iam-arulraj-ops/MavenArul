package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider {

	@Test(dataProvider = "test1")
	public void aMethod(String name, String password) {

		System.out.println("Username is :" + name + " Password is :" + password);
	}

	@DataProvider(name = "test1")
	public Object[][] testData() {

		return new Object[][] {

				{ "arulraj123@gmail.com", "123456789" }, { "sahayarajan456@gmail.com", "9876543210" },
				{ "ponasiramali5823146@gmail.com", "547889321232" } };
	}

}
