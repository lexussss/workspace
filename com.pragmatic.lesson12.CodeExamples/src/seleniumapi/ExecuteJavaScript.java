package seleniumapi;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecuteJavaScript {
	@Test   //open class ExecuteJavaScript
	public void testJavaScriptCalls() throws Exception
	{
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Strahinski\\Desktop\\Automated Testing Course\\Libraries - JUnit and Selenium\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
			
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String title = (String) js.executeScript("return document.title");
		assertEquals("Google", title);

		long links = (Long) js.executeScript("var links = document.getElementsByTagName('A'); return links.length");
		assertEquals(41, links);
			
		driver.quit();
			
	}
}