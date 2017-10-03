package com.selenium.codes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebtableCode {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","D:\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait waitFor = new WebDriverWait(driver, 10);
		
		driver.get("http://toolsqa.com/automation-practice-table/");
		String cell = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(cell);
		WebElement link = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a/text()"));
		waitFor.until(ExpectedConditions.elementToBeClickable(link));
		link.click();
		
	}
}
