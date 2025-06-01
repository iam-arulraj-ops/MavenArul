package com.Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ApiDemos {
	public static AndroidDriver driver;

	@Test(priority = 0)
	private static void setCapabilities() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("appium:automationName", "UiAutomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("udid", "H6QS4SY5VCYLAYYL");
		capabilities.setCapability("deviceName", "OPPO A31");
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability("fullReset", "false");
		capabilities.setCapability("appPackage", "com.hmh.api");
		capabilities.setCapability("appActivity", ".ApiDemos");
		

		URL url = new URL("http://0.0.0.0:4723/");
		driver = new AndroidDriver(url, capabilities);
	}
	
	@Test(priority = 1)
	private static void automateApiDemos() {		

		WebElement okBtn = driver.findElement(By.id("android:id/button1"));
		okBtn.click();
	
//		List<WebElement> preference = driver.findElements(By.className("android.widget.TextView"));
//		preference.get(9).click();
	}
}