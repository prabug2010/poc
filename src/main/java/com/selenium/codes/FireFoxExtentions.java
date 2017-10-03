package com.selenium.codes;

import java.io.File;
import java.io.IOException;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
 
public class FireFoxExtentions {
	private static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
		//Save the path of the XPI files as per your saved location
		String firebugPath = "C:\\Users\\pgunasekaran\\Downloads\\firebug-3.0.0-alpha.12.xpi";
		
		
		//Create a new Profile for the new settings
		FirefoxProfile profile = new FirefoxProfile();
		// Pass the XPIs path to the profile
		profile.addExtension(new File(firebugPath));
		
		//Set default Firebug preferences and FirePath preferences
		String ext = "extensions.firebug.";
		
		profile.setPreference(ext + "currentVersion", "3.0.0");
		profile.setPreference(ext + "allPagesActivation", "on");
		profile.setPreference(ext + "defaultPanelName", "net");
		profile.setPreference(ext + "net.enableSites", true);
		
		driver = new FirefoxDriver(profile);
		driver.manage().window().maximize();
		driver.get("http://forumsqa.com");
 
	}

}