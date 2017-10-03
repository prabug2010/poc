package com.selenium.codes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynmChkBoxes {
	
	public static <V>V waitFor(WebDriver driver, ExpectedCondition<V>expectedCondition, int timeOutInSeconds)
	{
		return new WebDriverWait(driver, timeOutInSeconds, 500).until(expectedCondition);
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String url = "http://www.phptravels.net/supplier";
		driver.get(url);
		WebElement user = driver.findElement(By.cssSelector("input[type='text']"));
		waitFor(driver, ExpectedConditions.elementToBeClickable(user), 20);
		if(user.isEnabled())
		{
			user.click();
			user.clear();
			user.sendKeys("supplier@phptravels.com");
		}
		
		WebElement pass = driver.findElement(By.cssSelector("input[type='password']"));
		pass.click();
		pass.clear();
		pass.sendKeys("demosupplier");
		
		WebElement loginbtn = driver.findElement(By.xpath("html/body/div[2]/div[2]/form[1]/button"));
		waitFor(driver, ExpectedConditions.elementToBeClickable(loginbtn),10);
		if(loginbtn.isEnabled())
		{
			loginbtn.click();
		}
	//	WebElement chkbox = driver.findElement(By.xpath(".//*[@id='content']//table/tbody/tr[3]/td[1]/div/ins"));
	//	waitFor(driver, ExpectedConditions.elementToBeClickable(chkbox), 10);
	//	if(chkbox.isEnabled())
	//	{
	//		chkbox.click();
	//	}
		
	//	WebElement dash = driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[1]/button"));
	//	waitFor(driver, ExpectedConditions.elementToBeClickable(dash), 10);
		
		WebElement check = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/div/input"));
		check.click();
	}

}
