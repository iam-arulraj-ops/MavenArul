package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

	public static WebDriver driver;

	@FindBy(id = "email")
	private WebElement useremail;

	@FindBy(name = "pass")
	private WebElement password;

	@FindBy(id = "loginbutton")
	private WebElement loginBtn;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUseremail() {
		return useremail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public FacebookLoginPage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
		
	}
	
}
