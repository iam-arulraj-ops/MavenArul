package com.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.browser.BrowserLaunch;

public class RunnerClass  {

	public static WebDriver driver;
	public static BrowserLaunch bl;

	@FindBy(id="email")
	public static WebElement username;
	
	
	
	public static void main(String[] args) {

		BrowserLaunch.browserLaunch1("CHrome");
		BrowserLaunch.url("https://www.facebook.com/");
		BrowserLaunch.getTitle();
		// id=email
	}
		
		//WebElement username = driver.findElement(By.id("email"));
		public static void user() {
			
			bl= new BrowserLaunch(driver);
		
		bl.elementInputs(username, "Arul123");
	}
	
}
