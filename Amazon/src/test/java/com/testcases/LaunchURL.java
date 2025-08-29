package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseClass.Amazon_BaseClass;

public class LaunchURL extends Amazon_BaseClass {

	// WebDriver driver;

	@Test(priority = 1, description = "to open the URL and get the title")
	public void openURL() throws InterruptedException {

		// Validate the title of the page
		System.out.println("Page title is: " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

		// validate the current title of the page
		System.out.println("current title is :" + driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/");

	}

}
