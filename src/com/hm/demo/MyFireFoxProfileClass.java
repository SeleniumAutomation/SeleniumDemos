package com.hm.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class MyFireFoxProfileClass {
	

	
	public static WebDriver driver;
	
	
	
	public static void main(String [] args) throws IOException
	{
		final String firebugPath = "C:\\profile\\firebug.xpi";
		

        FirefoxProfile profile = new FirefoxProfile();       

        profile.addExtension(new File(firebugPath));

        profile.setPreference("extensions.firebug.currentVersion", "1.11.4");

		
		driver = new FirefoxDriver(profile);
		driver.get("https://www.beyondtherack.com");
		driver.manage().window().maximize();
		
	}
}
