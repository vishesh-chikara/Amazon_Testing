package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Amazon_BaseClass;

public class Search_field extends Amazon_BaseClass {

	@FindBy(xpath = "//button[@alt='Continue shopping']")
	WebElement Continue;

	@FindBy(id = "twotabsearchtextbox")
	WebElement Enter_Product;

	@FindBy(id = "nav-search-submit-button")
	WebElement SearchEnter;

	// creating a constructor
	public Search_field(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Search() throws InterruptedException {
		Continue.click();
		Enter_Product.sendKeys("Mobile");
		SearchEnter.click();
		Thread.sleep(8000);

	}

}
