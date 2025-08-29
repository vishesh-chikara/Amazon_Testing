package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Amazon_BaseClass;

public class Login_Page extends Amazon_BaseClass {
	
	

	@FindBy(xpath = "//span[normalize-space()='Account & Lists']")
	WebElement Click_Account;

	@FindBy(id = "ap_email_login")
	WebElement username;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement Submit;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement SignIn;

	@FindBy(xpath = "//a[@id='auth-fpp-link-bottom']")
	WebElement forgetPassword;

	// Creating a Constructor
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Login_Amazon()
	{
		
		Click_Account.click();
		username.sendKeys("visheshkumar813@gmail.com");
		Submit.click();
		password.sendKeys("Vishesh#12345");
		SignIn.click();
	}


	public void forgetPassword() {
		forgetPassword.click();
	}

}
