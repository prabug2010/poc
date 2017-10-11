package com.testng.codes;

import org.testng.annotations.Test;

public class DependsCodeAndException {

	  @Test (dependsOnMethods = { "openBrowser" })
	 
	  public void signIn() {
	 
		  System.out.println("This will execute second (SignIn)");
	 throw new RuntimeException();
	  }
	 
	  @Test
	 
	  public void openBrowser() {
	 
		  System.out.println("This will execute first (Open Browser)");
	 
	  }
	  
	  @Test (dependsOnMethods = { "signIn" })
		 
	  public void home() {
	 
		  System.out.println("This will execute third (Home)");
	 
	  }
	 
	  @Test (dependsOnMethods = { "signIn" }, alwaysRun=true)
	 
	  public void logOut() {
	 
		  System.out.println("This will execute fourth (Log Out)");
	 
	  }
	  
	  @Test(expectedExceptions=ArithmeticException.class)
		public void dividedByZeroExample1(){
			int e = 1/0;
		}
}
