package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	 WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup(); // Automatically downloads the driver
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @Test(description="to open the URL")
	    public void openURL() throws InterruptedException {
	        driver.get("https://www.amazon.in/");
	        Thread.sleep(3000);
	        System.out.println("Page title is: " + driver.getTitle());
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.close();
	    }
}
