package com.stepdefinition1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.runnerclass.Runner1Example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends Runner1Example {

	@Given("user launches the application url")
	public void user_launches_the_application_url() {
		driver.get("https://www.facebook.com/login/");

	}

	@When("user enters the {string}")
	public void user_enters_the(String string) {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(string);
	}

	@And("user gives the {string} credentials")
	public void user_gives_the_credentials(String string) {
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(string);
	}

	@And("user clicks the login button")
	public void user_clicks_the_login_button() throws InterruptedException {
		WebElement loginBtn = driver.findElement(By.id("loginbutton"));
		loginBtn.click();
		Thread.sleep(3000);
	}
}