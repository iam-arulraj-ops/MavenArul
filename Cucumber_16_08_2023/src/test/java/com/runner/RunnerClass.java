package com.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\Cucumber.feature", glue = "com.stepdefinition", dryRun = false, monochrome = true)
public class RunnerClass {
//

	public static WebDriver driver;

//	
//	@BeforeClass
//	public static void browser(WebDriver driver) {
//		
//		//driver=("chrome");
//		driver=driver;
//		
//	
//	}
//	private void na() {
//
//		System.out.println("Nandhini");
//	}
//	
//	
	@BeforeClass
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}