package com.BaseClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adactin extends Base_All{

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
    
		
		driver = browserLaunch("chrome");
		url("https://adactinhotelapp.com/");
		WebElement username =  driver.findElement(By.id("username"));
		inputElement(username, "arulraj0997");
		WebElement password = driver.findElement(By.id("password"));
		inputElement(password, "Improvement456");
		WebElement login = driver.findElement(By.id("login"));
		clickOnElement(login);
		//driver.close();
		Screenshot("Adactin2");
	}

}
