package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Sample {

	public static WebDriver driver;
	
	@Test(priority=0)
	public void setProperty() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(enabled=false)
	public void elements() {
		WebElement user=  driver.findElement(By.id("email"));
		user.sendKeys("Arul123");
	}
	@Test(priority=3)
	public void title() {
		String title=driver.getTitle();
		System.out.println("Page Title: "+title);
	}
}  