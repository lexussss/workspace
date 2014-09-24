package com.pragmatic.lesson10.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2 {

	protected WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();

	}

	@Test
	public void findLink() {
		driver.get("http://life.dir.bg/");

	// By ID + By xpath
		driver.findElement(By.id("topnav")).findElement(By.xpath("//span[text()='Здраве и красота']"));

	}

	@After
	public void tearDown() {
		driver.quit();
	}
}