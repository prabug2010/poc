package com.selenium.codes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {
	

	@FindBy(id = "month")
	public  WebElement drop;
	
	public  void dropDown()
	{
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.facebook.com/";
		driver.get(url);
		PageFactory.initElements(driver, this);
		waitFor(driver, ExpectedConditions.elementToBeClickable(drop), 20);
		Select s = new Select(drop);
		List<WebElement> l = s.getOptions();
		int n = l.size();	
		for(int i =0; i<n; i++)
		{
			String x = s.getOptions().get(i).getText();
			System.out.println(x);
			if(s.equals("Oct"))
			{
				s.selectByVisibleText(x);
			}
		}
		
	}
	public <V> V waitFor(WebDriver driver, ExpectedCondition<V> expectedCondition, int timeOutInSeconds)
	{
		return new WebDriverWait(driver, timeOutInSeconds, 500).until(expectedCondition);
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
		DropDown d = new DropDown();
		d.dropDown();
	}
}