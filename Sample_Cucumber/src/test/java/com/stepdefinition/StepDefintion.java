package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.RunnerClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefintion {

	public static WebDriver driver = RunnerClass.driver;

	@Given("^Launching the application url$")
	public void launching_the_application_url() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("facebook login");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("(//a/h3[text()='Log into Facebook | Facebook'])[1]")).click();

	}

	@When("^Entering the details in username field$")
	public void entering_the_details_in_username_field() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("arulthemass");
	}

	@Then("^User enters the details in password field$")
	public void user_enters_the_details_in_password_field() throws Throwable {
		driver.findElement(By.name("pass")).sendKeys("Greatest of all Time");
	}

	@And("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.name("login")).click();
	}

	@And("^User closes the browser$")
	public void user_closes_the_browser() throws Throwable {
		Thread.sleep(1000);
	}

}
