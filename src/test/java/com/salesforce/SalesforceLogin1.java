package com.salesforce;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.salesforce.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;




import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceLogin1 extends BaseTest {
	
	
	
	
	@Test
	public void case2() throws InterruptedException {
	launchBrowser("chrome");
	driver.get("https://login.salesforce.com/");
	WebElement username = driver.findElement(By.id("username"));
	//enterText(username,"admin123@gmail.com","username");
	enterText(username,"chaitz@san1.com" ,"username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password,"Password@1234","password");
	WebElement loginbutton = driver.findElement(By.id("Login"));
	clickElement(loginbutton,"Login");
	Thread.sleep(5000);
	driver.close();
	}	
@Test
	public void case1() throws InterruptedException {
		launchBrowser("chrome");
		driver.get("https://login.salesforce.com/");
		WebElement username =driver.findElement(By.id("username"));
		enterText(username,"chaitz@san1.com","username");
		WebElement loginbutton = driver.findElement(By.id("Login"));
		clickElement(loginbutton,"Login");
		Thread.sleep(5000);
		driver.close();
	}
	@Test
	public void case3() throws InterruptedException {
		launchBrowser("chrome");
		driver.get("https://login.salesforce.com/");
		WebElement username = driver.findElement(By.id("username"));
		//enterText(username,"admin123@gmail.com","username");
		enterText(username,"chaitz@san1.com" ,"username");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password,"Password@1234","password");
		WebElement loginbutton = driver.findElement(By.id("Login"));
		clickElement(loginbutton,"Login");
		Thread.sleep(5000);
		driver.close();
	}
	@Test
	public  void case4A() throws InterruptedException {
		launchBrowser("chrome");
		driver.get("https://login.salesforce.com/");
		WebElement username = driver.findElement(By.id("username"));
		//enterText(username,"admin123@gmail.com","username");
		enterText(username,"chaitz@san1.com" ,"username");
		WebElement loginbutton = driver.findElement(By.id("Login"));
		clickElement(loginbutton,"Login");
		WebElement forgotPassword = driver.findElement(By.id("forgot_password_link"));
		forgotPassword.click();
		WebElement username1 = driver.findElement(By.xpath("//input[@id='un']"));
		username1.sendKeys("chaitz@san1.com");
		WebElement clickbutton = driver.findElement(By.xpath("//input[@id='continue']"));
		clickbutton.click();
		Thread.sleep(5000);
	}
	@Test
	public void case4B() throws InterruptedException {
		launchBrowser("chrome");
		driver.get("https://login.salesforce.com/");
		WebElement username = driver.findElement(By.id("username"));
		//enterText(username,"admin123@gmail.com","username");
		enterText(username,"123" ,"username");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password,"22131","password");
		WebElement loginbutton = driver.findElement(By.id("Login"));
		clickElement(loginbutton,"Login");
		Thread.sleep(5000);
		driver.close();
	}
		
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SalesforceLogin1 ob = new SalesforceLogin1();
		//ob.case1();
		ob.case2();
		//ob.case3();
		//ob.case4A();
		//ob.case4B();
		
	}

}
