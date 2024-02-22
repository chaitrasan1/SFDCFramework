package com.salesforce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.firebase.utilities.FirebaseListenerutility;

public class SFDCcontacts extends SFDCLoginMethod  {
protected Logger AutomationScriptslog=LogManager.getLogger();
	
	
	
	@Test
	public void caseTc25 () throws InterruptedException {
		login();
		WebElement contact = driver.findElement(By.id("Contact_Tab"));
		contact.click();
		WebElement newbutton = driver.findElement(By.name("new"));
		newbutton.click();
		WebElement lname = driver.findElement(By.id("name_lastcon2"));
		lname.sendKeys("Rama");
		WebElement accname = driver.findElement(By.id("con4"));
		accname.sendKeys("Sandeep");
		WebElement save = driver.findElement(By.name("save"));
		save.click();
		
	}
	@Test
	public void caseTC26() throws InterruptedException {
		login();
		WebElement contact = driver.findElement(By.id("Contact_Tab"));
		contact.click();
		WebElement createNewView = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
		 createNewView.click();
		 WebElement viewname = driver.findElement(By.id("fname"));
		 viewname.sendKeys("Appu");
		 WebElement uniquename = driver.findElement(By.id("devname"));
		 uniquename.click();
		 WebElement save = driver.findElement(By.name("save"));
		 save.click();
		
		 
	}
	@Test
	public void caseTC27() throws InterruptedException {
		login();
		WebElement contact = driver.findElement(By.id("Contact_Tab"));
		contact.click();
		WebElement dropdown = driver.findElement(By.id("hotlist_mode"));
		dropdown.click();
		WebElement recentlycreated = driver.findElement(By.xpath("//*[@id=\"hotlist_mode\"]/option[1]"));
		recentlycreated.click();
		
	}
	@Test
	public void caseTC28() throws InterruptedException {
		login();
		driver.manage().window().maximize();
		WebElement contact = driver.findElement(By.id("Contact_Tab"));
		contact.click();
		WebElement dropdown = driver.findElement(By.id("fcf"));
		dropdown.click();
		WebElement mycontact =driver.findElement(By.xpath("//*[@id=\"fcf\"]/option[5]"));
		mycontact.click();
		WebElement go = driver.findElement(By.name("go"));
		go.click();	
	}
	@Test
	public void caseTC29() throws InterruptedException {
		String expmsg = "Contact: Smith ~ Salesforce - Developer Edition";
		login();
		driver.manage().window().maximize();
		WebElement contact = driver.findElement(By.id("Contact_Tab"));
		contact.click();
		WebElement contactname = driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"));
		contactname.click();
		 String actmsg = driver.getTitle();
		 System.out.println(driver.getTitle());
		 if(expmsg.equals(actmsg)) {
			 System.out.println("Page matched");
		 }
		 else {
			 System.out.println("page not matched");
		 }
		
		
	}
	@Test
	public void CaseTc30() throws InterruptedException {
		String expmsg = "Error: You must enter a value";
		login();
		driver.manage().window().maximize();
		WebElement contact = driver.findElement(By.id("Contact_Tab"));
		contact.click();
		WebElement createnewview = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
		createnewview.click();
		WebElement uniquename = driver.findElement(By.id("devname"));
		uniquename.sendKeys("EFGH");
		WebElement save = driver.findElement(By.name("save"));
		save.click();
		WebElement errormsg = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[2]"));
		  errormsg.getText();
		 String  actmsg = errormsg.getText();
		System.out.println("Erroe Message = " +errormsg.getText());
		if(expmsg.equals(actmsg)) {
			 System.out.println("Page matched");
		 }
		 else {
			 System.out.println("page not matched");
		 }
		
	}
	@Test
	public void CaseTC31 () throws InterruptedException {
		
		login();
		driver.manage().window().maximize();
		WebElement contact = driver.findElement(By.id("Contact_Tab"));
		contact.click();
		WebElement createnewview = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
		createnewview.click();
		WebElement viewname = driver.findElement(By.id("fname"));
		viewname.sendKeys("ABCD"); 
		WebElement uniquename = driver.findElement(By.id("devname"));
		uniquename.sendKeys("EFGH");
		WebElement cancel = driver.findElement(By.name("cancel"));
		cancel.click();
		
	}
	@Test
	public void CaseTc32() throws InterruptedException {
		login();
		driver.manage().window().maximize();
		WebElement contact = driver.findElement(By.id("Contact_Tab"));
		contact.click();
		WebElement newbutton = driver.findElement(By.name("new"));
		newbutton.click();
		WebElement lastname = driver.findElement(By.id("name_lastcon2"));
		lastname.sendKeys("Indian");
		WebElement accname = driver.findElement(By.id("con4"));
		accname.sendKeys("global Media");
		WebElement save = driver.findElement(By.name("save"));
		save.click();
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SFDCcontacts c = new SFDCcontacts();
		//c.caseTc25();
		//c.caseTC26();
		//c.caseTC27();
		//c.caseTC28();
		//c.caseTC29();
		//c.CaseTc30();
		//c.CaseTC31();
		c.CaseTc32();

	}

}
