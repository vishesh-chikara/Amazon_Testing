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

	public void verifyHomePage() {

		Assert.assertTrue(AmazonLogo.isDisplayed(), "Amazon logo is NOT displayed!");
		Assert.assertTrue(ReturnOrder_Option.isDisplayed(), "Amazon logo is NOT displayed!");

	}

}
