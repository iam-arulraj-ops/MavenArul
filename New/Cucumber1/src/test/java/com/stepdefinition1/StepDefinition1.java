package com.stepdefinition1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.runnerclass.RunnerClass1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 {

	public static WebDriver driver2= RunnerClass1.driver3;
	
	@Given("launching the facebook application url")

	public void launching_the_facebook_application_url() {
		driver2.get("https://www.facebook.com/login/");

	}

	@When("user enters the {string}")
	public void user_enters_the(String string) {
		WebElement userName = driver2.findElement(By.id("email"));
		userName.sendKeys(string);

	}

	@And("user passes the {string}")
	public void user_passes_the(String string) {
		WebElement pwd = driver2.findElement(By.id("pass"));
		pwd.sendKeys(string);

	}

	@Then("user clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement clickBtn = driver2.findElement(By.id("loginbutton"));
		clickBtn.click();
	}}