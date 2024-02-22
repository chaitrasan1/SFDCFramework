package com.Tekarch;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Tables extends BaseTest {
	public void firebasetable() throws InterruptedException {
		launchBrowser("chrome");
		goToUrl("https://qa-tekarch.firebaseapp.com/");
		WebElement username = driver.findElement(By.id("email_field"));
		username.sendKeys("admin123@gmail.com");
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"login_div\"]/button"));
		loginbutton.click();
		Thread.sleep(3000);
		WebElement widget = driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/div[3]/button"));
	   Actions action = new Actions(driver);
	   action.moveToElement(widget);
	   widget.click();
	   WebElement table = driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/div[3]/div/a[1]"));
	   table.click();
	   Thread.sleep(3000);
	   WebElement allTable= driver.findElement(By.xpath("//table/tbody"));
		 List<WebElement> headers=  allTable.findElements(By.xpath("//tr/th"));
		 for(WebElement header:headers) {
			 System.out.print(header.getText()+" ");
		 }
		 //get all rows 
		 List<WebElement> rows= allTable.findElements(By.xpath("//tr"));
		 
		 //Iterate through each row
		 for(WebElement row:rows) {
			 // Use tagName instead of xPath to get all td(data) under each tr(row)
			 List<WebElement> Datas= row.findElements(By.tagName("td")); 
			 System.out.println(row.getText());
			 //Iterate through all td(data) in row and display each td(data)			 
			/* for(WebElement Data:Datas) {
				 System.out.print(Data.getText()+" ");
			 }
			 
			 //Go to new line after displaying all data for each row
			 System.out.println();*/
		}
		 
		 
	
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Tables ob = new Tables();
		ob.firebasetable();
		
		}

	}


