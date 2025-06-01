package com.runner;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener.class)
public class Test1 {

	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	@Test
	public void test2() {
		System.out.println("Test 2");
		Assert.assertTrue(false);
	}
	@Test(timeOut=1000)
	public void test3() throws Exception {
		Thread.sleep(2000);
		System.out.println("Test 3");
	}
	@Test(dependsOnMethods = "test3")
	public void test4() {
		System.out.println("Test 4");
	}
	@Test
	public void test5() {
		System.out.println("Test 5");
	}
}
