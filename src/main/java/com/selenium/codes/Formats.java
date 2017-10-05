package com.selenium.codes;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;


public class Formats {
	//waitFor
	public <V> V waitFor(WebDriver driver, ExpectedCondition<V> expectedCondition, int timeOutInSeconds) {
		return new WebDriverWait(driver, timeOutInSeconds, 500).until(expectedCondition);
	}
	//xpath
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
	
	@FindBy(xpath = ".//input[@id='email']/ancestor::td[2]")
	public WebElement log;
	
	@FindBy(xpath = ".//input[@id='email']/descendant::td[2]")
	public WebElement log12;
	
	public static void main(String args[]) throws IOException
	{
	//driver initialization
	WebDriver driver = new FirefoxDriver();
	//get methods of driver
	driver.get("https://www.google.co.in");
	driver.getTitle();
	driver.getPageSource();
	driver.getWindowHandle();
	driver.getWindowHandles();
	driver.getClass();
	driver.getCurrentUrl();
	
	//Navigate
	driver.navigate().to("https://www.google.co.in");
	driver.navigate().forward();
	driver.navigate().back();
	String s = "https://www.google.co.in";
	driver.navigate().to(s);
	driver.navigate().refresh();
	
	//manage
	Cookie cook = new Cookie("mycookie","123");
	driver.manage().addCookie(cook);
	driver.manage().deleteCookie(cook);
	driver.manage().deleteAllCookies();
	driver.manage().deleteCookieNamed(s);
	driver.manage().getCookieNamed(s);
	driver.manage().getCookies();
	driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
	driver.manage().window().getSize().getHeight();
	driver.manage().window().getSize().getWidth();
	driver.manage().window().maximize();
	
	//switchTo
	driver.switchTo().defaultContent();
	driver.switchTo().activeElement();
	driver.switchTo().frame(0);
	driver.switchTo().parentFrame();
	driver.switchTo().alert();
	driver.switchTo().window(s);
	
	//select class
	WebElement e = driver.findElement(By.id("1"));
	Select sel = new Select(e);
	sel.deselectAll();
	sel.deselectByIndex(0);
	sel.deselectByValue(s);
	sel.deselectByVisibleText(s);
	sel.selectByIndex(0);
	sel.selectByValue(s);
	sel.selectByVisibleText(s);
	sel.isMultiple();
	sel.getAllSelectedOptions();
	sel.getFirstSelectedOption();
	sel.getOptions();
	
	//Action class
	Actions action = new Actions(driver);
	action.keyDown(e, Keys.ENTER);
	action.keyUp(e, Keys.TAB);
	action.sendKeys(e, Keys.chord(Keys.CONTROL, "a"));
	action.doubleClick().build().perform();
	action.doubleClick(e).build().perform();
	action.clickAndHold(e).build().perform();
	WebElement x = driver.findElement(By.id("2"));
	action.dragAndDrop(e, x).build().perform();
	action.moveToElement(e).build().perform();
	action.contextClick(e).build().perform();
	action.moveToElement(e).clickAndHold(e).release().build().perform();
	
	//javascript executor
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,100)");
	
	//screenshot	
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("D:/seleniumerror.png"));
	
	//Event firing webdriver
	EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
	File src1 = edriver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src1, new File("D:/seleniumerror.png"));
	
	//wait
	WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(e));
	
	//css
	//direct child
	WebElement e1 = driver.findElement(By.cssSelector("#testingDropdown>option"));
	System.out.println(e1.getText());
	//nth child
	WebElement nchild = driver.findElement(By.cssSelector("#testingDropdown option:nth-child(2)"));
	System.out.println(nchild.getText());
	//siblings
	WebElement sibling = driver.findElement(By.cssSelector("#performance+option"));
	System.out.println(sibling.getText());
	//child or sub child
	String childsub =  driver.findElement(By.cssSelector("#AlertBox button")).getText();
	System.out.println(childsub);
	
	//Alert
	Alert alert = driver.switchTo().alert();
	alert.accept();
	alert.dismiss();
	alert.sendKeys(s);
	alert.getText();
	
	
	}
}
