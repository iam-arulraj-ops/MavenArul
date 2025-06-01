package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://datatables.net/");
		
		List<WebElement>london = driver.findElements(By.xpath("//td[text()='London']/preceding-sibling::td[1]"));

		for(WebElement l:london) {
			System.out.println("London :"+l.getText());
		}
			WebElement softwareTester= driver.findElement(By.xpath("(//td[text()='London']/preceding-sibling::td)[6]"));
			
			System.out.println("Tester in London: "+ softwareTester.getText());
}}