package com.salesforce;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UserMenuDropDown extends  SFDCLoginMethod {
	@Test
	public void case5() throws InterruptedException {
		login();
		WebElement downArrow = driver.findElement(By.xpath("//*[@id=\"userNav\"]"));
		downArrow.click();
		WebElement usermenu = driver.findElement(By.id("userNav-menuItems"));
		List<WebElement> rows = usermenu.findElements(By.tagName("a"));
		for(WebElement row:rows) {
			List<WebElement> datas = row.findElements(By.tagName("td"));
			System.out.println("list in usermenu : " +row.getText());
		}
			
		String[] actuallist= {" My Profile"," My Settings","Developer Console","Switch to Lightning Experience","Logout"};
		List<WebElement> actuallis =rows;
		List<WebElement> datas = null;
		if(actuallis==datas) {
			System.out.println("list matched");
		}
		else {
			System.out.println("list not matched");
		}
		driver.close();
	}	
	@Test
		public void case6() throws InterruptedException {
			login();
			driver.manage().window().maximize();
			WebElement downArrow = driver.findElement(By.xpath("//*[@id=\"userNav\"]"));
			downArrow.click();
			WebElement myprofile = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
			myprofile.click();
			WebElement dd = driver.findElement(By.id("moderatorMutton"));
			dd.click();
			WebElement edit = driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[1]/div/div[1]/div[1]/div/ul/li[2]/a"));
			edit.click();
			
			  List<WebElement> iframeElements =
			  driver.findElements(By.id("aboutMeContentId"));
			  System.out.println("Total number of iframes are " + iframeElements.size());
			  driver.switchTo().frame(1); WebElement lastname =
			  driver.findElement(By.id("lastName")); lastname.clear();
			  lastname.sendKeys("Sreerama"); WebElement saveall
			  =driver.findElement(By.xpath(
			  "//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
			  saveall.click();
			 
			
			/*
			 * List<WebElement> iframes =
			 * driver.findElements(By.xpath("xpath=//a[@id='publisherAttachTextPost']/span")
			 * ); System.out.println("Total number of iframes are " + iframes.size());
			 * driver.switchTo().frame(1);
			 */
			
			
			WebElement test = driver.findElement(By.xpath(" "));
			test.click();			
			WebElement post = driver.findElement(By.xpath("//body"));
			post.sendKeys("Hello");
			
			
		}
	@Test
		public void case8() throws InterruptedException {
			login();
			driver.manage().window().maximize();
			WebElement downArrow = driver.findElement(By.xpath("//*[@id=\"userNav\"]"));
			downArrow.click();
			WebElement developersconsole = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[3]"));
			developersconsole.click();
			
		}
	@Test
		public void case9() throws InterruptedException {
			login();
			driver.manage().window().maximize();
			WebElement downArrow = driver.findElement(By.xpath("//*[@id=\"userNav\"]"));
			downArrow.click();
			WebElement logout = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
			logout.click();
			
		}
		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		UserMenuDropDown ob = new UserMenuDropDown();
		//ob.case5();
		ob.case6();
		//ob.case8();
		//ob.case9();

	}

}
