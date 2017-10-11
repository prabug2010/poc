package com.testng.codes;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryCode {

	public class SimpleTest
	{
	    private String param = "";
	 
	    public SimpleTest(String param) {
	        this.param = param;
	    }
	 
	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("Before SimpleTest class executed.");
	    }
	 
	    @Test
	    public void testMethod() {
	        System.out.println("testMethod parameter value is: " + param);
	    }
	    
	    @Test
	    public void method1() {
	        System.out.println("testMethod parameters values is: " + param);
	    }
	}
	 
	public class SimpleTestFactory
	{
	    @Factory
	    public Object[] factoryMethod() {
	        return new Object[] {
	                                new SimpleTest("one"),
	                                new SimpleTest("two")
	                            };
	    }
	}
	
}