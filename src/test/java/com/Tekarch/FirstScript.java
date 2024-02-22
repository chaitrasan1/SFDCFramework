package com.Tekarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
Thread.sleep(5000);
 WebElement searchBoxEle= driver.findElementByName("q");
   searchBoxEle.sendKeys("selenium");
   WebElement button= driver.findElementByClassName("gNO89b");
   button.click();
   
   
	}
	

}
