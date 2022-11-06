package com.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test case exceccution started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test case exceccuton pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test case exceccution Fail");
		Utilclass.takescreenshot(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test case exceccution skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
}

	
