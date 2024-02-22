package com.Tekarch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Case4A{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement Username =driver.findElementById("username");
		Username.sendKeys("chaitz@san1.com");
		WebElement ForgotPassword =driver.findElementById("forgot_password_link");
		ForgotPassword.click();
		Thread.sleep(5000);
		WebElement Username1 = driver.findElementByXPath("//*[@id=\"un\"]");
		Username1.sendKeys("chaitz@san1.com");
		WebElement button = driver.findElementById("continue");
		button.click();
		String expheader = "Check Your Email";
		String actheader = driver.findElementById("logo_wrapper").getText();
		if(actheader.equals(expheader)) {
			System.out.println("header message  is correct");
		}
		else {
			System.out.println("headermessage is incorrect");
		}
		//driver.close();
		}
	}



