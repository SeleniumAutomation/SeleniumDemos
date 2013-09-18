package com.hm.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioBtnAndCheckbox {

	 public static void main(String[] args)
	  {
	    // All actions will be applied to Firefox.
	    WebDriver driver = new FirefoxDriver();
	 
	    // Open the webpage.
	    driver.get("http://openwritings.net/sites/default/files/radio_checkbox.html");
	 
	    // Radio Button: Check Monday using XPATH locator.
	    WebElement oRadioBtn = driver.findElement(By.xpath("//input[@value='Mon']"));
	    oRadioBtn.click();
	 
	    // Checkbox: Uncheck Apple using CSS selector.
	    WebElement oCheckBoxApple = driver.findElement(By.cssSelector("input[name='apple']")); // 2010-06-01: IE Driver doesn't support cssSelector yet.
	    oCheckBoxApple.click();
	 
	    // Checkbox: Check Orange using CSS selector.
	    WebElement oCheckBoxOrange = driver.findElement(By.cssSelector("input[name='orange']")); // 2010-06-01: IE Driver doesn't support cssSelector yet.
	    oCheckBoxOrange.click();    
	 
	    pause(10000); // Pause so that you can see the results.
	 
	    // Close the browser.
	    driver.close(); 
	  }
	 
	  /**
	   * Pause for X milliseconds.
	   * @param iTimeInMillis
	   */
	  public static void pause(final int iTimeInMillis)
	  {
	    try
	    {
	      Thread.sleep(iTimeInMillis);
	    }
	    catch(InterruptedException ex)
	    {
	      System.out.println(ex.getMessage());
	    }
	  }
	 
	}
