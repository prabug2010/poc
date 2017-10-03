package com.selenium.xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathCode {
	
	 WebDriver driver = new FirefoxDriver();
	/*
	//guru 99 gtpl login page "http://demo.guru99.com/v1/index.php"
	@FindBy(xpath = "//input[@name='uid']")
	public WebElement userid;
	*/
	
	@FindBy(xpath = ".//select[@id='day']")
	public WebElement day;
	
	@FindBy(xpath = "//select[@id='day']/following-sibling::select[2]")
	public WebElement year;
	
	@FindBy(xpath = "//select[@id='year']/preceding-sibling::select[1]")
	public WebElement month;
	
	//	fb login page
	@FindBy(xpath = ".//*[@tabindex='2']/self::input")
	public WebElement password;
	
	@FindBy(xpath = ".//input[@id='email']/precdeing::tr")
	public WebElement text1;
	
	@FindBy(xpath = ".//input[@id='email']/following::td[2]")
	public WebElement loginbutton;
	
	@FindBy(xpath = ".//*[@id='email']")
	public WebElement email;
	
	public <V> V waitFor(WebDriver driver, ExpectedCondition<V>expectedCondition, int timeOutInSeconds)
	{
		return new WebDriverWait(driver, timeOutInSeconds, 500).until(expectedCondition);
	}
	
	
	public  void webElem()
	{
		driver.get("https://www.facebook.com/");
		PageFactory.initElements(driver, this);
		waitFor(driver, ExpectedConditions.elementToBeClickable(email), 15);
		email.click();
		email.clear();
		email.sendKeys("9677333397");
		password.click();
		password.clear();
		password.sendKeys("1234");
		String emailname ="";
		emailname = email.getText();
		System.out.println(emailname);
		String pass="";
		pass= password.getText();
		System.out.println(pass);
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
		XpathCode x = new XpathCode();
		x.webElem();
	}

}
