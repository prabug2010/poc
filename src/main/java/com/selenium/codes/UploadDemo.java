package com.selenium.codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadDemo {
	
	public static <V> V waitFor(WebDriver driver, ExpectedCondition<V> expectedCondition, int timeOutInSeconds)
	{
		return new WebDriverWait(driver, timeOutInSeconds, 500). until(expectedCondition);
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		WebElement load = driver.findElement(By.id("file-upload"));
		waitFor(driver, ExpectedConditions.elementToBeClickable(load), 10);
		
		load.click();
		
		load.sendKeys("C:\\Users\\pgunasekaran\\Desktop\\sampletextfile.txt");
		
		WebElement submit = driver.findElement(By.id("file-submit"));
		submit.click();
	}

}
