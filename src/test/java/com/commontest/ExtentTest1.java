package com.commontest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentTest1 {
	
	
	
public static void main(String[] args) {
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("reports/Spark.html");
	extent.attachReporter(spark);
	
	extent.setSystemInfo("HostName","Salesforce");
	extent.setSystemInfo("Environment","QA" );
	extent.setSystemInfo("User Name", "Chaitra");
	
	spark.config().setDocumentTitle("Test Execution Report");
	spark.config().setDocumentTitle("firebase regression tests");
	spark.config().setTheme(Theme.DARK);
	
	extent.attachReporter(spark);
	
	ExtentTest test1 =extent.createTest("MyFirstTest1");
	  test1.log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
	  test1.info("info message");
	  
	  

		ExtentTest test2 =extent.createTest("MyFirstTest2");
		test2.log(Status.FAIL, "failed");
		test2.fail(MediaEntityBuilder.createScreenCaptureFromPath(System.getProperty("user.dir")+"/reports/screenshot1.png").build());
		  test2.log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
		  test2.info("info message");
		  
		  

			ExtentTest test3 =extent.createTest("MyFirstTest3");
			  test3.log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
			  test3.info("info message");
	extent.flush();
	System.out.println("completed");

	
}
}
