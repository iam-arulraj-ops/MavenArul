package com.testng1;

import org.testng.annotations.Test;

public class TestNG_Timeout {

	@Test(timeOut = 3000)
	public void aMethod() throws InterruptedException {

		Thread.sleep(4000);

		System.out.println("A Method");
	}

	@Test
	public void bMethod() {

		System.out.println("B Method");
	}
}