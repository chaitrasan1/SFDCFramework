package com.Tekarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6SelAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(3000);
		WebElement ParentIframe = driver.findElement(By.xpath("//*[@id=\"frame1\"]"));
		
		driver.switchTo().frame(ParentIframe);
		WebElement name1 = driver.findElementByTagName("body");
		System.out.println( "ParentIFrame Text:" +name1.getText());
		
		WebElement ChildIframe = driver.findElement(By.xpath("/html/body/iframe"));
	    driver.switchTo().frame(ChildIframe);
	    WebElement name2 = driver.findElementByTagName("p");
	    System.out.println( "ChildIFrame Text:" +name2.getText());
	    

	    
	}

}
