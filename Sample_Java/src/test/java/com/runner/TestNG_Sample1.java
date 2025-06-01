package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Sample1 {

	public static WebDriver driver;
	
	@Test(priority=-1)
	public void browserLaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	@Test(priority=0)
	public void keys() {
		WebElement pass = driver.findElement(By.name("q"));
		pass.sendKeys("Marvel");
	}
}
