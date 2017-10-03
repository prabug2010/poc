package com.selenum.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExcel {
	
	public WebDriver driver;
	
	@DataProvider(name = "data")
	public Object[][] inputs()
	{
		LibraryCode rd1 = new LibraryCode("D:\\Eclipse\\eclipse-workspace\\poc\\TestData\\TestData.xlsx");
		int rows = rd1.getRowCount(0);
		Object[][] data = new Object[rows][2];
		for(int i=0; i<rows;i++)
		{
			data[i][0]=rd1.getData(0, i, 0);
			data[i][1]=rd1.getData(0, i, 1);
		}
		return data;
	}
	
	@Test(dataProvider = "data")
	 
	  public void test1(String sUserName, String sPassword) throws Exception  {
	 
		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		    WebElement user = driver.findElement(By.id("user_login"));
	 
		    user.click();
		    user.clear();
		    user.sendKeys(sUserName);
	 
			System.out.println(sUserName);
	 
		    WebElement pass = driver.findElement(By.id("user_pass"));
		    pass.click();
		    pass.clear();
		    pass.sendKeys(sPassword);
	 
			System.out.println(sPassword);
	 
		    driver.findElement(By.id("wp-submit")).click();
		    driver.close();
		    
	  }
}