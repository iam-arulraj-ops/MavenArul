package com.pg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {

	WebDriver driver;
	
	public Search_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="q")
	public WebElement searchbox;
	
	@FindBy(name="btnk")
	public WebElement search_btn;
	
	@FindBy(xpath="//a//h3[text()='Facebook - Log In or Sign Up']")
	public WebElement fb;
	
	public void searchGoogle(String Searchinput) {
	try {
		searchbox.sendKeys(Searchinput);
		search_btn.click();
	}
	catch(Exception e) {
		System.out.println("Exceptions Caught"+e.getMessage());
	}
	}}
