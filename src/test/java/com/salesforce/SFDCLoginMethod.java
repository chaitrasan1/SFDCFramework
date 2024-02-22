package com.salesforce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;

import com.firebase.utilities.ExtentReportsUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.firebase.utilities.FirebaseListenerutility.class)
public class SFDCLoginMethod{
	protected Logger log=LogManager.getLogger();
	protected ExtentReportsUtility  extentReport = ExtentReportsUtility.getInstance();

	
	protected WebDriver driver = null;

	public void login () throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		log.info("....chromedriver is intiated.....");
		driver.get("https://login.salesforce.com/");
		log.info(".......url has been opened.......");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("chaitz@san1.com");
		log.info("Username is entered");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Password@1234");
		log.info("Password is entered");
		
		WebElement loginbutton = driver.findElement(By.id("Login"));
		loginbutton.click();
		Thread.sleep(5000);
		System.out.println("Login in to salesforce application");
		log.info(".......salesforce login is succesful.......");
	}
	
	public  void leads() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement username = driver.findElementById("username");
		username.sendKeys("chaitz@san1.com");
		WebElement password = driver.findElementById("password");
		password.sendKeys("Password@1234");
		WebElement loginbutton = driver.findElementById("Login");
		loginbutton.click();
		Thread.sleep(5000);
		WebElement Leads = driver.findElement(By.xpath("//ul[@id='tabBar']/li[7]"));
		Actions action = new Actions(driver);
		action.moveToElement(Leads).build().perform();
		Leads.click();
	}
	
	public static void oppurtunity() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	WebElement username = driver.findElementById("username");
	username.sendKeys("chaitz@san1.com");
	WebElement password = driver.findElementById("password");
	password.sendKeys("Password@1234");
	WebElement loginbutton = driver.findElementById("Login");
	loginbutton.click();
	Thread.sleep(5000);
	WebElement oppurtunity = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	oppurtunity.click();
	
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

	}

}
