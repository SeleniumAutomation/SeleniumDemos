package com.hm.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class AutomateInDifferentBrowser {

	public static WebDriver driver;
	 
	public static void openFirefox() {
	
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("firefox");
	}
	
	public static void openIE() {
		
		System.setProperty("webdriver.ie.driver","lib//IEDriverServer.exe");				
		driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.close();
		System.out.println("IE");
	}
	
	public static void openChrome() {
		
		System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.google.com");		
		driver.manage().window().maximize();
		driver.close();
		System.out.println("Chrome");
	}
	public static void main(String[] args) {
		openFirefox();
		openChrome();
		openIE();
		
		
	}

}
