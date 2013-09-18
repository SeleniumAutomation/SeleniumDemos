package com.hm.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrontAndBackBtn {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.flipkart.com/"); 
		driver.findElement(By.xpath(".//*[@id='fk-header-tab-watch']/div[1]/div/div[1]/a")).click(); 
		System.out.println("yyo");
		Thread.sleep(1000); 
		driver.navigate().back();
		System.out.println("yowww");
		driver.navigate().forward();
		System.out.println("sdfjkgb");
	}

}
