package com.hm.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class CertificateErrorHandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
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

		
		 //Class ProfilesIni details
		 ProfilesIni allProfiles = new ProfilesIni();
		 // Use FirefoxProfile Constructor
		 FirefoxProfile myProfile = allProfiles.getProfile("CertificateIssue"); 
	//	 myProfile.setAcceptUntrustedCertificates(true);
		 myProfile.setAssumeUntrustedCertificateIssuer(true);
		 WebDriver Driver = new FirefoxDriver(myProfile); 
		 Driver.get("http://abodeqa.wordpress.com");
	}

}
