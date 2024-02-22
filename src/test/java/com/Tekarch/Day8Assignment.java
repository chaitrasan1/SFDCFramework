package com.Tekarch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Day8Assignment extends BaseTest {
	public void firstAssignment () throws InterruptedException {
		
		//launchBrowser("chrome");
		//goToUrl("https://demoqa.com/webtables ");
		Thread.sleep(3000);
		WebElement tablebody = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]"));
		System.out.println(tablebody);
		//get all divs under tablebody
		List<WebElement> divs= tablebody.findElements(By.tagName("div"));
		
		for(WebElement w : divs) {
			if(w.getAttribute("role")!=null && w.getAttribute("role").equalsIgnoreCase("row")) {
			   //Get divs under row 
			    List<WebElement> datas = w.findElements(By.tagName("div"));
				
				boolean row=false;
				//Iterate and find row having Alden
				for(WebElement data: datas) {
					if(data.getText().equalsIgnoreCase("Alden")) {
						row=true;
						System.out.println("Found Alden "+ data.getText());
						break;
					}
				}
				//Iterate through row having Alden
				 if(row) {
					 for(WebElement data: datas) {					 
						 //get div having buttons
						if(data.getAttribute("class").equalsIgnoreCase("action-buttons")){
							List<WebElement> btns = data.findElements(By.tagName("span"));
							System.out.println("B:"+btns.size());
							
							for(WebElement button : btns) {
								System.out.println(button.getAttribute("title").toString());
								if(button.getAttribute("title").toString().equalsIgnoreCase("Delete")) {
									button.click();
									break;
								}
							}
						}
					 } 
				 }
			}
		}
		
	}
	
	public void secondAssignment () throws InterruptedException {
		launchBrowser("chrome");
		goToUrl("http://the-internet.herokuapp.com/tables   ");
		Thread.sleep(3000);
		WebElement tbody = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody"));
		List<WebElement> rows = tbody.findElements(By.xpath("//tr"));
		for(WebElement row:rows) {
			List<WebElement> datas = row.findElements(By.tagName("td"));
			
			  for(WebElement data:datas) {
				 if( data.getText().contains("$50.00")) {
					 System.out.println("$50.00 Due for : "+ datas.get(1).getText() + " " + datas.get(0).getText());
				 }
				  
			  }
			  
		}
		
	}
public void closingdateForOpprtunity () throws InterruptedException {
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
	  WebElement allTable= driver.findElement(By.xpath("//table/tbody"));
		 List<WebElement> headers=  allTable.findElements(By.xpath("//tr/th"));
		 for(WebElement header:headers) {
			 System.out.print(header.getText()+" ");
		 }
		 WebElement cDate = driver.findElement(By.id("opp9"));
		 cDate.click();
		 WebElement month =driver.findElement(By.id("calMonthPicker"));
		 Select s1 = new Select(month);
		 s1.selectByIndex(6);
		 month.click();
		 WebElement year = driver.findElement(By.id("calYearPicker"));
		 Select s2 = new Select(year);
		 s2.selectByValue("2025");
		 year.click();
		// cDate.click();
		 
		 WebElement tBody = driver.findElement(By.xpath("//*[@id=\"datePickerCalendar\"]/tbody"));
		 //get all rows 
		 List<WebElement> rows= tBody.findElements(By.xpath("tr/td"));
		 
		 
		 //Iterate through each row
		/* for(WebElement row:rows) {
			 // Use tagName instead of xPath to get all td(data) under each tr(row)
			 List<WebElement> Datas= row.findElements(By.tagName("td")); 
			 for(WebElement data:Datas) {
				 if(data.getText().equalsIgnoreCase("17")){
					 data.click();
				 }
			 }*/
		 for(WebElement row:rows) {
			 if(row.getText().equalsIgnoreCase("17")){
				 row.click();
				
			 }			 
		 }
}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Day8Assignment ob = new Day8Assignment();
		//ob.firstAssignment();
		//
		ob.secondAssignment();
		//ob.closingdateForOpprtunity();
		
	}

}
