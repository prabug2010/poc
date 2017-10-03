package com.selenium.codes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String url = "http://money.rediff.com/gainers/bsc/daily/groupa";
		driver.get(url);
		 List <WebElement> col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		 System.out.println("No of cols are : " +col.size()); 
		 //No.of rows 
		List <WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
		System.out.println("No of rows are : " + rows.size());
		
		WebElement tableRow = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[3]/td[2]"));
		String tablecode = tableRow.getText();
		WebElement fourthLink = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[3]/td[1]/a"));
		System.out.println(fourthLink.getText());
		fourthLink.click();
	}

}
