package com.selenium.codes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupHandling {
	
	public static void handlePopup1()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement pop = driver.findElement(By.cssSelector("#AlertBox>button"));
		pop.sendKeys(Keys.ENTER);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	public static void handlePopup2()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement pop = driver.findElement(By.cssSelector("input[type='text']"));
		pop.click();
		pop.clear();
		pop.sendKeys("12345");
		driver.findElement(By.name("submit")).submit();	
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
//		handlePopup1();
		handlePopup2();
	}

}
