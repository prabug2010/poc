package com.selenium.codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFiles {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/upload/");
		
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		upload.click();
		
		upload.sendKeys("C:\\Users\\pgunasekaran\\Desktop\\sampletextfile.txt");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("submitbutton")).click();
		
		String msg = driver.findElement(By.cssSelector("#res>center")).getText();
		System.out.println(msg);
		
	}

}
