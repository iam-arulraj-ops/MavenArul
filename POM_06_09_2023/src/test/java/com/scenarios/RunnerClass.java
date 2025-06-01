package com.scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.objects.FacebookPage;
import com.objects.GoogleSearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunnerClass {

	GoogleSearchPage page;
	FacebookPage fb;
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
	}
	@Test(priority=0)
	public void google() throws InterruptedException {
		page = new GoogleSearchPage(driver);
		page.searchGoogle();
		page.searchClick();
		page.clickFacebook();
		
	}
	@Test(priority=1)
	public void facebook() {
		fb= new FacebookPage(driver);
		fb.enterUsername();
		fb.enterPassword();
		fb.verifyLogin();
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
