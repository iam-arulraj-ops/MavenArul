package com.kohls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShopByCategory {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.kohls.com/");

		WebElement shop = driver.findElement(By.xpath("//span[text()='Shop by Category']"));

		shop.click();

//	// @Test(priority = -1)
//	public static void setup() {

		// @Test(dependsOnMethods = "setup")
		// public static void shopBy() {

		// Actions ac = new Actions(driver);

		// shop.click();

	}
}
