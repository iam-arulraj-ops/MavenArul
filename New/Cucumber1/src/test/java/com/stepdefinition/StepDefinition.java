package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.runnerclass.RunnerClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	public WebDriver driver1 = RunnerClass.driver;

	@Given("launching the facebook application url")
	public void launching_the_facebook_application_url() {
		driver1.get("https://www.facebook.com/login/");
	}

	@When("user enters the username")
	public void user_enters_the_username() {
		WebElement userName = driver1.findElement(By.id("email"));
		userName.sendKeys("Arul Raj");
	}

	@And("user passes the password")
	public void user_passes_the_password() {
		WebElement pwd = driver1.findElement(By.id("pass"));
		pwd.sendKeys("Arul the mass");
	}

	@Then("user clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement clickBtn = driver1.findElement(By.id("loginbutton"));
		clickBtn.click();
	}
}
