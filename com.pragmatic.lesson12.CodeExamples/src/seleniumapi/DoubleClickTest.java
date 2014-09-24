package seleniumapi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;


import org.junit.Test;

public class DoubleClickTest {
	@Test
	public void testDoubleClick() throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://dl.dropbox.com/u/55228056/DoubleClickDemo.html");
			
		WebElement message = driver.findElement(By.id("message"));
				
		//Verify color is Blue
		assertEquals("rgba(0, 0, 255, 1)", message.getCssValue("background-color").toString());
		
		Actions builder = new Actions(driver);
		builder.doubleClick(message).build().perform();
		
		
		String a = "1";
		int b = Integer.parseInt(a);
		
		
		//Verify Color is Yellow
		assertEquals("rgba(255, 255, 0, 1)",message.getCssValue("background-color").toString());
		
		driver.close();
	}
}