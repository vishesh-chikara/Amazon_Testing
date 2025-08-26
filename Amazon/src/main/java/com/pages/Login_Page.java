package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Amazon_BaseClass;

public class Login_Page extends Amazon_BaseClass {
	
	@FindBy(xpath= "//button[@alt='Continue shopping']")
	WebElement Continue;

	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
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
		Continue.click();
		Click_Account.click();
		username.sendKeys("visheshkumar0012@gmail.com");
		Submit.click();
		password.sendKeys("Dennie#0420");
		SignIn.click();
	}


	public void forgetPassword() {
		forgetPassword.click();
	}

}
