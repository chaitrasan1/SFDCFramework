package com.Tekarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/drag_and_drop");
Thread.sleep(2000);
WebElement colA= driver.findElement(By.id("column-a"));
WebElement colB = driver.findElement(By.id("column-b"));
Actions action = new Actions(driver);
action.clickAndHold(colA).moveToElement(colB).release().build().perform();






	}

}
