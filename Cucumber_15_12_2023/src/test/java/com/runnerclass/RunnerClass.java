package com.runnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Eclipse_Final\\Cucumber_15_12_2023\\src\\test\\java\\com\\featurefile\\Cucumber.feature",glue="com.stepdefinition",
monochrome=true,
dryRun=false,
plugin= {"html:ReportFolder/htmlreport.html",
		"pretty",
		"json:ReportFolder/jsonReport.json",
		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:ReportFolder/ExtentReport.html"
})

public class RunnerClass {

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