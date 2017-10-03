package com.selenium.codes.fb;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class MethodsClass {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@AfterClass
	public void closeDriver() {
		driver.close();
	}
}
