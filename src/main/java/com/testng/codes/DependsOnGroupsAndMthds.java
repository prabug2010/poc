package com.testng.codes;

import org.testng.annotations.Test;

public class DependsOnGroupsAndMthds {

	@Test(dependsOnGroups = {"m2","m3"})
	public void m1()
	{
		System.out.println("m1");
	}
	@Test(groups = {"m2"})
	public void m2()
	{
		System.out.println("m2");
	}
	@Test(groups = {"m3"})
	public void m3()
	{
		System.out.println("m3");
	}
	
	 @Test(dependsOnMethods = { "testTwo", "testThree" })
	    public void testOne() {
	        System.out.println("Test method one");
	    }
	 
	    @Test
	    public void testTwo() {
	        System.out.println("Test method two");
	    }
	 
	    @Test
	    public void testThree() {
	        System.out.println("Test method three");
	    }
	
}
