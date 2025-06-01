package com.kohls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Kohls {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.kohls.com/");

//		driver.findElement(By.id("search")).sendKeys("Iphone 14");
//		driver.findElement(By.name("submit-search")).click();

		// Actions ac = new Actions(driver);

		Thread.sleep(3000);

		WebElement category = driver.findElement(By.xpath("//span[text()='Shop by Category']"));

		category.click();

		WebElement sale = driver.findElement(By.linkText("Sale & Clearance"));
		sale.click();

		WebElement home = driver.findElement(By.xpath("//p[text()='Home Sale']"));
		home.click();

//		WebElement mother = driver.findElement(By.linkText("Mother's Day"));
//		mother.click();
//
//		WebElement clothing = driver.findElement(By.xpath("//p[text()='Clothing & Shoes']"));
//		clothing.click();

//		ac.moveToElement(category).build().perform();
//		ac.click().build().perform();

//		Select s = new Select(category);
//		s.selectByVisibleText("Men");
	}
}