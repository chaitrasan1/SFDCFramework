package com.testng.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgTest11 extends BaseTest {
	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("inside beforeclass   setUpClass");
	}
	@AfterClass
	public static void tearDownclass() {
		System.out.println("inside afterclass  tearDownclass");
	}
	
	
	
	/*@BeforeMethod
	public void setUpMethod12(){
		System.out.println("inside beforeMethod TestNgTestOne class setUpMethod12....................");
	}
	
	@AfterMethod
	public static void tearDownMethod() {
		
		System.out.println("inside afterMethod TestNgTestOne class tearDownMethod");
	}
	*/
	@Test
	public void testscript_1() { // testng test method
		System.out.println("im am in testscript_1 method in TestNgTestOne class");
	}

	@Test
	public void testscript_2() {
		System.out.println("im am in testscript_2 method in TestNgTestOne class");
		//int i=10/0;
		//System.out.println("after exception");
	}

	@Test
	public void testscript_3() {
		System.out.println("im am in testscript_3 method in TestNgTestOne class");
	}


}
