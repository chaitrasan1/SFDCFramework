package com.commontest;

import com.Tekarch.BaseFirebase;

public class screeshotTest extends BaseFirebase {
	
	
	
	public void method() throws InterruptedException {
		String expError = "Error : The password is invalid or the user does not have a password.";
launchBrowser("chrome");
goToUrl("https://qa-tekarch.firebaseapp.com/");
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.id("email_field"));
		enterText(username, "admin123@gmail.com", "username");
		// Alert al1= driver.switchTo().alert();

		WebElement password = driver.findElement(By.id("password_field"));
		enterText(password, "", "password");

		WebElement loginButton = driver.findElement(By.tagName("button"));
		clickElement(loginButton, "loginbutton");
		Alert al =driver. switchToAlert();
		String actualError = getAlertText(al, "loginError alert");
		AcceptAlert(al);
		Assert.assertEquals(actualError, expError);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		screeshotTest ob = new screeshotTest();
		ob.method;

	}

}
