package com.Tekarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseover extends BaseTest{
	public void movingusingmouse() throws InterruptedException {
		launchBrowser("chrome");
		driver.get("https://qa-tekarch.firebaseapp.com/");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("email_field"));
		username.sendKeys("admin123@gmail.com");
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"login_div\"]/button"));
		loginbutton.click();
		Thread.sleep(3000);
		WebElement interaction = driver.findElement(By.xpath("//div[@class='navbar']/div[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(interaction).build().perform();
		WebElement doubleclickbutton = driver.findElement(By.xpath("//a[text()='Double Click']"));
		clickElement (doubleclickbutton, "doubleclickbutton");
		WebElement Leads = driver.findElement(By.xpath("//ul[@id='tabBar']/li[7]"));
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Mouseover ob = new Mouseover();
		ob.movingusingmouse();

	}

}
