package com.testcases;

import org.testng.annotations.Test;

import com.BaseClass.Amazon_BaseClass;
import com.pages.LoginTest;


public class Login extends Amazon_BaseClass {

	@Test(priority=3,description="to test the login fucn with valid user and pass")
	public void Login_to_Amazon() throws InterruptedException
	
	{
		
		LoginTest Login = new LoginTest(driver);
		
		Login.clickAccount();
		Login.SetUsername();
		Login.ClickSubmit();
		Login.settXtpassword();
		Login.Login();
		Thread.sleep(3000);
		
				
	}
}
