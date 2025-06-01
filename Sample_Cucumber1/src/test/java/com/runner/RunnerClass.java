package com.runner;


import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="	src\\test\\java\\com\\cucumber\\cucumber.feature",glue="com.stepdefinition"

		)
public class RunnerClass {



}
