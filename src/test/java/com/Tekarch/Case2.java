package com.Tekarch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement Username =driver.findElementById("username");
		Username.sendKeys("chaitz@san1.com");
		WebElement Password = driver.findElementById("password");
		Password.sendKeys("Password@1234");
		WebElement loginbutton =driver.findElementById("Login");
		loginbutton.click();
		String expTab = "Home";
		String actTab = driver.findElementById("home_Tab").getText();
		
		System.out.println("Actual:" +actTab);
		if(actTab.equals(expTab)) {
			System.out.println("Login is sucessful");
		}
		else {
			System.out.println("Login is unsucessful");
		}
	driver.close();
	}

}
