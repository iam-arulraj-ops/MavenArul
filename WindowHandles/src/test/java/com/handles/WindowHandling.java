package com.handles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static WebDriver driver;
	
	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriverManager.chromedriver().setup();
	
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		Actions ac = new Actions(driver);
		
		Robot r= new Robot();
		
		WebElement best= driver.findElement(By.linkText("Best Sellers"));
		ac.contextClick(best).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement deal= driver.findElement(By.partialLinkText("Today's D"));
		ac.contextClick(deal).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement mob= driver.findElement(By.linkText("Mobiles"));
		ac.contextClick(mob).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		Set<String> windowHandles = driver.getWindowHandles();
		for (String page : windowHandles) {
			WebDriver io=driver.switchTo().window(page);
		System.out.println(io.getTitle());
		Thread.sleep(3000);
		}
		
		
		System.out.println("=================================");
		
		
		String currenttab= driver.getWindowHandle();
		WebDriver window = driver.switchTo().window(currenttab);
		System.out.println(window.getTitle());
}}