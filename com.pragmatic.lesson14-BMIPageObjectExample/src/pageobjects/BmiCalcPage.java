package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class BmiCalcPage extends LoadableComponent<BmiCalcPage> {
	
	@FindBy (how = How.ID, using = "heightCMS")
	private WebElement heightCMS;
	@FindBy (how = How.ID, using = "weightKg")
	private WebElement weightKg;
	@FindBy (how = How.ID, using = "Calculate")
	private WebElement calculateButton;
	private WebElement bmi;
	private WebElement bmi_category;
	private WebDriver driver;
	private String url = "http://dl.dropbox.com/u/55228056/bmicalculator.html";
	private String title = "BMI Calculator";
	
	public BmiCalcPage() {
		driver = new FirefoxDriver();
		PageFactory.initElements(driver, this);
	}
	
	@Override
	protected void load() {
		this.driver.get(url);
	}
	
	@Override
	protected void isLoaded()  {
		assertTrue(driver.getTitle().equals(title));
	}
	
	public void calculateBmi(String height, String weight) {
		heightCMS.sendKeys(height);
		weightKg.sendKeys(weight);
		calculateButton.click();
	}
	
	public String getBmi() {
		return bmi.getAttribute("value");
	}
	
	public String getBmiCategory() {
		return bmi_category.getAttribute("value");
	}
	
	public void close() {
		this.driver.quit();;
	}

	public void goTo() {
		this.driver.get(this.url);
	}
}
