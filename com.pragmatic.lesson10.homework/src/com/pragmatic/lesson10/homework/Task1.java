package com.pragmatic.lesson10.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {

	protected WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();

	}

	@Test
	public void findLink() {
		driver.get("http://www.abv.bg/");

		// By ID + By class name
		driver.findElement(By.id("astroContent")).findElement(
				By.cssSelector("a.right"));

		// By ID + By link text
		driver.findElement(By.id("astroContent")).findElement(
				By.linkText("Месечен"));

		// By CSS class
		driver.findElement(By.cssSelector("div.info")).findElement(
				By.cssSelector("a.right"));

	}

	@After
	public void tearDown() {
		driver.quit();
	}
}