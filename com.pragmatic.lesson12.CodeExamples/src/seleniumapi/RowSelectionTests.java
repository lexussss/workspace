package seleniumapi;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.*;

public class RowSelectionTests {
	
	WebDriver driver;

	@Before
	public void setUp()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Strahinski\\Desktop\\Automated Testing Course\\Libraries - JUnit and Selenium\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://jsbin.com/ofupam");
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='live']//iframe[@class='stretch']")));
		
		//You can try using the SHIFT Key to select multiple lines on the following table in the site below
		//driver.get("http://demos.telerik.com/aspnet-ajax/grid/examples/client/selecting/defaultcs.aspx");		
	}
	
	@Test 
	public void testRowSelectionUsingControlKey() {
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='live']//iframe[@class='stretch']")));
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='fruits']/tbody/tr"));
		
		//Select second and fourth row from Table using Control Key.
		//Row Index start at 0
		System.out.println(allRows.size());
		
		Actions builder = new Actions(driver);
		
		builder.keyDown(Keys.CONTROL)
				.click(allRows.get(0).findElement(By.tagName("td")))
				.click(allRows.get(1).findElement(By.tagName("td")))
				.click(allRows.get(3).findElement(By.tagName("td")))
				.keyUp(Keys.CONTROL);

		Action selectMultiple = builder.build();
		selectMultiple.perform();
		
		//Verify Selected Rows in Table are exactly how we expect
		int numberOfSelectedRows= driver.findElements(By.xpath("//table[@id='fruits']/tbody//td[contains(@class,'ui-selected')]")).size();

		assertEquals(3, numberOfSelectedRows);	
	}

	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
