package com.hm.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	
	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.uploadify.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/div[2]/section[1]/div/div/nav/ul/li[3]/a")).click();
		
		
		
		driver.findElement(By.id("file_upload_1")).sendKeys("C:\\Users\\pratush.manglik\\Downloads\\manu.jpeg");
		
		
		
		
		
		
		
	}

}
