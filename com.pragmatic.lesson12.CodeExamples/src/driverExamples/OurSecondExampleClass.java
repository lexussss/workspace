package driverExamples;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.junit.Test;


public class OurSecondExampleClass {
	WebDriver driver;
	
	@Before
	public void setUp(){
	    FirefoxProfile profile = new FirefoxProfile();
	    profile.setPreference("browser.startup.homepage", "http://pragmatic.bg/automation/example4.html");
	    driver = new FirefoxDriver(profile);
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
