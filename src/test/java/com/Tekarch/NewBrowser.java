
package com.Tekarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://login.salesforce.com/");
/*WebElement  button = driver.findElement(By.className("navbar-toggler"));
button.click();
Thread.sleep(5000);
WebElement Dowloads = driver.findElement(By.className("nav-link"));
Dowloads.click();
driver.get("https://www.selenium.dev/dowloads/");
driver.close();*/
	}

}
