package com.hyr.paralleltest;

import org.testng.annotations.Test;

public class TestClass4 {

	@Test
	public void testMethod12() {
		System.out.println("TestClass4>>testMethod12>>"+Thread.currentThread().getId());
	}
	@Test
	public void testMethod13() {
		System.out.println("TestClass4>>testMethod13>>"+Thread.currentThread().getId());
	}
	@Test
	public void testMethod14() {
		System.out.println("TestClass4>>testMethod14>>"+Thread.currentThread().getId());
	}
}
