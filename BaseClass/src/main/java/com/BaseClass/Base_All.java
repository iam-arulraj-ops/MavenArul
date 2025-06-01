package com.BaseClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_All {

	 public static WebDriver driver;
		
     
	 public  static WebDriver browserLaunch(String browser) {
		 if(browser.equalsIgnoreCase("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		 }
		 else if(browser.equalsIgnoreCase("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		 }
		 return driver;
	 }
	 
	
	 public static void url(String url) {
		  driver.get(url);
	 }
	
	 public static void inputElement(WebElement ele, String val) {
		 ele.sendKeys(val);
	 }
	 	
	 public static void clickOnElement(WebElement ele) {
		 ele.click();
	 }
	
	 public static void Screenshot(String name) throws IOException {
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Eclipse_Final\\BaseClass\\Screenshot\\"+name+".png");
		 FileUtils.copyFile(source, dest);
	 }
}

