package com.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_BaseClass {
	public  static WebDriver driver;
	public static  Properties prop;

	@BeforeSuite
	public void load() throws IOException {
		prop = new Properties();
		{
			FileInputStream f1 = new FileInputStream("C:\\Users\\admin\\git\\Amazon_Testing\\Amazon\\src\\main\\resources\\config.properties");
			prop.load(f1);
		}

	}

	@BeforeMethod

	public void setup() {
		System.out.println("Setting up webDriver for : " + this.getClass().getSimpleName());
		OpenBrowser();
		configBrowsers();

	}

	public void OpenBrowser() {

		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else {
			throw new IllegalArgumentException("Browser Not supported :" + browser);

		}

	}

	public void configBrowsers() {
		{
			int implicitWait = Integer.parseInt(prop.getProperty("implicitWait"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
			driver.manage().window().maximize();
			try {
				driver.get(prop.getProperty("URL"));
			} catch (Exception e) {
				System.out.println("Failer to navigaet to Url:" + e.getMessage());
			}
		}
	}


	
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			try {
				driver.quit();
			} catch (Exception e) {
				System.out.println("unable to quit the driver :" + e.getMessage());
			}
		}

	}

}
