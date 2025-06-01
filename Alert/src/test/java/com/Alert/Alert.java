package com.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		WebElement alert = driver.findElement(By.name("alertbox"));
		alert.click();
		
		driver.switchTo().alert().accept();
		
		WebElement confirmAlert = driver.findElement(By.name("confirmalertbox"));
		confirmAlert.click();
	
		System.out.println(driver.switchTo().alert().getText());
	
		driver.switchTo().alert().accept();
		
		WebElement promptAlert=driver.findElement(By.name("promptalertbox1234"));
		promptAlert.click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys("Java With Selenium");
		driver.switchTo().alert().accept();
		System.out.println("DONE");
	}
}