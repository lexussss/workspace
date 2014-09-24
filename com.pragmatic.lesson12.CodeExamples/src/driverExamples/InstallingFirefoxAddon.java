package driverExamples;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.junit.*;



public class InstallingFirefoxAddon {
	WebDriver driver;
	
	@Before
	public void setUp() {
	    FirefoxProfile profile = new FirefoxProfile();
	    File file = new File ("C:/Users/Strahinski/Desktop/Automated Testing Course/Libraries - JUnit and Selenium/firebug-1.12.6-fx.xpi");
	    try {
			profile.addExtension(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    driver = new FirefoxDriver(profile);
	    driver.get("http://pragmatic.bg/automation/example4.html");
	}
	
	@After
	public void tearDown() {
	    driver.quit();
	}
	
	@Test
	public void testExamples() {
	    WebElement element = driver.findElement(By.id("nextBid"));
	    element.sendKeys("100");
	}
}
