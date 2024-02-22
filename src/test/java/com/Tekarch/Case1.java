package com.Tekarch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.firefoxdriver().setup();
FirefoxDriver driver = new FirefoxDriver();
driver.get("https://login.salesforce.com/");
WebElement Username =driver.findElementById("username");
Username.sendKeys("chaitz@san1.com");
WebElement loginbutton =driver.findElementById("Login");
loginbutton.click();
String expMsg = "Please enter your password.";
String actMsg = driver.findElementById("error").getText();
if(actMsg.equals(expMsg)) {
	System.out.println("Error message  is correct");
}
else {
	System.out.println("Error message is incorrect");
}
driver.close();
}
}


