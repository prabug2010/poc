package com.selenium.codes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeHandling {

	public static void main(String[] args) {

	     System.setProperty("webdriver.gecko.driver","D:\\gecko driver\\geckodriver.exe");
	        String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe";
	        WebDriver driver = new FirefoxDriver();
	        driver.get(baseUrl);
	        List<WebElement> l1 = driver.findElements(By.xpath("//iframe"));
	        int i = l1.size();
	        System.out.println("no of frames in the page are : "+l1.size());
	       driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	       System.out.println(driver.getTitle());
	       driver.get("https://www.google.co.in");
	       driver.switchTo().defaultContent();
	}
}