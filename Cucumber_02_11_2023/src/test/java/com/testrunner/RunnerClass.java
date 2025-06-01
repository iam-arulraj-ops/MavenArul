package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Eclipse_Final\\Cucumber_02_11_2023\\src\\test\\java\\com\\feature\\Cucumber.feature",
glue="com.stepdefinition",dryRun=false,strict=true,monochrome=true,plugin= {"pretty","html:Report/cucumber"})
public class RunnerClass {
}