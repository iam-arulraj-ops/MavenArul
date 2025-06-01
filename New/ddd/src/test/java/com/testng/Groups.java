package com.testng;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups = "Ecom")
	private void amazon() {

		System.out.println("E-commerce domain");
	}

	@Test(groups = "Ecom")
	private void flipkart() {

		System.out.println("E-commerce domain");
	}

	@Test(groups = "Music")
	private void spotify() {

		System.out.println("Music, Podcast");
	}

	@Test(dependsOnGroups = "Ecom")
	private void shopee() {

		System.out.println("E-commerce domain");
	}

}
