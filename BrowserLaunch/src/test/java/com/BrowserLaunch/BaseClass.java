package com.BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;


	public static  WebDriver browserLaunch(String browser) {
		
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
			
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();	
	}

		else if(browser.equalsIgnoreCase("ie")) {
			
			
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();	

		}

		return driver;
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	
	public static void inputElements(WebElement ele,String value) {
		
		ele.sendKeys(value);
		
	}
	
	public static void clickOnElement(WebElement c) {
		c.click();
	}
	public static void main(String[] args) throws Throwable{

	}
//		browserLaunch("chrome");
}	
	

