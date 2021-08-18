package com.bat.SeleniumMavenProjectSecond.Utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGReporting implements ITestListener {
	private WebDriver driver = null;

	public void onStart(ITestContext result) {
		System.out.println("Test Execution has been started: "+ result.getName());
	}
	public void onTestStart(ITestResult result) {
		System.out.println("Test has been started: "+ result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test has been successfull: "+ result.getName());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test has been failed: "+ result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test has been skipped: "+ result.getName());
	}
	public void onFinish(ITestContext result) {
		System.out.println("Test Execution has been finished: "+ result.getName());
	}
}
