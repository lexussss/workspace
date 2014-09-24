package com.pragmatic.lesson10.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task6 {

	protected WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();

	}

	@Test
	public void findLink() {
		driver.get("http://edition.cnn.com/");

		// By class name
		driver.findElement(By.cssSelector("a.cnn_frmqvtbtn"));

	}

	@After
	public void tearDown() {
		driver.quit();
	}
}