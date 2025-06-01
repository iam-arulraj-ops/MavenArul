package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.runner.RunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	public static WebDriver driver = RunnerClass.driver;

	@Test(priority = 0)
	@Given("Launch the Facebook url")
	public void launch_the_facebook_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("facebook login");

		WebElement login = driver.findElement(By.xpath("//h3[text()='Facebook - log in or sign up']"));
		login.click();
	}

	@Test(priority = 1)
	@When("User enters the username")
	public void user_enters_the_username() {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("arulthemass");
	}

	@Test(priority = 2)
	@When("User gives the password")
	public void user_gives_the_password() {
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("mastertheblaster");
	}

	@Test(priority = 3)
	@Then("User clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
		driver.quit();
	}

}
