package com.runner1;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static String screenshotsSubFolderName;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	//Dependency Injection
	@AfterMethod
	public void screenshotCapture(ITestResult result) {
		if (result.getStatus()==ITestResult.FAILURE) {
			captureScreenshot(result.getTestContext().getName()+"_"+result.getMethod().getMethodName());
			
		}
	}	

	public void captureScreenshot(String fileName) {
		if (screenshotsSubFolderName == null) {
			LocalDateTime myDateObj = LocalDateTime.now();
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			screenshotsSubFolderName = myDateObj.format(myFormatObj);
	}
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File Dest  =  new File("./Screenshots2/"+screenshotsSubFolderName+"/"+fileName+".png");
		try {
			FileUtils.copyFile(src, Dest);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Screenshot saved Successfully");
	}}