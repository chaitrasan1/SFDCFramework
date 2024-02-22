package com.Tekarch;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

import org.openqa.selenium.TakesScreenshot;

public class ScreenshotTest extends BaseFirebase {

	public void method() throws InterruptedException, IOException {
		String expError = "Error : The password is invalid or the user does not have a password.123";
		launchBrowser("chrome");
		goToUrl("https://qa-tekarch.firebaseapp.com/");
		Thread.sleep(5000);
		TakesScreenshot screenshotOb= (TakesScreenshot)driver;
		File src=screenshotOb.getScreenshotAs(OutputType.FILE);
		 File destination=new File(System.getProperty("user.dir")+"/reports/screenshots/failure1.png");
		 Files.copy(src, destination);
		WebElement username = driver.findElement(By.id("email_field"));
		enterText(username, "admin123@gmail.com", "username");
		// Alert al1= driver.switchTo().alert();

		WebElement password = driver.findElement(By.id("password_field"));
		enterText(password, "", "password");

		WebElement loginButton = driver.findElement(By.tagName("button"));
		clickElement(loginButton, "loginbutton");
		
		Alert al = driver.switchTo().alert();
		System.out.println("switched to alert");
		String actualError = al.getText(); 
		
		if(actualError.equals(expError)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Inside else ");
			TakesScreenshot screenshotOb1= (TakesScreenshot)driver;
			File src1=screenshotOb1.getScreenshotAs(OutputType.FILE);
			 File destination1=new File(System.getProperty("user.dir")+"/reports/screenshots/failure1.png");
			 Files.copy(src1, destination1);
			System.out.println("Test case failed");
		}
		al.accept();
		driver.close();
	}
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ScreenshotTest ob = new ScreenshotTest();
		ob.method();

	}

}
