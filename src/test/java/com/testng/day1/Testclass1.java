package com.testng.day1;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Tekarch.BaseTest;

public class Testclass1 extends BaseTest {
	@Parameters({"browser","version"})
	@Test
	public void login(String name ,String ver) {
		System.out.println("in login method from testClass1");
		
	}
	
}
