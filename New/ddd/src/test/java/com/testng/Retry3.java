package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Retry3 {

	@Test(retryAnalyzer = Retry2.class)
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/ajbckjbdsjbckjsdbkjbdskvjbjadsbvjbkvd");
	}
}
