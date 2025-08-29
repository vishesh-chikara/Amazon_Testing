package com.testcases;

import org.testng.annotations.Test;

import com.BaseClass.Amazon_BaseClass;
import com.pages.HomePage;

public class Test_HomePage extends Amazon_BaseClass {

	@Test(priority = 2, description = "to verify the UI on homePage")
	public void Validate_UI() throws InterruptedException {
		HomePage UI = new HomePage(driver);
		UI.verifyHomePage();

	}

}
