package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.runner.RunnerClass2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinitionFile extends RunnerClass2 {


		
		@Given("Navigate to the images page")
		public void navigate_to_the_images_page() {
			driver.get("https://www.amazon.in/ref=nav_logo");
		}

		@When("user clicks on the images")
		public void user_clicks_on_the_images() {
			WebElement imageClick = driver.findElement(By.xpath("//span[text()='Cushion covers, bedsheets & more']"));
		}

		@When("user clicks on the first image")
		public void user_clicks_on_the_first_image() {
		}

		@When("user goes back to the homepage")
		public void user_goes_back_to_the_homepage() {
		}


	}

}
