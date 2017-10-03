package com.selenium.codes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {
	
	public <V> V waitFor(WebDriver driver, ExpectedCondition<V> expectedCondition, int timeOutInSeconds)
	{
		return new WebDriverWait(driver, timeOutInSeconds, 500).until(expectedCondition);
		
	}
	
	public void dragDrop()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		waitFor(driver, ExpectedConditions.elementToBeClickable(drag), 10);
		System.out.println("ok");
		WebElement drop = driver.findElement(By.id("droppable"));
		System.out.println("ok");
		Actions act = new Actions(driver);
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
	//	act.dragAndDrop(drag, drop).build().perform();
	}
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
		DragAndDrop obj = new DragAndDrop();
		obj.dragDrop();
	}
}