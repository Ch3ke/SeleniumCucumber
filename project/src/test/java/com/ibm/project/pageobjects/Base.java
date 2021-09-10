package com.ibm.project.pageobjects;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	static String driverPath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";

	public static WebDriver openSite() {
		prop = new Properties();
		FileInputStream fis = null;

		try {

			fis = new FileInputStream(System.getProperty("user.dir") + "\\resources\\global.properties");
		} catch (FileNotFoundException e) {
			System.out.println();
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		return driver;
	}

	public static WebDriver openBrowserWith(String url) {
		prop = new Properties();
		System.setProperty("webdriver.chrome.driver", driverPath);
		System.out.println("Opening Browser with " + url);
		driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}

	public static void main(String[] args) {
		openBrowserWith("http://automationpractice.com");
	}

}
