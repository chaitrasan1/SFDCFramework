package com.Tekarch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Case4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement Username =driver.findElementById("username");
		Username.sendKeys("123");
		WebElement Password = driver.findElementById("password");
		Password.sendKeys("22131");
		WebElement loginbutton =driver.findElementById("Login");
		loginbutton.click();
	}

}
