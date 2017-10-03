package com.selenium.codes;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFiles {
 
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
  
// Create a profile
FirefoxProfile profile=new FirefoxProfile();
 
// Set preferences for file type 
profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
  
// Open browser with profile                   
WebDriver driver=new FirefoxDriver(profile);
  
// Set implicit wait
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

// Open APP to download application
//driver.get("http://www.filehippo.com/download_adobe_reader");

driver.get("http://toolsqa.com/automation-practice-form/");
  
// Click on download 
driver.findElement(By.linkText("Test File to Download")).click();
    
 }
 
}