package com.chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsChrome {


	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Eclipse_Final\\Alert\\Driver\\chromedriver.exe");
	
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--start-maximized");
	opt.addArguments("--incognito");
	//opt.addArguments("--headless");
	
	WebDriver driver = new ChromeDriver(opt);
	driver.get("https://www.amazon.in/");
	System.out.println("ChromeOptions is successful");
}}
