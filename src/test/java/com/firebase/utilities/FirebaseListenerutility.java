package com.firebase.utilities;


	import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;


	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
	import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;

import com.google.common.io.Files;
import com.salesforce.BaseTest;

	public class FirebaseListenerutility extends BaseTest implements ITestListener {
		protected Logger Listenerlog = LogManager.getLogger();
		private static ExtentReportsUtility extentreport = ExtentReportsUtility.getInstance();

		@Override
		public void onTestStart(ITestResult result) {
			Listenerlog.info(result.getMethod().getMethodName()+"......test execution started.....");
			extentreport.startSingleTestReport(result.getMethod().getMethodName());
			
		}
		

		@Override
		public void onTestSuccess(ITestResult result) {
			Listenerlog.info("........test excecution completed with success");
			extentreport.logTestpassed(result.getMethod().getMethodName()+"result.getMethod().getMethodName()");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			Listenerlog.info(".....test excecution failed.....");
			extentreport.logTestFailed(result.getMethod().getMethodName()+"test excecution failure");
			String filename = "X";//new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
			System.out.println(("filename="+filename));
			String path= Constants.SCREENSHOTS_DIRECTORY_PATH+filename+".png";
			System.out.println("P:"+path);
			takescreenshot(path);
			extentreport.logTestWithscreenshot("C:/Users/chait/eclipse-workspace/SeleniumAutomationFramework/reports/screeshots/"+filename+".png");
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
			Listenerlog.info("...........test excecution started.........");
			extentreport.startExtentReport();
		}

		@Override
		public void onFinish(ITestContext context) {
			Listenerlog.info("......test excecution ended........");
			extentreport.endReport();
		

	}
		public void takescreenshot(String filepath) {
			 TakesScreenshot screenCapture=(TakesScreenshot)driver;
			 File src=screenCapture.getScreenshotAs(OutputType.FILE);
			 File destination=new File(filepath);
			 try {
				Files.copy(src, destination);
				baseTestlog.info("captured the screen");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				baseTestlog.info("went wrong when capturing the screen");
				
			}
		}
		

		public void takescreenshot(WebElement element,String filepath) {
			 
			 File src=element.getScreenshotAs(OutputType.FILE);
			 File destination=new File(filepath);
			 try {
				Files.copy(src, destination);
				baseTestlog.info("captured the screen");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				baseTestlog.info("went wrong when capturing the screen");
				
			}
		}
}
