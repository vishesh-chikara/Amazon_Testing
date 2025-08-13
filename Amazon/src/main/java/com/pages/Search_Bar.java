package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Amazon_BaseClass;

public class Search_Bar extends Amazon_BaseClass {
	
	
	@FindBy(id="twotabsearchtextbox")
	WebElement Search_Product;	
	
	//creating a constructor
	public  Search_Bar(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Search()
	{
		Search_Product.sendKeys("mobile");
	}
}
