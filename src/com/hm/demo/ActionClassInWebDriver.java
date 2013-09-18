package com.hm.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassInWebDriver {

	private static Actions action;

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.nokia.indiatimes.com");
		driver.manage().window().maximize();
		
		
		Actions actions = new Actions(driver);
		WebElement imageSpan = driver.findElement(By.cssSelector(".FancytoolTip.combooffer>a"));
		actions.moveToElement(imageSpan);
	
		actions.perform();
		Thread.sleep(1000);
		/*WebElement subLink = driver.findElement(By.cssSelector(".FancytoolTip.combooffer>a"));
		actions.moveToElement(subLink);
		actions.click();
		actions.perform();*/


	}

}
