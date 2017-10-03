package com.testng.codes;

import org.testng.annotations.Test;

public class DependsCodeAndException {

	  @Test (dependsOnMethods = { "OpenBrowser" })
	 
	  public void SignIn() {
	 
		  System.out.println("This will execute second (SignIn)");
	 
	  }
	 
	  @Test
	 
	  public void OpenBrowser() {
	 
		  System.out.println("This will execute first (Open Browser)");
	 
	  }
	 
	  @Test (dependsOnMethods = { "SignIn" }, alwaysRun=true)
	 
	  public void LogOut() {
	 
		  System.out.println("This will execute third (Log Out)");
	 
	  }
	  
	  @Test(expectedExceptions=ArithmeticException.class)
		public void dividedByZeroExample1(){
			int e = 1/0;
		}
}
