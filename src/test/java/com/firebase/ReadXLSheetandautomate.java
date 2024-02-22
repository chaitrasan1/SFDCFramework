package com.firebase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.firebase.utilities.XlUtils;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ReadXLSheetandautomate extends XlUtils{
	
	public static void studentRegistration() throws IOException, InterruptedException  {
		
		String path = "C:\\Users\\chait\\studentRegistrationData.xlsx";

		FileInputStream fi = new FileInputStream(new File(path));			 
		List<List<String>> allData = readAllDataFromXl(path,"Sheet1");
		
		int i=0;
		for(List<String> row :allData){
			if(i>0) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get( "https://qa-tekarch.firebaseapp.com/" );
			WebElement username = driver.findElementById("email_field");
			username.sendKeys("admin123@gmail.com");
			WebElement Password = driver.findElementById("password_field");
			Password.sendKeys("admin123");
			WebElement login = driver.findElementByXPath("//*[@id=\"login_div\"]/button");
			login.click();
			Thread.sleep(5000);
			WebElement name = driver.findElementById("name");
			name.sendKeys(row.get(0));
			WebElement lname = driver.findElementById("lname");
			lname.sendKeys(row.get(1));
			WebElement Address = driver.findElementById("postaladdress");
			Address.sendKeys(row.get(2));
			WebElement Paddress = driver.findElementById("personaladdress");
			Paddress.sendKeys(row.get(3));
			Thread.sleep(3000);
			driver.close();
			}
			
			i++;
			
		}
	
		
		/*
		 * XSSFWorkbook wb = new XSSFWorkbook(fi); XSSFSheet sheet=
		 * wb.getSheet("sheet1"); XSSFRow row= sheet.getRow(1); XSSFCell cell=
		 * row.getCell(0);
		 * 
		 * int size = sheet.getRow(0).getLastCellNum(); //System.out.println(size);
		 * for(int i=1;i<5;i++) { XSSFRow rowx = sheet.getRow(i ); for(int
		 * j=0;j<size;j++) { XSSFCell cellx= rowx.getCell(j); System.out.print(cellx
		 * +" "); } System.out.println(); } wb.close(); fi.close();
		 */		
				 
		  
		  
		 			
							
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			try {
				studentRegistration();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}

}
