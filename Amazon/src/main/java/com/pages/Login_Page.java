package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Amazon_BaseClass;

public class Login_Page extends Amazon_BaseClass {

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

	public void clickAccount() {
		Click_Account.click();
	}

	public void SetUsername() {
		username.sendKeys("visheshkumar0012@gmail.com");
	}

	public void ClickSubmit() {
		Submit.click();
	}

	public void settXtpassword() {
		password.sendKeys("Dennie#0420");
	}

	public void Login() {
		SignIn.click();
	}

	public void forgetPassword() {
		forgetPassword.click();
	}

}
