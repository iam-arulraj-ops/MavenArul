package com.topics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public WebDriver driver;

	@Test
	public void okAlert() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html");

		WebElement okAlert = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		okAlert.click();

		driver.switchTo().alert().accept();
	}

	@Test
	public void okcancelAlert() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html");

		WebElement okcancelAlertBtn = driver.findElement(By.linkText("Alert with OK & Cancel"));
		okcancelAlertBtn.click();

		WebElement okcancelAlert = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		okcancelAlert.click();

		driver.switchTo().alert().dismiss();
	}

	@Test
	public void sendKeysAlert() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html");

		WebElement sendKeysAlertBtn = driver.findElement(By.linkText("Alert with Textbox"));
		sendKeysAlertBtn.click();

		WebElement sendKeysInput = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		sendKeysInput.click();

		Thread.sleep(3000);

		driver.switchTo().alert().sendKeys("ArulTheCommando");
		driver.switchTo().alert().accept();
	}
}