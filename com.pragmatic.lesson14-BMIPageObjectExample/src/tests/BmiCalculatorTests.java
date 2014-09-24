package tests;

import org.junit.Test;

import pageobjects.*;
import static org.junit.Assert.*;

public class BmiCalculatorTests {

	@Test
	public void testBmiCalculation()
	{
		//Create an instance of Bmi Calculator Page class
		//and provide the driver
		BmiCalcPage bmiCalcPage = new BmiCalcPage();
		
		//Open the Bmi Calculator Page
		bmiCalcPage.goTo();
		

		//Calculate the Bmi by supplying Height and Weight values
		bmiCalcPage.calculateBmi("181", "80");

		//Verify Bmi & Bmi Category values
		assertEquals("24.4", bmiCalcPage.getBmi());
		assertEquals("Normal", bmiCalcPage.getBmiCategory());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Close the Bmi Calculator Page
		bmiCalcPage.close();
	}

}
