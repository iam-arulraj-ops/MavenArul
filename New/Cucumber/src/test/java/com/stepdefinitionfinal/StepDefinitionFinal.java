package com.stepdefinitionfinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.runnerfinal.RunnerClassFinal;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinitionFinal extends RunnerClassFinal {

	public static WebDriver driver1 = RunnerClassFinal.driver;

		@Given("user launches the application url")
		public void user_launches_the_application_url() {
			driver1.get("https://www.instagram.com/accounts/login/?hl=en");
		}

		@When("user provides the valid username")
		public void user_provides_the_valid_username() {
			WebElement email = driver1.findElement(By.xpath("//input[@name='username']"));
			email.sendKeys("ArulRaj");
		}

		@When("user provides the valid password")
		public void user_provides_the_valid_password() {
			WebElement password = driver1.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys("King");
		}

		@When("user clicks on login button")
		public void user_clicks_on_login_button() throws InterruptedException {
			Thread.sleep(3000);
			WebElement btn = driver1.findElement(By.xpath("//button[@type='submit']"));
			btn.click();
		}

	}


