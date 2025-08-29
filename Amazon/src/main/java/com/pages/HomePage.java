package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseClass.Amazon_BaseClass;

public class HomePage extends Amazon_BaseClass {

	@FindBy(id = "nav-logo-sprites")
	WebElement AmazonLogo;

	@FindBy(xpath = "//span[normalize-space()='Returns']")
	WebElement ReturnOrder_Option;

	// Creating the constructor
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyHomePage() throws InterruptedException {

		// Validate the current title of the page
		System.out.println("current title is :" + driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/");

	

		// Validate the amazon Logo's
		if (AmazonLogo.isDisplayed()) {
			System.out.println("Amazon logo is displayed!");
		} else {
			System.out.println("Amazon logo is NOT displayed!");
		}

		//Assert.assertTrue(AmazonLogo.isDisplayed(), "Amazon logo is NOT displayed!");

		
		
		// Validate the return order option
		if (ReturnOrder_Option.isDisplayed()) {
			System.out.println("Return Orders option is displayed!");
		} else {
			System.out.println("Return Orders option is NOT displayed!");
		}

		//Assert.assertTrue(ReturnOrder_Option.isDisplayed(), "Amazon logo is NOT displayed!");

	}

}
