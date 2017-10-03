package com.selenium.codes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalaryTableRead {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","D:\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.automationtesting.co.in/2012/02/selenium-verify-table.html");
		WebElement table = driver.findElement(By.xpath(".//*[@id='Blog1']/div[1]/div[1]/div[2]/div[1]/div[1]/table"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		int n = row.size();
		for(int i=0; i<n; i++)
		{
			List<WebElement> col = row.get(i).findElements(By.tagName("td"));
			int c = col.size();
			System.out.println("The number of cells in row "+i+" are : "+c);
			for(int x=0; x<c; x++)
			{
				String s = col.get(x).getText();
				System.out.println("cell value in row "+i+"and column "+x+" are : "+s);
			}
		}
		
	}

}
