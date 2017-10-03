package com.selenium.codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class FrameCode {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		List<WebElement> l1 = (List<WebElement>) driver.findElement(By.tagName("iframe"));
		int n = l1.size();
		System.out.println(n);
	}

}
