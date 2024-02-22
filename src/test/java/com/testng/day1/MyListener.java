package com.testng.day1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"......test execution started.....");
	}
	

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("........test excecution completed with success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(".....test excecution failed.....");
	}

	/*@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
		
	}*/

	@Override
	public void onStart(ITestContext context) {
		System.out.println("...........test excecution started.........");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("......test excecution ended........");
	

}
}
