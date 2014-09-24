package driverExamples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

	WebDriver driver;

	@Before
	public void setup() {
		this.driver = new FirefoxDriver();
		this.driver.get("http://abv.bg");
	}

	@Test
	public void myFirstTest() {
		WebElement usernameField = this.driver.findElement(By.id("username"));
		usernameField.sendKeys("dqdo koleda");

	}

	@After
	public void tearDown() {
		this.driver.quit();
	}

}
