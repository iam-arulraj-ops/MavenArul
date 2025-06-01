package com.pg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {

	Search_Page pg;
	WebDriver driver;
	@BeforeTest
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void searchOperations() {
		pg= new Search_Page(driver);
		pg.searchGoogle("gmail");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
