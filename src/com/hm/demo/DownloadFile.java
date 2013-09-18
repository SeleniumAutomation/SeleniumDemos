package com.hm.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFile {

	public static void main(String[] args) 
	{
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.dir","C://Users//pratush.manglik//Desktop");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/text/csv");
		System.setProperty("webdriver.chrome.driver", "D://Softwares//webDrivers//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver(profile); 
		driver.get("http://get.adobe.com/reader/");
		
		//driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div[3]/div[2]/div/div[1]/ol/li[1]/a")).click();
		driver.findElement(By.cssSelector("#buttonDownload")).click();

		
		

	}

}
