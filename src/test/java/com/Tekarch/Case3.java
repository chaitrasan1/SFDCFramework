package com.Tekarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Case3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement Username =driver.findElementById("username");
		Username.sendKeys("chaitz@san1.com");
		WebElement Password = driver.findElementById("password");
		Password.sendKeys("Password@1234");
		WebElement Rememberbox = driver.findElementById("rememberUn");
		Rememberbox.click();
		WebElement loginbutton =driver.findElementById("Login");
		loginbutton.click();
		driver.findElementById("userNav-arrow").click();
	//	WebElement logout = driver.findElementByXPath("//*[@id=\'userNav-menuItems\']/a[5]"); 
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		System.out.println(logout);
		logout.click();
		
	}

}
