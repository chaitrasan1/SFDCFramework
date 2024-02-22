package com.Tekarch;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowAlert {
	public void newwindow() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		Thread.sleep(5000);
		
		WebElement username= driver.findElement(By.id("email_field"));
		username.sendKeys("admin123@gmail.com");
		//Alert al1= driver.switchTo().alert();
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		Thread.sleep(3000);
		WebElement loginButton= driver.findElement(By.tagName("button"));
		loginButton.click();
		Thread.sleep(5000);
		WebElement switchdd = driver.findElementByXPath("//button[contains(text(),'Switch To')]");
		Actions action = new Actions(driver);
		action.moveToElement(switchdd).build().perform();
		WebElement windows = driver.findElementByXPath("//a[contains(text(),'Windows')]");
		windows.click();
		Thread.sleep(3000);
		WebElement newwindow1 = driver.findElement(By.xpath("//a[2]/button"));
		newwindow1.click();
		String parentWindow = driver.getWindowHandle(); 
		driver.switchTo().window(parentWindow);
		System.out.println("url="+driver.getCurrentUrl()+" and title="+driver.getTitle());
		driver.switchTo().window(driver.getWindowHandle());		
		System.out.println("url="+driver.getCurrentUrl()+" and title="+driver.getTitle());

	}

	
	

	




	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		NewWindowAlert ob = new NewWindowAlert();
		ob.newwindow();

	}

}
