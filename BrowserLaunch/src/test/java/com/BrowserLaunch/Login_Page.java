package com.BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	WebDriver driver;
	
	@FindBy(id="email")
	private WebElement mail;

	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(id="loginbutton")
	private WebElement click;
	
	public WebElement getClick() {
		return click;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPass() {
		return pass;
	}
	public Login_Page(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
	}
}
