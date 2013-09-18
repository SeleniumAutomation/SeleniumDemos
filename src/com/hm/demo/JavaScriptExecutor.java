package com.hm.demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://timesofindia.indiatimes.com");
		
		Thread.sleep(9000);
		
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		String Json = (String)jsExec.executeScript("var perfarray = window.performance.getEntries();"+"return JSON.stringify(perfarray); ");
		System.out.println(Json);

	}

}
