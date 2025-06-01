package com.BrowserLaunch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunchTaskArun {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.in/");

		String title = driver.getTitle();
		System.out.println("title: " + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl: " + currentUrl);

//		String pageSource = driver.getPageSource();
//		System.out.println("pageSource: " + pageSource);
		
		Thread.sleep(3000);

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone 14");

		System.out.println("========Iphone models Section===============");

		List<WebElement> iphone = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));

		for (WebElement i : iphone) {
			System.out.println(i.getText());
		}

		System.out.println("=================================");

		WebElement deals = driver.findElement(By.linkText("Today's Deals"));

		boolean display = deals.isDisplayed();
		System.out.println("displayed: " + display);

		boolean enabled = deals.isEnabled();
		System.out.println("enabled: " + enabled);

		boolean selected = deals.isSelected();
		System.out.println("selected: " + selected);

		WebElement pro = driver.findElement(
				By.xpath("//div[@class='s-suggestion-container']//descendant::span[text()=' pro max 256gb']"));
		pro.click();

		System.out.println("===============Navigation Methods======================");

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();

		System.out.println("===============ALL DONE======================");
	}
}