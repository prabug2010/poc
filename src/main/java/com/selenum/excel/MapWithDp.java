package com.selenum.excel;

import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MapWithDp {

public WebDriver driver;
	/*
	@DataProvider(name = "data")
	public Object[][] inputs()
	{
		ReadExcelCode2 rd1 = new ReadExcelCode2("D:\\Eclipse\\eclipse-workspace\\poc\\TestData\\TestData.xlsx");
		int rows = rd1.getRowCount(0);
		Object[][] data = new Object[rows][2];
		for(int i=0; i<rows;i++)
		{
			data[i][0]=rd1.getData(0, i, 0);
			data[i][1]=rd1.getData(0, i, 1);
		}
		return data;
	}
	*/
	
	@DataProvider (name = "dp")
    public static Object[][] getData() {
		
        LinkedHashMap<String, String> object1 = new LinkedHashMap<String, String>();
        object1.put("height", "5.5 ft");
        object1.put("weight", "45 kgs");

        LinkedHashMap<String, String> object2 = new LinkedHashMap<String, String>();
        object2.put("age", "2");
        object2.put("weight", "45 kgs");

        LinkedHashMap<String, String> object3 = new LinkedHashMap<String, String>();
        object3.put("color", "brown");
        object3.put("orientation", "portrait");

        return new Object[][] {
            {"object1", object1.values()},
            {"object2", object2.values()},
            {"object3", object3.values()}};
	}
	
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
