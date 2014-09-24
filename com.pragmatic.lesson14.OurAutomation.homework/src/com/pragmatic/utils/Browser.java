package com.pragmatic.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver instance = null;

	public static void init() {
		System.setProperty("webdriver.chrome.driver", "D:\\Pragmatic_Automation_Testing_Course\\Lectures\\Install\\WebDrivers\\Chrome\\2.10\\chromedriver.exe");
		instance = new ChromeDriver();
		instance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void quit() {
		instance.quit();
	}

}
