package com.testng1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider1 {


	@Test(dataProvider = "firsttestcase")
	public void aMethod(String name, String mob) {
		
		System.out.println("Username is: "+name+", Mobile Number: "+mob);
	}
	
	@DataProvider(name="firsttestcase")
	public Object[][] testData() {

		return new Object[][] {
			
			{"arulraj","8667757037"},{"cyril sebastian","8778915337"},
			{"amali", "6369924156"},{"sahayarajan","8778649871"}};
		
	}
}
