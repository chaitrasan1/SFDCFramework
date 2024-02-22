package com.Tekarch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2Assigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		WebElement hradiobutton= driver.findElementById("hondaradio");
		hradiobutton.click();
		boolean hr ;
		hr = hradiobutton.isSelected();
		if(hr==true) {
			System.out.println(" Honda Radio button is selected");
		}
		
		WebElement checkbox =driver.findElementById("bmwcheck");
		WebElement checkbox1 = driver.findElementById("hondacheck");
		checkbox.click();
		checkbox1.click();
		WebElement checkbox2 = driver.findElementById("benzcheck");
		boolean bz,bmw,honda;
		bz = checkbox2.isSelected();
		bmw = checkbox.isSelected();
		honda =checkbox1.isSelected();
		if(bz==false && bmw==true && honda == true) {
			
			System.out.println("BMW and Honda is selected");
		}
		
		WebElement hidebutton = driver.findElementById("hide-textbox");
		hidebutton.click();
		hidebutton.isEnabled();
		System.out.println("The tab is hidden");
		/*String expStyle = "display: none;";
		String actStyle= driver.findElementById("displayed-text").getAttribute("style");;
		System.out.println(actStyle);
		if(actStyle.equals(expStyle)) {
			System.out.println("testbox is hidden");
		}
		else {
			System.out.println("not hidden");
		}*/
		
		
		WebElement disbutton = driver.findElementById("disabled-button");
		disbutton.click();
		boolean  text = driver.findElementById("enabled-example-input").isEnabled();
		System.out.println(text);
		if(text == false) {
			System.out.println("testbox is disabled");
		}
		
		driver.navigate().refresh();
		driver.navigate().back();
		
		//driver.close();
	}

}
