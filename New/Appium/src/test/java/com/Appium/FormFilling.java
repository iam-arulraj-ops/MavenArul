package com.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class FormFilling {

	public static AndroidDriver driver;

	@Test(priority = 0)
	private void setCapabilities() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("appium:automationName", "UiAutomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("udid", "H6QS4SY5VCYLAYYL");
		capabilities.setCapability("deviceName", "OPPO A31");
		capabilities.setCapability("appPackage", "io.selendroid.testapp");
		capabilities.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");

		URL url = new URL("http://0.0.0.0:4723/");
		driver = new AndroidDriver(url, capabilities);
	}	}

//	@Test(priority = 1)
//
//	private void formFill() {
//
//		WebElement userName = driver.findElement(By.id("io.selendroid.testapp:id/inputUsername"));
//		userName.sendKeys("ArulRaj");
//
//		WebElement mail = driver.findElement(AppiumBy.accessibilityId("email of the customer"));
//		mail.sendKeys("arulraj1997@gmail.com");
//
//		WebElement pwd = driver.findElement(By.id("io.selendroid.testapp:id/inputPassword"));
//		pwd.sendKeys("arulthecommando");
//
//	}

