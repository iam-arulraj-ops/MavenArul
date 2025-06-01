package com.handles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) {

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		WebElement drag = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		
		WebElement drop = driver.findElement(By.id("trash"));
		
		Actions ac = new Actions(driver);
		
		ac.dragAndDrop(drag, drop).perform();
		
		System.out.println("DRAG AND DROP IS DONE");
	}}