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
@CucumberOptions(features ="C:\\Eclipse_Final\\New\\Cucumber\\src\\test\\java\\com\\featurefile\\Testing.feature",glue="com.stepdefinition")
public class RunnerClass2 {

	public WebDriver driver;
	
@BeforeClass
public void setup() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@AfterClass
public void tearDown() {
	driver.quit();
}
}
