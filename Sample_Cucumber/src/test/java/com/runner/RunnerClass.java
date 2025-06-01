package com.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Eclipse_Final\\Sample_Cucumber\\src\\test\\java\\com\\cucumber\\Sample_Cucumber.feature", glue = "StepDefinition"

)
public class RunnerClass {

	public static WebDriver driver;

	@BeforeTest
	public static void driverOpen() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}

	@AfterTest
	public static void tearDown() {
		driver.quit();
	}

}
