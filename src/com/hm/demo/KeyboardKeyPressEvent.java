package com.hm.demo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardKeyPressEvent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.nokia.indiatimes.com");
		driver.manage().window().maximize();
		driver.switchTo().activeElement().sendKeys(Keys.chord(Keys.ALT+"S"));
		
	}

}
