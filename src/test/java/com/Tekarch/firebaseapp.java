package com.Tekarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firebaseapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get( "https://qa-tekarch.firebaseapp.com/" );
		WebElement username = driver.findElementById("email_field");
		username.sendKeys("admin123@gmail.com");
		WebElement Password = driver.findElementById("password_field");
		Password.sendKeys("admin123");
		WebElement login = driver.findElementByXPath("//*[@id=\"login_div\"]/button");
		login.click();
		Thread.sleep(5000);
		WebElement name = driver.findElementById("name");
		name.sendKeys("Aana");
		WebElement lname = driver.findElementById("lname");
		lname.sendKeys("John");
		WebElement Address = driver.findElementById("postaladdress");
		Address.sendKeys("23045");
		WebElement Paddress = driver.findElementById("personaladdress");
		Paddress.sendKeys("xyz");
		WebElement gender = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/span[2]/input"));
		
		System.out.println("b"+gender.getAttribute("value").toString());
		if(!gender.isSelected()) {
			gender.click();
		}
		
		System.out.println("A" +gender.getAttribute("value").toString());
		
		WebElement cityDropDown= driver.findElement(By.id("city"));
		Select se=new Select(cityDropDown);
		//se.selectByVisibleText("MUMBAI");
		se.selectByIndex(3);
		
		WebElement CDropDown=  driver.findElementById("Course");
		Select se1 =new Select(CDropDown);
		se1.selectByValue("mca");
		
		WebElement DistrictDropDown=  driver.findElementById("district");
		Select se2 =new Select(DistrictDropDown);
		se2.selectByVisibleText("GOA");
		
		WebElement State=  driver.findElementById("State");
		Select se3 =new Select(State);
		se3.selectByIndex(3);
		
		WebElement Pin = driver.findElementById("pincode");
		Pin.sendKeys("1234");
		WebElement EmailID = driver.findElementById("emailid");
		EmailID.sendKeys("abc@teckarch.com");
		Thread.sleep(10000);
		driver.close();
				
		
		
		
		
		
		
	}

}
