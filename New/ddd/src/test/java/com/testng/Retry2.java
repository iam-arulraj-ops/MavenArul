package com.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry2 implements IRetryAnalyzer {

	int min = 0;
	int max = 5;

	@Override
	public boolean retry(ITestResult result) {

		if (min < max) {
			min++;
			return true;
		}
		return false;
	}
}