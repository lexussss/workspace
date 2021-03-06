package com.pragmatic.lesson12.homework;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropDownValue {

	private WebDriver driver;
	private String username = "admin";
	private String password = "parola";

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Pragmatic_Automation_Testing_Course\\Lectures\\Install\\WebDrivers\\Chrome\\2.10\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "D:\\Pragmatic_Automation_Testing_Course\\Lectures\\Install\\WebDrivers\\IE\\2.42\\IEDriverServer.exe");
		driver = new ChromeDriver();
//		driver = new InternetExplorerDriver();
//		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://shop.pragmatic.bg/admin");
	}

	@Test
	public void testLogin() {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.className("button")).click();
		Select dropDown = new Select(driver.findElement(
				By.cssSelector("select")).findElement(By.id("range")));
		assertEquals("Today", dropDown.getFirstSelectedOption().getText());
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
