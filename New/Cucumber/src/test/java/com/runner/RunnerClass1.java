package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Eclipse_Final\\New\\Cucumber\\src\\test\\java\\com\\featurefile\\Cucumber1.feature", glue = "com.stepdefinition", dryRun = false, monochrome = true, plugin = {
		"html:ReportFolder1/htmlreport.html", "json:ReportFolder1/jsonreport.json", "pretty",
		//"com.cucumber.listener.ExtentCucumberFormatter:ReportFolder1/Cucumber_Extent_Report.html" 
})
public class RunnerClass1 {

	public static WebDriver driver;

	@BeforeClass
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}