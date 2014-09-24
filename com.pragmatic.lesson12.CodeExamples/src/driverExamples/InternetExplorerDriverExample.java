package driverExamples;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class InternetExplorerDriverExample {
	WebDriver driver;
	String parentHandle;

	@Before
	public void setUp(){
		System.setProperty("webdriver.ie.driver", "D:\\Pragmatic_Automation_Testing_Course\\Lectures\\Install\\WebDrivers\\IE\\2.42\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		this.parentHandle = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://abv.bg");
	}

	@Test
	public void testExamples(){
		WebElement usernameInput = driver.findElement(By.id("username"));
		usernameInput.sendKeys("test");
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
}
