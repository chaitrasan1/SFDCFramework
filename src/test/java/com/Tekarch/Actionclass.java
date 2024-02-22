package com.Tekarch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actionclass extends BaseTest{
	public   void action() throws InterruptedException {
		launchBrowser("chrome");
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.name("q"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.SHIFT).sendKeys(search,"selenium")
		.keyUp(Keys.SHIFT)
		.build()
		.perform();
		Thread.sleep(5000);
		System.out.println("completed");
		action.click();
		
		
		
	}
	


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Actionclass ob = new Actionclass();
		ob.action();

	}

}
