package com.pragmatic.lesson10.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task7 {

	protected WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();

	}

	@Test
	public void findLink() {
		driver.get("http://www.siteground.com/");

		// By CSS selector
		driver.findElement(By.cssSelector("section.plan.dedicated > a.extralarge_button.bblue"));

	}

	@After
	public void tearDown() {
		driver.quit();
	}
}