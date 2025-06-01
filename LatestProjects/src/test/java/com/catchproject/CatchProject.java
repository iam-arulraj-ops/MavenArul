package com.catchproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CatchProject {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.catch.com.au/");

//		driver.findElement(By.linkText("Today's Deals")).click();
//
//		String text = driver.getTitle();
//		System.out.println(text);

		Thread.sleep(3000);

		WebElement searchBox = driver.findElement(By.xpath("//input[@id='catch-app-:r0:']"));
		searchBox.sendKeys("Iphone 14");

		System.out.println("================Iphone search appearances=======================");

		List<WebElement> iphone = driver.findElements(By.xpath("//span[@class='css-1srv3io ehnxcr60']"));

		for (WebElement i : iphone) {
			System.out.println(i.getText());
		}
	}

}
