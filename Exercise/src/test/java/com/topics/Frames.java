package com.topics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static WebDriver driver;

	@Test
	public void singleFrame() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.switchTo().frame("singleframe");

		WebElement inputs = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		inputs.sendKeys("arulthemass");
	}

	@Test
	public void nestedFrames() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Frames.html");

		WebElement nestedFrameBtn = driver.findElement(By.linkText("Iframe with in an Iframe"));
		nestedFrameBtn.click();

		WebElement parentFrame = driver.findElement(By.xpath("//h5[text()='Nested iFrames']"));
		driver.switchTo().frame(parentFrame);

		WebElement iframeNested = driver
				.findElement(By.xpath("//div[@class='container']//following-sibling::h5[text()='iFrame Demo']"));
		driver.switchTo().frame(iframeNested);

		Thread.sleep(3000);
		WebElement inputs = driver.findElement(By.xpath("//input[@type='text']"));
		inputs.sendKeys("arulthemass");
	}
}