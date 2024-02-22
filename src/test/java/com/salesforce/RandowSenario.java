package com.salesforce;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RandowSenario extends  SFDCLoginMethod {
	
	
	@Test
	public void CaseTC33() throws InterruptedException {
		login();
		 String ActualName = "chaitra sandeep";
		driver.manage().window().maximize();
		WebElement home = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a "));
		home.click();
		WebElement name = driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a"));
		name.getText();
		
		System.out.println("Name = " +name.getText());
		String ExpectedName = name.getText();
		System.out.println(ExpectedName);
		if(ActualName.equals(ExpectedName)) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Not Matched");
		}
		name.click();
		 String ActualTitle = driver.getTitle();
		 System.out.println(driver.getTitle());
		 WebElement myprofile =driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
		 Thread.sleep(3000);
				 myprofile.click();
				
		String ProfileTitle = driver.getTitle();
		System.out.println( driver.getTitle());
		if( ActualTitle.equals(ProfileTitle)) {
			System.out.println("Case passed ");
		}
		else {
			System.out.println("CaseFailed");
		}
		
	}
	@Test
	public void CaseTc34() throws InterruptedException {
		login();
		 String ActualName = "chaitra sandeep";
		driver.manage().window().maximize();
		WebElement home = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a "));
		home.click();
		WebElement name = driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a"));
		name.click();
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
		edit.click();
		WebElement popup = driver.findElement(By.id("contactInfo"));
		Actions action = new Actions(driver);
		action.moveToElement(popup).build().perform();
		WebElement phone = driver.findElement(By.id("cell"));
		phone.click();
		WebElement about = driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
		about.click();
		
	}
	@Test
	public void CaseT35() throws InterruptedException {
		login();
		// String ActualName = "chaitra sandeep";
		driver.manage().window().maximize();
		WebElement alltab = driver.findElement(By.id("AllTab_Tab"));
		alltab.click();
		WebElement customisetabs = driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/table/tbody/tr/td[2]/input"));
		 customisetabs.click();
		 WebElement casestab = driver.findElement(By.xpath("//*[@id=\"duel_select_1\"]/option[11]"));
		 casestab.click();
		 WebElement removebutton = driver.findElement(By.xpath("//*[@id=\"duel_select_0_left\"]/img"));
		 removebutton.click();
		 WebElement save = driver.findElement(By.name("save"));
		 save.click();
		 WebElement username = driver.findElement(By.id("userNavButton"));
		 username.click();
		 WebElement logout = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		 logout.click();
		 login();
		 
		 driver.close();
		
	}
	@Test
	public void CaseTc36() throws InterruptedException {
		login();
		WebElement home = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a "));
		home.click();
		WebElement dateandtime = driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[2]/a"));
		dateandtime.click();
		WebElement eightPM = driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:4:j_id64\"]/a"));
		eightPM.click();
		WebElement subicon = driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img"));
		subicon.click();
		WebElement other = driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]"));
		other.click();
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RandowSenario Rs = new RandowSenario ();
		//Rs.CaseTC33();
		//Rs.CaseTc34();
		//Rs.CaseT35();
Rs.CaseTc36();
	}

}
