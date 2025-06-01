package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.runner.RunnerClass1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition  {

	public static WebDriver driver1 = RunnerClass1.driver;

	@Given("user launches the application url")
	public static void user_launches_the_application_url() {
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver1.get("https://www.facebook.com/login/");

	}

	@When("user enters the {string} in the username field")
	public static void user_enters_the_in_the_username_field(String user) {
		WebElement username = driver1.findElement(By.id("email"));
		username.sendKeys(user);
	}

	@When("user gives the {string} as the valid password in the field")
	public static void user_gives_the_as_the_valid_password_in_the_field(String pass) {
		WebElement pwd = driver1.findElement(By.id("pass"));
		pwd.sendKeys(pass);
	}

	@When("user clicks the login button")
	public static void user_clicks_the_login_button() {
		WebElement btn = driver1.findElement(By.id("loginbutton"));
		btn.click();
	}
}