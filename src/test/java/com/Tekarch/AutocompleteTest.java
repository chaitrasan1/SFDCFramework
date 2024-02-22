package com.Tekarch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;


public class AutocompleteTest extends BaseTest {
	public void autocomplete () throws InterruptedException {
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
	   WebElement autocomp = driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/div[3]/div/a[3]"));
	   autocomp.click();
	   Thread.sleep(3000);
	   WebElement country = driver.findElement(By.id("myInput"));
	   country.sendKeys("I");
		
		  List<WebElement> listofcountries = driver.findElements(By.xpath("//*[@id=\"myInputautocomplete-list\"]//div")); 
		  
		  
		  for(WebElement country1:listofcountries) {			  		  
			  if(country1.getText().equalsIgnoreCase("india")) {				  
				  country1.click(); 
				  break;
				  
			  }
		   }
		 	 
		
	}
		
		

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AutocompleteTest ob = new AutocompleteTest();
		ob.autocomplete();

	}

}
