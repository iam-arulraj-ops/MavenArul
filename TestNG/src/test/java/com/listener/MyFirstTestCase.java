package com.listener;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.listener.TestNG_Listener.class)
public class MyFirstTestCase {

@Test
public void GoogleTitleVerify() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.google.co.in");
	System.out.println(driver.getTitle());
	driver.quit();
}
@Test
public void titleMatch() {
	System.out.println("Dummy Test 2");
	Assert.assertTrue(false);
	
}
}
