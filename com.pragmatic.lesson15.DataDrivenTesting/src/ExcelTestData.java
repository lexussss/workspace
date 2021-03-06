import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(value = Parameterized.class)
public class ExcelTestData {
	
	private static WebDriver driver;
	private static StringBuffer verificationErrors = new StringBuffer();
	
	private String height;
	private String weight;
	private String bmi;
	private String bmiCategory;
	private String error;
	
	@Parameters
    public static Collection<?> testData() throws Exception {
        InputStream spreadsheet = new FileInputStream("D:\\Pragmatic_Automation_Testing_Course\\Lectures\\Lecture15\\Test Data Files for your tests\\Test Data Files\\Data.xlsx");
		return new SpreadsheetData(spreadsheet).getData();
    }
	
	public ExcelTestData(String height, String weight, String bmi, String bmiCategory, String error)
	{
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
		this.bmiCategory = bmiCategory;
		this.error = error;
	}
	
	@BeforeClass
	public static void setUp() throws Exception { 
	
		// Create a new instance of the Chrome driver
		driver = new FirefoxDriver();
		driver.get("http://dl.dropbox.com/u/55228056/bmicalculator.html");
	}

	@Test
	public void testBMICalculator() throws Exception {
	
		try {
				WebElement heightField = driver.findElement(By.name("heightCMS"));
				heightField.clear();
				if (!height.equals("<Blank>"))
					heightField.sendKeys(this.height);
				
				WebElement weightField = driver.findElement(By.name("weightKg"));
				weightField.clear();
				if(!weight.equals("<Blank>"))
					weightField.sendKeys(this.weight);
		
				WebElement calculateButton = driver.findElement(By.id("Calculate"));
				calculateButton.click();
			
				if (error.equals("<Blank>")) {
					WebElement bmiField = driver.findElement(By.name("bmi"));
					assertEquals(this.bmi, bmiField.getAttribute("value"));
					
					WebElement bmiCategoryField = driver.findElement(By.name("bmi_category"));
					assertEquals(this.bmiCategory,bmiCategoryField.getAttribute("value"));
				}
				else {
					WebElement errorLabel = driver.findElement(By.id("error"));
					assertEquals(this.error,errorLabel.getText());
				}
		} catch (Error e) {
			System.out.println("Hvyrli exception");
			//Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
		}
	}
	
	@AfterClass
	public static void tearDown() throws Exception {
	
		//Close the browser
		driver.quit();
		
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			System.out.println(verificationErrorString);
			fail(verificationErrorString);
		}
	}
}
