package com.hm.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesetWebpage {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.beyondtherack.com");
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath(".//*[@id='fb-login']")).click();
        String driverState = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {

                  driver.switchTo().window(handle);
                }

        driver.findElement(By.cssSelector("#email")).sendKeys("suchi.singh@happiestminds.com");

        driver.findElement(By.cssSelector("#pass")).sendKeys("happiest");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("u_0_1")).click();
        driver.switchTo().window(driverState);
        
        driver.findElement(By.cssSelector(".menu_item.menu_item_kids>a")).click();
        driver.findElement(By.cssSelector(".mainframe.clearfix.browseBG>a:nth-of-type(1)")).click();
        driver.findElement(By.cssSelector("#vnImagePopup>img")).click();
        
      driver.switchTo().frame("vnIframe");
    	 // if(driver.getTitle().equals("Invite Friends - Beyond the Rack")){
    		  driver.findElement(By.cssSelector("#facebook")).click();
    		  
    		  String nextwindow = driver.getWindowHandle();
    	        for (String handle : driver.getWindowHandles()) {

    	                  driver.switchTo().window(handle);
    	                }
    		 
    		  driver.findElement(By.cssSelector("#u_0_7")).sendKeys("must buy!!!!!!!!!");
    		
    	
    		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    	       driver.findElement(By.cssSelector("#u_0_1")).click();
    	      
    	        driver.switchTo().window(nextwindow);
	}

}
