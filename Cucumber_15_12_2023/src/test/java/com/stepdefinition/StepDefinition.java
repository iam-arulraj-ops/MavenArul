package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.runnerclass.RunnerClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends RunnerClass {

	@Given("user launches the application url")
	public void user_launches_the_application_url() {
		driver.get("https://www.facebook.com/login/");
		
	}

	@When("user enters the username")
	public void user_enters_the_username() {
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("ArulTheGreat123");
	}

	@And("user enters the password")
	public void user_enters_the_password() {
		WebElement pass= driver.findElement(By.id("pass"));
		pass.sendKeys("GreatestOfAllTime");
	}

	@And("user clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement loginBtn= driver.findElement(By.id("loginbutton"));
		loginBtn.click();
	}

}
