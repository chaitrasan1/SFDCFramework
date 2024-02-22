package com.Tekarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtractFromSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
 driver.get("https://www.selenium.dev/");
 WebElement button = driver.findElement(By.className("navbar-toggler"));
 button.click();
 WebElement extractedText = driver.findElement(By.className("d-1 "));
 System.out.println("Extracted Text :" +extractedText);
 driver.quit();
 

	}

}
