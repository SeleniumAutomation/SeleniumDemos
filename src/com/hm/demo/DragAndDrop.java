package com.hm.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DragAndDrop {

	/**
	 * @param args
	 */
	public class ActionExample {
		
	}
		public static void main(String[] args) throws InterruptedException {


			   WebDriver driver = new FirefoxDriver();
			  driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
			  driver.manage().window().maximize();
			  
			  
			  WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
			  WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));
			  
			  
			  Actions action = new Actions(driver);
			  
			action.dragAndDrop(draggable, droppable).perform(); 
			
			  
			  
		}
		  
		
	/*	@BeforeClass 
		public void setUp() 
		{ 
			driver = new FirefoxDriver(); 
			} 
		@AfterClass 
		public void tearDown()
		{ driver.close();
		driver.quit();
		}
		@Test 
		public void draggable()
		{ 
			driver.get("http://jqueryui.com/demos/draggable/");
			WebElement draggable = driver.findElement(By.cssSelector("#draggable"));
			new Actions(driver).dragAndDropBy(draggable, 150, 150).build() .perform();
			} 
		@Test 
			public void droppable()
			{
			driver.get("http://jqueryui.com/demos/droppable/");
			WebElement draggable = driver.findElement(By.cssSelector("#draggable"));
			WebElement droppable = driver.findElement(By.cssSelector("#droppable"));
			new Actions(driver).dragAndDrop(draggable, droppable).build().perform(); 
			} 
	*/	
	}

