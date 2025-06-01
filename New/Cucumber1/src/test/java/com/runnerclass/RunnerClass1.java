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
@CucumberOptions(features = "C:\\Eclipse_Final\\New\\Cucumber1\\src\\test\\java\\com\\featurefile\\CucumberString.feature", glue = "com.stepdefinition1", dryRun = false, monochrome = true, plugin = {
		"pretty", "html:ReportFolder/html_Report", "json:ReportFolder/json_Report.json"
// "com.cucumber.listener.ExtentCucumberFormatter:ReportFolder/Extent_Report.html"
})
public class RunnerClass1 {

	public static WebDriver driver3;

	@BeforeClass
	public static void setup() {

		WebDriverManager.chromedriver().setup();
		driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void tearDown() {
		driver3.quit();
	}
}	