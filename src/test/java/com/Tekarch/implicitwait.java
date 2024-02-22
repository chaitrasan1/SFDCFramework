package com.Tekarch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class implicitwait extends BaseTest{
public void waittime() {
	launchBrowser("chrome");
	driver.get("https://qa-tekarch.firebaseapp.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	String exptitle = "Selenium";
	String acttitle = driver.getTitle();
	System.out.println("acttitle"+ acttitle);
	if(exptitle.equals(acttitle)) {
		System.out.println("Titles matched");
	}
	else {
		System.out.println("Titles do not match");
	}
	//Thread.sleep(5000);
	WebElement username= driver.findElement(By.id("email_field"));	
	enterText(username,"admin123@gmail.com","username");

	WebElement password=driver.findElement(By.id("password_field"));
	enterText(password, "admin123", "password");
	
	
	WebElement loginButton= driver.findElement(By.tagName("button"));
	clickElement(loginButton, "loginbutton");
	
	//Thread.sleep(5000);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		implicitwait ob = new implicitwait();
		ob.waittime();
		

	}

}
