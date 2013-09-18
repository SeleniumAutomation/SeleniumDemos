package com.hm.demo;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class BrowserCookies {

	public static void main(String[] args) {
		ProfilesIni allProfiles = new ProfilesIni();
		FirefoxProfile myProfile = allProfiles.getProfile("MyTestProfile");
	//	myProfile.setPreference("capability.policy.default.Window.frameElement.get","allAccess");

		WebDriver myTestDriver = new FirefoxDriver(myProfile);
		myTestDriver.manage().window().maximize();

		myTestDriver.get("http://linkedin.com");

		//getCookies() -  Get all the cookies for the current domain.
		Set<Cookie> testCookie = myTestDriver.manage().getCookies();

		Iterator<Cookie> iter= testCookie.iterator();

		while(iter.hasNext()){
			Cookie C = iter.next();
			System.out.println(C.getName()+"-------------------" + C.getPath()+"--------------------"+ C.getDomain()+"----"+C.getValue()+"---"+C.getExpiry());

		}

		//deleteCookieNamed(java.lang.String name)- Delete the named cookie from the current domain.
		myTestDriver.manage().deleteCookieNamed("JSESSIONID");
		System.out.println("------------------------------------------------------------------------------------");

			testCookie = myTestDriver.manage().getCookies();

			iter= testCookie.iterator();

		while(iter.hasNext()){
			Cookie C = iter.next();
			System.out.println(C.getName()+"-------------" + C.getPath()+"------------"+ C.getDomain()+"----"+C.getValue()+"---"+C.getExpiry());

		}

		//deleteAllCookies()  - Delete all the cookies for the current domain.
		myTestDriver.manage().deleteAllCookies();
		testCookie = myTestDriver.manage().getCookies();

		iter= testCookie.iterator();
		while(iter.hasNext()){
			Cookie C = iter.next();
			System.out.println(C.getName()+"-------------" + C.getPath()+"------------"+ C.getDomain()+"----"+C.getValue()+"---"+C.getExpiry());

		}

	}

}