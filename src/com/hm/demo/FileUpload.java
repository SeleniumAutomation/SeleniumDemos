package com.hm.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import autoitx4java.AutoItX;

public class FileUpload {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.uploadify.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#menu-item-31>a")).click();
		driver.findElement(By.cssSelector("#SWFUpload_0")).click();
		AutoItX aux = new AutoItX();
		aux.winWaitActive("Open");
		aux.send("webData.csv");
		aux.controlClick("Open", "&Open", "1");
	}
}
