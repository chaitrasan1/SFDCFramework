package com.testng.day2;

import org.testng.annotations.Test;

public class TestNGGroupsExample {
	@Test(groups = { "sanity", "regression" })
    public void testMethod1() {
        System.out.println("Test Method 1 executed");
    }

    @Test(groups = { "sanity" })
    public void testMethod2() {
        System.out.println("Test Method 2 executed");
    }

    @Test(groups = { "regression" })
    public void testMethod3() {
        System.out.println("Test Method 3 executed");
    }

    @Test(groups = { "smoke" })
    public void testMethod4() {
        System.out.println("Test Method 4 executed");
    }
}


