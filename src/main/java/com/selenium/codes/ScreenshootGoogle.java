package com.selenium.codes;

	import java.io.File;
	 
	import java.io.IOException;
	 
	import org.apache.commons.io.FileUtils;
	 
	import org.openqa.selenium.OutputType;
	 
	import org.openqa.selenium.TakesScreenshot;
	 
	import org.openqa.selenium.WebDriver;
	 
	import org.openqa.selenium.firefox.FirefoxDriver;
	 
	import org.testng.annotations.Test;
	 
	public class ScreenshootGoogle {
	 
	 @Test
	 public void TestJavaS1()
	{
		 System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
	// Open Firefox
	 WebDriver driver=new FirefoxDriver();
	 
	// Pass the url
	driver.get("http://www.google.com");
	 
	// Take screenshot and store as a file format
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	 // now copy the  screenshot to desired location using copyFile //method
	FileUtils.copyFile(src, new File("D:/seleniumerror.png"));
	}
	 
	catch (IOException e)
	 {
	  System.out.println(e.getMessage());
	 
	 }
	 }
}
