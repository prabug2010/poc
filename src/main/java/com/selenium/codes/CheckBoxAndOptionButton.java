package com.selenium.codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxAndOptionButton {
	
	public static <V> V waitFor(WebDriver driver, ExpectedCondition<V> expectedCondition, int timeOutInSeconds)
	{
		return new WebDriverWait(driver, timeOutInSeconds, 500).until(expectedCondition);	
	}
	
	public void checkBoxOption()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/webform/radio.html");
		WebElement opt1 = driver.findElement(By.id("vfb-7-1"));
		waitFor(driver, ExpectedConditions.elementToBeClickable(opt1), 10);
		opt1.click();
		if(opt1.isSelected())
		{
			System.out.println("option1 is selcetd");
		}
		WebElement chk2 = driver.findElement(By.id("vfb-6-1"));
		waitFor(driver, ExpectedConditions.elementToBeClickable(chk2), 10);
		chk2.click();
		if(chk2.isSelected())
		{
			System.out.println("check2 is selected");
		}
		WebElement chk3 = driver.findElement(By.id("vfb-6-2"));
		waitFor(driver, ExpectedConditions.elementToBeClickable(chk3), 10);
		chk3.click();
		if(chk3.isSelected())
		{
			System.out.println("check3 is selected");
		}
		
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\\\gecko driver\\\\geckodriver.exe");
		CheckBoxAndOptionButton obj = new CheckBoxAndOptionButton();
		obj.checkBoxOption();
		
	}

}
