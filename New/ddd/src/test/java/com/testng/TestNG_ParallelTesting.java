package com.testng;

import org.testng.annotations.Test;

public class TestNG_ParallelTesting {

	@Test
	public void aMethod() throws InterruptedException {

		Thread.sleep(2000);
		System.out.println("A Method");
	}

	@Test
	public void bMethod() throws InterruptedException {

		Thread.sleep(2000);
		System.out.println("B Method");
	}

}
