package com.topics;

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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickRobot {

	public static WebDriver driver;

	@Test(priority = 0)
	public void amazon() throws AWTException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");

		Actions ac = new Actions(driver);
		Robot rb = new Robot();

		WebElement todayDeals = driver.findElement(By.linkText("Today's Deals"));
		ac.contextClick(todayDeals).build().perform();

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

	@Test(priority = 1)
	public void windowHandles() {

		Set<String> windowHandles = driver.getWindowHandles();

		for (String window : windowHandles) {

			WebDriver window2 = driver.switchTo().window(window);

			System.out.println(window2.getTitle());
		}
	}
}