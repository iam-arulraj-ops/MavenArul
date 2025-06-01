package com.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Appium {

	public static AndroidDriver driver;

	@Test(priority = 0)
	private void setCapabilities() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("appium:automationName", "UiAutomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("udid", "H6QS4SY5VCYLAYYL");
		capabilities.setCapability("deviceName", "OPPO A31");
		capabilities.setCapability("appPackage", "com.google.android.calculator");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

		URL url = new URL("http://0.0.0.0:4723/");
		driver = new AndroidDriver(url, capabilities);
	}

	@Test(priority = 1)
	private void googleCalculator() {

		WebElement numberSeven = driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
		numberSeven.click();

		WebElement symbolMultiply = driver
				.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"multiply\"]"));
		symbolMultiply.click();

		WebElement numberFive = driver.findElement(AppiumBy.accessibilityId("5"));
		numberFive.click();

		WebElement equalSymbol = driver.findElement(AppiumBy.accessibilityId("equals"));
		equalSymbol.click();
	}
}