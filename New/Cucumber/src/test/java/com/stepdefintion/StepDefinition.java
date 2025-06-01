package com.stepdefintion;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.runner.RunnerClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends RunnerClass {

	@Given("user launches the application url")
	public static void user_launches_the_application_url() {

		driver.get("https://www.facebook.com/login/");
	}

	@When("user enters the username")
	public static void user_enters_the_username() {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("arulthegreat");
	}

	@And("user gives the valid password")
	public static void user_gives_the_valid_password() {
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("arulthemass");
	}

	@And("user clicks on login button")
	public static void user_clicks_on_login_button() throws IOException, InterruptedException {
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();

		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Eclipse_Final\\New\\Cucumber\\Screenshot\\errormsg.png");
		FileUtils.copyFile(source, dest);
	}
}