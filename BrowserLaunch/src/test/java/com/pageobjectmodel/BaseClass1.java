package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

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
	
	public static void dropDownSelectByIndex(WebElement target,int index) {
	Select s= new Select(target);
	s.selectByIndex(index);
	}
	
	public static void dropDownSelectByVisibleText(WebElement target,String text) {
		Select s= new Select(target);
		s.selectByVisibleText(text);
	}
	public static void dropDownSelectByValue(WebElement target,String value) {
		Select s= new Select(target);
		s.selectByValue(value);
	}
	
	public static void main(String[] args) throws Throwable{

	}
//		browserLaunch("chrome");
}	
	

