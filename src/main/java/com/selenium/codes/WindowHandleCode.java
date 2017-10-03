package com.selenium.codes;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleCode {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
		// Open browser
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		String parent = driver.getWindowHandle();
		WebElement button = driver.findElement(By.id("button1"));
		for(int i=0; i<3; i++)
		{
			button.click();
			Thread.sleep(3000);
		}
		Set<String> s1 = driver.getWindowHandles();
		int n = s1.size();
		for(String child : s1)
		{
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
		}
		driver.close();
	}

}
