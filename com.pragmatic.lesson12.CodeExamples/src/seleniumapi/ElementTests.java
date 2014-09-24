package seleniumapi;

import static org.junit.Assert.assertEquals;

import java.util.List;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementTests {

	static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		System.setProperty(
				"webdriver.chrome.driver",
				"D:\\Pragmatic_Automation_Testing_Course\\Lectures\\Install\\WebDrivers\\Chrome\\2.10\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://dl.dropbox.com/u/55228056/DoubleClickDemo.html");
	}

	@Test
	public void testElementText() {
		// Get the message Element
		WebElement message = driver.findElement(By.id("message"));

		// Get the message elements text
		String messageText = message.getText();

		// Verify message element's text displays
		// "Click on me and my color will change"
		assertEquals("Click on me and my color will change", messageText);

		// Get the area Element
		WebElement area = driver.findElement(By.id("area"));

		// Verify area element's text displays "Div's Text\nSpan's Text"
		assertEquals("Div's Text\nSpan's Text", area.getText());
	}

	@Test
	public void someTest() {

		WebElement area = driver.findElement(By.id("area"));
		WebElement message = driver.findElement(By.id("message"));

		List<WebElement> list = driver.findElements(By.tagName("tr"));
		Assert.assertEquals(3, list.size());

		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(area).click(message)
				.keyUp(Keys.CONTROL).build().perform();
	}

	@Test
	public void testElementAttribute() {
		WebElement message = driver.findElement(By.id("message"));
		assertEquals("justify", message.getAttribute("align"));
	}

	@Test
	public void testElementStyle() {
		WebElement message = driver.findElement(By.id("message"));
		String width = message.getCssValue("width");
		assertEquals("150px", width);
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}