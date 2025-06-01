package com.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	WebDriver driver;

	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	By searchbox = By.name("q");
	By fbclick = By.xpath("//h3[text()='Facebook - log in or sign up']");
	By searchclick = By.name("btnK");

	public void searchGoogle() throws InterruptedException{

		driver.findElement(searchbox).sendKeys("facebook");
		Thread.sleep(5000);
	}

	public void searchClick() {
		driver.findElement(searchclick).click();
	}

	public void clickFacebook() {
		driver.findElement(fbclick).click();
	}
}
