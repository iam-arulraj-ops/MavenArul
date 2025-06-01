package com.runnerfinal;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Eclipse_Final\\New\\Cucumber\\src\\test\\java\\com\\featurefilefinal\\final.feature",glue="com.stepdefinitionfinal",monochrome=true, dryRun=false, plugin= {
		"html:ReportFolderFinal/htmlreport.html","pretty","json:ReportFoderFinal/jsonreport.json"
})
public class RunnerClassFinal {

	public static WebDriver driver;
	
	@org.junit.BeforeClass
	public static void browserLaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	}
	
	@AfterClass
public static void tearDown() {
		driver.quit();
	}
}
