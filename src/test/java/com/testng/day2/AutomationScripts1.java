package com.testng.day2;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//@Listeners(com.testng.day1.MyListener.class)

public class AutomationScripts1 {
	@Test
	public void firebaseTest() throws InterruptedException {
		String expected="Selenium";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		Thread.sleep(10000);
		String actual=driver.getTitle();
		Assert.assertEquals(actual,expected);
	//	System.out.println("JavaTestparallel1Method1 executed");
		driver.close();
		
	}
	
	@Test
	public void demoqaTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		Thread.sleep(10000);
		String actual=driver.getTitle();
		Assert.assertTrue(false);
		//System.out.println("JavaTestparallel1Method2 executed");
		driver.close();
	
	}

}
