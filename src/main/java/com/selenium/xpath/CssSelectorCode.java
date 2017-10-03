package com.selenium.xpath;



import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CssSelectorCode {

	public <V> V waitFor(WebDriver driver, ExpectedCondition<V> expectedCondition, int timeOutInSeconds)
{
	return new WebDriverWait(driver, timeOutInSeconds, 500).until(expectedCondition);
}
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String url = "http://artoftesting.com/sampleSiteForSelenium.html";
		driver.get(url);
		WebElement e1 = driver.findElement(By.cssSelector("#testingDropdown>option"));
		System.out.println(e1.getText());
		WebElement nchild = driver.findElement(By.cssSelector("#testingDropdown option:nth-child(2)"));
		System.out.println(nchild.getText());
		WebElement sibling = driver.findElement(By.cssSelector("#performance+option"));
		System.out.println(sibling.getText());
		String childsub =  driver.findElement(By.cssSelector("#AlertBox button")).getText();
		System.out.println(childsub);
	}
}
