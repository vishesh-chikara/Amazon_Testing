package com.testcases;

import org.testng.annotations.Test;

import com.BaseClass.Amazon_BaseClass;
import com.pages.Login_Page;

public class Test_Login extends Amazon_BaseClass {

	@Test(priority = 5, description = "to test the login fucn with valid user and pass")
	public void Login_to_Amazon() throws InterruptedException

	{

		Login_Page Login = new Login_Page(driver);

		Login.clickAccount();
		Login.SetUsername();
		Login.ClickSubmit();
		Login.settXtpassword();
		Login.Login();
		Thread.sleep(3000);

	}
}
