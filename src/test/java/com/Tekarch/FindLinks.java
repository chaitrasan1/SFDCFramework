package com.Tekarch;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		// Finding all the available links on webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		
		//Traversing through the list and printing its text along with link address
		 for(WebElement link:links){
		 System.out.println(link.getText() + " - " + link.getAttribute("href"));
		 }
		// Iterating each link and checking the response status
		 for (WebElement link : links) {
		 String url = link.getAttribute("href");
		 verifyLink(url);
		 }


		 driver.quit();
		 }


		 public static void verifyLink(String url) {
		 try {
		 URL link = new URL(url);
		 HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		 httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
		 httpURLConnection.connect();


		 if (httpURLConnection.getResponseCode() == 200) {
			 
		 System.out.println(url + " - " + httpURLConnection.getResponseMessage());
		 } else {
		 System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
		 }
		 } catch (Exception e) {
		 System.out.println(url + " - " + "is a broken link");
		 }
		
		
	}

}
