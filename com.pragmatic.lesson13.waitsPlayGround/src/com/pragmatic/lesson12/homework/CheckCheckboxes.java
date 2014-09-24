package com.pragmatic.lesson12.homework;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckCheckboxes {

	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Pragmatic_Automation_Testing_Course\\Lectures\\Install\\WebDrivers\\Chrome\\2.10\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "D:\\Pragmatic_Automation_Testing_Course\\Lectures\\Install\\WebDrivers\\IE\\2.42\\IEDriverServer.exe");
		driver = new ChromeDriver();
//		driver = new InternetExplorerDriver();
//		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://dl.dropboxusercontent.com/u/55228056/Config.html");
	}

	@Test
	public void testLogin() {
		WebElement airbags = driver.findElement(By.name("airbags"));
		WebElement parkSensor = driver.findElement(By.name("parksensor"));

		if (!airbags.isSelected()) {
			airbags.click();
		}
		assertTrue(airbags.isSelected());

		if (!parkSensor.isSelected()) {
			parkSensor.click();
		}
		assertTrue(parkSensor.isSelected());
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
