package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String url="https://www.flipkart.com/";
			driver.get(url);
			
			WebElement close = driver.findElement(By.xpath("//span[@role='button']"));
			close.click();
			
			WebElement searchBox= driver.findElement(By.name("q"));
			searchBox.sendKeys("iphone");

			WebElement search= driver.findElement(By.xpath("//button[@type='submit']"));
			search.click();
			
			List<WebElement> iphoneList= driver.findElements(By.xpath("//div[@class='col col-7-12']"));
			
			System.out.println("Iphone List");

			for(WebElement list:iphoneList) {
				
				System.out.println("Iphone models");
				
				System.out.println(list.getText());
			}
	}
}
