package com.hm.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

public class DropDown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver myTestDriver = new FirefoxDriver();
		myTestDriver.get("http://www.shine.com/partnersites/");

		// DropDown
		myTestDriver.findElement(By.className("cls_ulAdvSearch_a")).click();

		myTestDriver.findElement(By.id("id_area")).sendKeys("Quality / Testing (QA-QC)");
		myTestDriver.findElement(By.id("id_ind")).sendKeys("IT - Software");

		myTestDriver.findElement(By.cssSelector(".redbtn.cls_btn_reg_job_srch_lrg")).click();

		List<WebElement> Industry = myTestDriver.findElements(By.cssSelector("#id_area option"));

		System.out.println(Industry.size());

		for(int i = 0; i< Industry.size();i++){
			System.out.println(Industry.get(i).getText() +"--------------> "+ Industry.get(i).getAttribute("value"));
		}
	}

}
