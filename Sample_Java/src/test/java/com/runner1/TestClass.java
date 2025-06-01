package com.runner1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ITestListenerClass.class)
public class TestClass extends BaseClass {

	// if we use result.getTestName - we use @Test(testName="TestGoogle")
	@Test(priority = 0)
	public void testGoogle() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Vikram");
		Thread.sleep(3000);

	}

	@Test(priority = 1)
	public void testFacebook() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ArulTheGreat");
		driver.findElement(By.id("pass")).sendKeys("CyrilTheComrade");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "FB");
	}

	@Test(priority = 2)
	public void testAdactin() throws InterruptedException {
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("Daddy");
		driver.findElement(By.id("password")).sendKeys("Mummy");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "AD");

		
	}

}
