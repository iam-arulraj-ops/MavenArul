package com.listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_Listener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Cases start and details are: "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Cases Success Hurrayyyyy and details are: "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Cases  failed and details are: "+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Cases skipped and details are: "+ result.getName());
	}

}
