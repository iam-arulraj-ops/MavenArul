package com.testng;

import org.testng.annotations.Test;

public class TestNG_TimeOut {

	@Test(timeOut = 2000)
	public void aMethod() throws InterruptedException {

		Thread.sleep(3000);

		System.out.println("A Method");
	}

	@Test
	public void bMethod() {

		System.out.println("B Method");
	}

}
