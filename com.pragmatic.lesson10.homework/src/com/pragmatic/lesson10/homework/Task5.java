package com.pragmatic.lesson10.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task5 {

	protected WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://www.vesti.bg/");
	}

	@Test
	public void test1() {
		// By class name
		driver.findElement(By.cssSelector("div.search-block"));
	}

	@Test
	public void test2() {
		// By Xpath
		driver.findElement(By
				.xpath("//input[@type='submit'][@class='search-button']"));
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}