package com.testng.day2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
	
	@DataProvider(name="studentdata")
	public Object[][] MydataProvider() {
		//ExcelUtils.readAllDataFromXl(null, null);
		
		String[][] a=new String[3][4];
		a[0][0]="aana";
		a[0][1]="a@gmail.com";
		a[0][2]="24";
		a[0][3]="student";
		
		a[1][0]="banu";
		a[1][1]="banu@gmail.com";
		a[1][2]="34";
		a[1][3]="trainer";
		
		a[2][0]="john";
		a[2][1]="john@gmail.com";
		a[2][2]="22";
		a[2][3]="student";
		return a;
		
	}
	
	@Test(dataProvider = "studentdata")
	public void printDetails(String name,String id,String age,String role) {
		System.out.println("testscript started");
		// print sinlge student information(name,gmail,age,role)
		System.out.println("name="+name+" id="+id+" age="+age+" and role="+role);
		System.out.println("testcript ended");
	}

}


