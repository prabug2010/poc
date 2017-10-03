package com.selenium.codes;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageUpload {

	    public static void main(String[] args) {
	        System.setProperty("webdriver.gecko.driver","D:\\gecko driver\\geckodriver.exe");
	        String baseUrl = "http://demo.guru99.com/selenium/upload/";
	        WebDriver driver = new FirefoxDriver();

	        driver.get(baseUrl);
	        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
	        System.out.println(uploadElement.getClass());

	        // enter the file path onto the file-selection input field
	        uploadElement.sendKeys("D:\\sampleone.txt");

	        // check the "I accept the terms of service" check box
	        driver.findElement(By.id("terms")).click();

	        // click the "UploadFile" button
	        driver.findElement(By.id("submitbutton")).click();
	        }
}
