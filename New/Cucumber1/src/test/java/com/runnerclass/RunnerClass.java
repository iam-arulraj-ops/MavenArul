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
@CucumberOptions(features = "C:\\Eclipse_Final\\New\\Cucumber1\\src\\test\\java\\com\\featurefile\\Cucumber.feature", glue = "com.stepdefinition", dryRun = false, monochrome = true, plugin = {
		"pretty", "html:ReportFolder/html_Report", "json:ReportFolder/json_Report.json",
// "com.cucumber.listener.ExtentCucumberFormatter:ReportFolder/Extent_Report.html"
})
public class RunnerClass {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {

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