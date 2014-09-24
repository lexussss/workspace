package com.pragmatic.lesson10.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task3 {

	protected WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();

	}

	@Test
	public void findLink() {
		driver.get("http://zamunda.net/");

		// By ID
		driver.findElement(By.id("foruicon"));

		// By link name
		driver.findElement(By.linkText("Login"));

	}

	@After
	public void tearDown() {
		driver.quit();
	}
}