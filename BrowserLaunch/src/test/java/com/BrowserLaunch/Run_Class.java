package com.BrowserLaunch;

import org.openqa.selenium.WebDriver;

public class Run_Class extends BaseClass{

	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {

		
		driver=browserLaunch("chrome");
		
		ConfigurationReader c = new ConfigurationReader();
		urlLaunch(c.url());
//		inputElements(null, null)
//		clickOnElement(click);
		Login_Page b= new Login_Page(driver);

		inputElements(b.getMail(),c.username());
		inputElements(b.getPass(),c.pass());
		clickOnElement(b.getClick());
		System.out.println("========Success Message=========");
	}
}