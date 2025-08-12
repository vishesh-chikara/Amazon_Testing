package com.testcases;

import org.testng.annotations.Test;

import com.BaseClass.Amazon_BaseClass;

public class LaunchURL extends Amazon_BaseClass {


	//WebDriver driver;

	@Test(description = "to open the URL and get the title")
	public void openURL() throws InterruptedException {
		System.out.println("Page title is: " + driver.getTitle());
		System.out.println("current title is :" + driver.getCurrentUrl());
		System.out.println("page source is : " + driver.getPageSource());
	}
	
	
	

}
