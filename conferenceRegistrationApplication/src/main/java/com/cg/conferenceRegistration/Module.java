package com.cg.conferenceRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module {
	public static WebDriver driver;
	static String browser;
	public static void setBrowser() {
		ReadProperties.readProperties();
		browser=ReadProperties.properties.getProperty("browser");
	}
	public static void setBrowserConfig() {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Shruthi\\conferenceRegistrationApplication\\src\\main\\java\\chromedriver.exe");
		}
	}
	public static void runTest() {
		driver=new ChromeDriver();
		driver.get(ReadProperties.properties.getProperty("url"));		
	}
	public static void endTest() {
		driver.quit();
	}
}
