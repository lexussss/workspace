package driverExamples;
import org.openqa.selenium.*;
import org.junit.*;
import org.openqa.selenium.firefox.*;

public class OurFirstTestClass {
	WebDriver driver;
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.get("http://pragmatic.bg/automation/example4.html");
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void testExamples(){
		WebElement element = driver.findElement(By.id("nextBid"));
		element.sendKeys("100");
	}
}
