package com.Tekarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Calculator extends BaseTest {
	public void Calc() throws InterruptedException {
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
		WebElement Calculator= driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/a[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(Calculator).build().perform();
		//action.click(Calculator);
		System.out.println(Calculator.getText());
		Calculator.click();
		Thread.sleep(3000);
		WebElement five = driver.findElement(By.xpath("//*[@id=\"container\"]/form/input[7]"));
		five.click();
		WebElement plus = driver.findElement(By.xpath("//*[@id=\"container\"]/form/input[5]"));
		plus.click();
		five.click();
		WebElement equal = driver.findElement(By.xpath("//*[@id=\"container\"]/form/input[16]"));
		equal.click();
		WebElement result = driver.findElement(By.xpath("//*[@id=\"display\"]"));
		System.out.println("Result:"+ result.getAttribute("value"));
		
	}

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
    Calculator ob = new Calculator();
    ob.Calc();
    
   
	}

}
