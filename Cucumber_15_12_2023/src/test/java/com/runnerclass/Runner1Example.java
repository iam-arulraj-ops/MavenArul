package com.runnerclass;

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
@CucumberOptions(features = "C:\\Eclipse_Final\\Cucumber_15_12_2023\\src\\test\\java\\com\\featurefile\\CucumberExample.feature", glue = "com.stepdefinition1", dryRun = false, monochrome = true, plugin = {
		"html:ReportFolder1/htmlreport.html", "json: ReportFolder1/jsonreport.json", "pretty",
// "com.cucumber.listener.ExtentCucumberFormatter:
// ReportFolder1/extentreport.html"
})
public class Runner1Example {

	public static WebDriver driver;

	@BeforeClass
	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
