package com.pragmatic.lesson11.playGround;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.browserlaunchers.Sleeper;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout {

	private WebDriver driver;
	private String testString = "Test123";

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
		driver.get("http://shop.pragmatic.bg/index.php?route=product/category&path=20_27");
	}

	@Test
	public void checkout() {

		// Click Add to Cart button
		driver.findElement(By.className("button")).click();

		// Wait for presence of element
		new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.success")));

		// Assert element added to the cart
		String successDiv = driver.findElement(By.cssSelector("div.success"))
				.getText();
		assertEquals("Success: You have added iMac to your shopping cart!",
				successDiv);

		// Click Checkout
		driver.findElement(By.linkText("Checkout")).click();

		// Checkout Step 1
		new WebDriverWait(driver, 5).until(ExpectedConditions
				.presenceOfElementLocated(By.id("guest")));
		driver.findElement(By.id("guest")).click();
		driver.findElement(By.cssSelector("input.button")).click();

		// Checkout Step 2
		new WebDriverWait(driver, 5).until(ExpectedConditions
				.presenceOfElementLocated(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys(testString);
		driver.findElement(By.name("lastname")).sendKeys(testString);
		driver.findElement(By.xpath("//div[@id='payment-address']"))
				.findElement(By.name("email"))
				.sendKeys(testString + Math.random() + "@mail.com");
		driver.findElement(By.name("telephone")).sendKeys(testString);
		driver.findElement(By.name("address_1")).sendKeys(testString);
		driver.findElement(By.name("city")).sendKeys(testString);
		driver.findElement(By.name("postcode")).sendKeys(testString);

		Select country = new Select(driver.findElement(By
				.cssSelector("select.large-field")));
		country.selectByVisibleText("Bulgaria");

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Select region = new Select(driver.findElement(By.name("zone_id")));
		region.selectByVisibleText("Sofia");

		driver.findElement(By.cssSelector("input#button-guest")).click();

		// Checkout Step 4
//		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='button-shipping-method']")));
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath("//input[@id='button-shipping-method']")).click();

		// Checkout Step 5
		Sleeper.sleepTightInSeconds(2);
		new WebDriverWait(driver, 5).until(ExpectedConditions
				.presenceOfElementLocated(By.name("agree")));
		WebElement agreeCheckbox = driver.findElement(By.name("agree"));
		if (!agreeCheckbox.isSelected()) {
			agreeCheckbox.click();
		}
		driver.findElement(By.cssSelector("input#button-payment-method"))
				.click();

		// Checkout Step 6
		Sleeper.sleepTightInSeconds(2);

		// To-Do - assertText iMac
		// String iMac =
		// driver.findElement(By.xpath("//td[@class='name'] a").getText();
		// assertEquals("iMac", iMac);

		driver.findElement(By.cssSelector("input#button-confirm")).click();

		// Confirmation page
		new WebDriverWait(driver, 5).until(ExpectedConditions
				.titleIs("Your Order Has Been Processed!"));
		String confirmation = driver.findElement(By.tagName("h1")).getText();
		assertEquals("Your Order Has Been Processed!", confirmation);

	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
