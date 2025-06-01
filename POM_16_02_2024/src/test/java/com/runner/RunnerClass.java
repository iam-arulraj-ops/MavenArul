package com.runner;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.pom.FacebookLoginPage;

public class RunnerClass extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = browserLaunch("chrome");
		urlLaunch("https://www.facebook.com/login/");

		FacebookLoginPage fbl = new FacebookLoginPage(driver);
		inputElements(fbl.getUseremail(), "arulthegreat");
		inputElements(fbl.getPassword(), "arultheking");
		clickOnElement(fbl.getLoginBtn());
	}
}	