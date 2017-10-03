package com.selenium.codes;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTab {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Launch the first URL
		driver.get("http://www.google.com");

		try {
		//Use robot class to press Ctrl+t keys    		
		Robot robot = new Robot();                          
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_T); 
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		robot.keyRelease(KeyEvent.VK_T);
		}catch(Exception e)
		{
			//do nothing;
		}

		//Switch focus to new tab
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		//Launch URL in the new tab
		driver.get("http://google.com");
	}

}
