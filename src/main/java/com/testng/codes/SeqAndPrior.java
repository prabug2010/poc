package com.testng.codes;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;
 
public class SeqAndPrior {

		public WebDriver driver;
	 
	  @Test(priority = 0)
	 
	  public void One() {
	 
	      System.out.println("This is the Test Case number One");
	 
	  }
	 
	  @Test(priority = 1, enabled = false)
	 
	  public void Two() {
	 
		  System.out.println("This is the Test Case number Two");
	 
	  }
	 
	  @Test(priority = 2)
	 
	  public void Three() {
	 
		  System.out.println("This is the Test Case number Three");
	 
	  }
	 
	  @Test(priority = 3)
	 
	  public void Four() {
	 
		  System.out.println("This is the Test Case number Four");
	 
	  }
	 
	}