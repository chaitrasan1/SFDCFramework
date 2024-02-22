package com.salesforce;


import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Leads extends SFDCLoginMethod{
	
	@Test
	public void case20() throws InterruptedException   {
		
		login();
		WebElement Leads = driver.findElement(By.id("Lead_Tab"));
		Actions action = new Actions(driver);
		action.moveToElement(Leads).build().perform();
		Leads.click();
		driver.getTitle().startsWith("Leads: Home");
		if(driver.getTitle().startsWith("Leads: Home")) {
			System.out.println("Verifies Leads HomePage");
		}
		else {
			System.out.println("error:"+driver.getTitle());
		}
		driver.close();	
		
	}
	@Test
	public void case21() throws InterruptedException {
		login();
		Thread.sleep(5000);
		WebElement Leads = driver.findElement(By.id("Lead_Tab"));
		Actions action = new Actions(driver);
		action.moveToElement(Leads).build().perform();
		Leads.click();
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.id("fcf"));
		dropdown.click();
		//Expected options		
		String expOptions[] = {"All Open Leads","My Unread Leads", "Recently Viewed Leads", "Today's Leads","View - Custom 1","View - Custom 2"};	
		
		//Actual options
		Select se = new Select(dropdown);
		List<WebElement>  options = se.getOptions();
		
		
		boolean match=true;
		for(int i=0;i<options.size();i++)  {
			String exp = expOptions[i];
			String actual = options.get(i).getText();
			if(!exp.equals(actual)) {
				match=false;
				System.out.println("Mismatch:Expected: "+exp +" Actual:"+actual);
			}
		}
		
		if(match == false) {
			System.out.println("Options do not match");
		}
		else {
			System.out.println("Options match");
		}
		driver.close();
	}
	@Test
public void Case22() throws InterruptedException {
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
	WebElement Leads = driver.findElement(By.id("Lead_Tab"));
	Actions action = new Actions(driver);
	action.moveToElement(Leads).build().perform();
	Leads.click();
	Thread.sleep(3000);
	WebElement dropdown = driver.findElementById("fcf");
	dropdown.click();
	WebElement MyUnreadLeads = driver.findElement(By.xpath("//*[@id=\"fcf\"]/option[2]"));
	MyUnreadLeads.click();
	WebElement go = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[1]/input"));
	go.click();
	Thread.sleep(2000);
	WebElement username1 = driver.findElementById("userNavButton");
	username1.click();
	WebElement logout = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[5]"));
	logout.click();
	Thread.sleep(5000);
	WebElement username2 = driver.findElementById("username");
	username2.sendKeys("chaitz@san1.com");
	WebElement password1 = driver.findElementById("password");
	password1.sendKeys("Password@1234");
	WebElement loginbutton1 = driver.findElementById("Login");
	loginbutton1.click();
	Thread.sleep(5000);
	WebElement Leads1 =  driver.findElement(By.id("Lead_Tab"));
	Leads1.click();
	WebElement dropdown1 = driver.findElementById("fcf");
	dropdown1.click();
	WebElement Go1 = driver.findElementByXPath("//*[@id=\"filter_element\"]/div/span/span[1]/input");
	Go1.click();
	driver.close();
	
	
}
	@Test
public void case23() throws InterruptedException {
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
	WebElement Leads = driver.findElement(By.id("Lead_Tab"));
	Actions action = new Actions(driver);
	action.moveToElement(Leads).build().perform();
	Leads.click();
	Thread.sleep(3000);
	WebElement dropdown = driver.findElementById("fcf");
	dropdown.click();
	dropdown.getText();
	System.out.println(	dropdown.getText());
	WebElement MyUnreadLeads = driver.findElement(By.xpath("//*[@id=\"fcf\"]/option[4]"));
	MyUnreadLeads.click();
	WebElement go = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[1]/input"));
	go.click();
	
	driver.close();
	
}
	@Test
public void Case24() throws InterruptedException {
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
	WebElement Leads = driver.findElement(By.id("Lead_Tab"));
	Actions action = new Actions(driver);
	action.moveToElement(Leads).build().perform();
	Leads.click();
	WebElement newbutton = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
	newbutton.click();
	WebElement lname = driver.findElement(By.id("name_lastlea2"));
	lname.sendKeys("ABCD");
	WebElement company = driver.findElement(By.id("lea3"));
	company.sendKeys("ABCD");
	WebElement savebutton = driver.findElement(By.xpath("//td[@id='topButtonRow']/input[1]"));
	savebutton.click();
	driver.close();
	
}
		

	
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	Leads ob = new Leads();
	//ob.case20();
	//ob.case21();
	//ob.Case22();
	//ob.case23();
	//ob.Case24();
}
}