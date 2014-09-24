package com.pragmatic.lesson12.homework;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	private WebDriver driver;
	private String username = "admin";
	private String password = "parola";

	@Before
	public void setUp() {
		System.setProperty(
				"webdriver.chrome.driver",
				"D:\\Pragmatic_Automation_Testing_Course\\Lectures\\Install\\WebDrivers\\Chrome\\2.10\\chromedriver.exe");
		System.setProperty(
				"webdriver.ie.driver",
				"D:\\Pragmatic_Automation_Testing_Course\\Lectures\\Install\\WebDrivers\\IE\\2.42\\IEDriverServer.exe");
		driver = new ChromeDriver();
		// driver = new InternetExplorerDriver();
		// driver = new FirefoxDriver();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://shop.pragmatic.bg/admin");
	}

	@Test
	public void testLogin() {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.className("button")).click();
		WebElement text = (new WebDriverWait(driver, 5))
				.until(new ExpectedCondition<WebElement>() {
					@Override
					public WebElement apply(WebDriver d) {
						return d.findElement(By.cssSelector("div"))
								.findElement(By.id("header"))
								.findElement(By.cssSelector("span"));
					}
				});
		assertEquals("admin", text.getText());
		driver.findElement(By.linkText("Logout")).click();

	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
