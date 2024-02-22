package com.testng.day2;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AutomationScripts2 {
	@Test
	public void salesforceTest() throws InterruptedException {
		String expected="Login | Salesforce";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(10000);
		//int i=100/0;
		String actual=driver.getTitle();
		Assert.assertEquals(actual,expected); // hard assertions
		
		//Assert.assertEquals(actual,expected);
		System.out.println("JavaTestparallel1Method1 executed");
		driver.close();
		
	}
	
	@Test
	public void googleTest() throws InterruptedException {
		//soft assertion
		SoftAssert sa=new SoftAssert();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		sa.assertNotNull(null);
		Thread.sleep(10000);
		
		String actual=driver.getTitle();
		System.out.println("JavaTestparallel1Method2 executed");
		//sa.assertTrue(false);
		driver.close();
		sa.assertAll();
	
	}
}
