package com.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions1 {

	public static WebDriver driver;

	@Test
	public void mouseActions() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		Actions ac = new Actions(driver);
		WebElement todayDeals = driver.findElement(By.linkText("Today's Deals"));
		ac.moveToElement(todayDeals).click().build().perform();
	}

	@Test
	public void dragAndDrop() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://letcode.in/dropable");

		Actions ac = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		ac.dragAndDrop(drag, drop).build().perform();
	}
	@Test
	public void clickAndHoldRelease() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://letcode.in/dropable");

		Actions ac = new Actions(driver);
		WebElement clickAndHold = driver.findElement(By.id("draggable"));
		WebElement release = driver.findElement(By.id("droppable"));

		ac.clickAndHold(clickAndHold).build();
		ac.release(release).build().perform();
	}
}