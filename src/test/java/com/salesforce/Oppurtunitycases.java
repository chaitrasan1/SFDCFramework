package com.salesforce;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Tekarch.BaseTest;

public class Oppurtunitycases extends BaseTest{
	@Test
	public void case15() throws InterruptedException {
		launchBrowser("chrome");
		driver.get("https://login.salesforce.com/");
		WebElement username = driver.findElement(By.id("username"));
		enterText(username,"chaitz@san1.com" ,"username");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password,"Password@1234","password");
		WebElement loginbutton = driver.findElement(By.id("Login"));
		clickElement(loginbutton,"Login");
		Thread.sleep(5000);
		WebElement oppurtunity = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
		oppurtunity.click();
		WebElement dropdown = driver.findElement(By.id("fcf"));
		Select s = new Select(dropdown);
		List<WebElement>  options = s.getOptions();
		System.out.println("list of options present");
	
		for(int i=0;i<options.size();i++)  {
		
			System.out.println(options.get(i).getText());
		
		}
		
		
	}
	@Test
				public void case16() throws InterruptedException {
					//String popup;
					launchBrowser("chrome");
					driver.get("https://login.salesforce.com/");
					WebElement username = driver.findElement(By.id("username"));
					enterText(username,"chaitz@san1.com" ,"username");
					WebElement password = driver.findElement(By.id("password"));
					enterText(password,"Password@1234","password");
					WebElement loginbutton = driver.findElement(By.id("Login"));
					clickElement(loginbutton,"Login");
					Thread.sleep(5000);
					WebElement oppurtunity = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
					oppurtunity.click();
					WebElement newbutton = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
					newbutton.click();
					Thread.sleep(3000);
					WebElement oppname = driver.findElement(By.id("opp3"));
					oppname.click();
					oppname.sendKeys("Opt1");
					WebElement accname = driver.findElement(By.id("opp4"));
					accname.sendKeys("sForce");
					
					WebElement closedate = driver.findElement(By.id("opp9"));
					closedate.sendKeys("2/2/2024");
					WebElement amt = driver.findElement(By.id("opp7"));
					amt.click();
					WebElement stage = driver.findElement(By.id("opp11"));
					stage.click();
					Thread.sleep(1000);
					Select s = new Select(stage);
					s.selectByIndex(1);
			amt.click();
					
					WebElement leadsource = driver.findElement(By.id("opp6"));
					leadsource.click();
					WebElement dd = driver.findElement(By.xpath("//*[@id=\"opp6\"]/option[3]"));
					dd.click();
					WebElement PCE = driver.findElement(By.id("opp17"));
					PCE.sendKeys("Test");
					PCE.click();
					WebElement save = driver.findElement(By.xpath("//*[@id='bottomButtonRow']/input[1]"));
					save.click();
					
					
					
				
	}
	@Test
public void case17() throws InterruptedException {
	launchBrowser("chrome");
	driver.get("https://login.salesforce.com/");
	WebElement username = driver.findElement(By.id("username"));
	enterText(username,"chaitz@san1.com" ,"username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password,"Password@1234","password");
	WebElement loginbutton = driver.findElement(By.id("Login"));
	clickElement(loginbutton,"Login");
	Thread.sleep(5000);
	WebElement oppurtunity = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	oppurtunity.click();
	WebElement pipeline = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a"));
	pipeline.click();
	
}
	@Test
public void case18() throws InterruptedException {
	launchBrowser("chrome");
	driver.get("https://login.salesforce.com/");
	WebElement username = driver.findElement(By.id("username"));
	enterText(username,"chaitz@san1.com" ,"username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password,"Password@1234","password");
	WebElement loginbutton = driver.findElement(By.id("Login"));
	clickElement(loginbutton,"Login");
	Thread.sleep(5000);
	WebElement oppurtunity = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	oppurtunity.click();
	WebElement stuckopp = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a"));
	stuckopp.click();
	
	
}
	@Test
public void case19() throws InterruptedException {
	launchBrowser("chrome");
	driver.get("https://login.salesforce.com/");
	WebElement username = driver.findElement(By.id("username"));
	enterText(username,"chaitz@san1.com" ,"username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password,"Password@1234","password");
	WebElement loginbutton = driver.findElement(By.id("Login"));
	clickElement(loginbutton,"Login");
	Thread.sleep(5000);
	WebElement oppurtunity = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	oppurtunity.click();
	WebElement interval = driver.findElement(By.id("quarter_q"));
	Select s = new Select(interval);
	s.selectByIndex(0);
	WebElement include = driver.findElement(By.id("open"));
	Select s1 = new Select(include);
	s1.selectByIndex(1);
	WebElement run = driver.findElement(By.xpath("//*[@id=\"lead_summary\"]/table/tbody/tr[3]/td/input"));
	run.click();
	Thread.sleep(3000);
	String expRange = "Current FQ";
	String expStatus = "Open";
	WebElement range = driver.findElement(By.xpath("//*[@id=\"quarter_q\"]"));	
	Select srange = new Select(range);
	String actualRange = srange.getFirstSelectedOption().getText();
	WebElement status = driver.findElement(By.xpath("//*[@id=\"open\"]"));
	Select sstatus = new Select(status);
	String actualStatus = sstatus.getFirstSelectedOption().getText();
	if(expRange.equals(actualRange) && expStatus.equals(actualStatus)) {
		System.out.println("Search criteria matches");
	}
	else{
		System.out.println("Search criteria does not matches");
	}
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Oppurtunitycases ob = new Oppurtunitycases();
		//ob.case15();
		ob.case16();
		//ob.case17();
		//ob.case18();
		//ob.case19();
		
	}

}
