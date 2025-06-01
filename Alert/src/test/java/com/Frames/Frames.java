package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebDriver frame = driver.switchTo().frame("singleframe");
		
		WebElement box = driver.findElement(By.xpath("//input[@type='text']"));
		box.sendKeys("Java Selenium");
		
		driver.switchTo().defaultContent();
		
		WebElement nestedFrames=driver.findElement(By.linkText("Iframe with in an Iframe"));
		nestedFrames.click();
		
		driver.switchTo().frame("Multiple");
		
		//driver.switchTo().parentFrame();
		
		
		
	}

}
