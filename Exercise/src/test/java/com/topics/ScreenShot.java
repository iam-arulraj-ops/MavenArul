package com.topics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("ArulTheCommando");

		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("Arulthegreatestofalltime");

		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Eclipse_Final\\Exercise\\Screenshot\\error.png");
		FileUtils.copyFile(source, dest);
	}
}