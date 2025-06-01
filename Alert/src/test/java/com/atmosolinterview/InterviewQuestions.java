package com.atmosolinterview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterviewQuestions {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://blazedemo.com/index.php");
		
		String title = driver.getTitle();
		System.out.println("Title of the HomePage: "+title);
		
		WebElement text = driver.findElement(By.xpath("//h1[text()='Welcome to the Simple Travel Agency!']"));
		System.out.println(text.getText());
		
		WebElement newTab = driver.findElement(By.linkText("destination of the week! The Beach!"));
		newTab.click();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Url-Vacation: "+currentUrl);
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		WebElement departureCity = driver.findElement(By.name("fromPort"));
		
		Select s 	= new Select(departureCity);
		s.selectByVisibleText("Mexico City");
		
		WebElement destinationCity = driver.findElement(By.name("toPort"));
		
		Select s1 = new Select(destinationCity);
		s1.selectByVisibleText("London");
		
		WebElement findFlights = driver.findElement(By.xpath("//input[@type='submit']"));
		findFlights.click();
		
		WebElement flight = driver.findElement(By.xpath("//input[@type='submit']//following::tr[2]//input[@type='submit']"));
		flight.click();
		
		WebElement purchase = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		purchase.click();
		

		String id="1700736338726";
		System.out.println("ID: "+id);
		
		driver.quit();
		
	}
}