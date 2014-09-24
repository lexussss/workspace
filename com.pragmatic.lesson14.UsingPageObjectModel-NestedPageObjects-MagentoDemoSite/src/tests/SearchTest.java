package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import pageobjects.*;

public class SearchTest {

	@Test
	public void testProductSearch()
	{
		//Create an instance of Home page 
		HomePage homePage = new HomePage();
		
		//Navigate to the Home page
		homePage.get();
		
		//Search for 'blazers', the searchInStore method will return
		//SearchResults class
		SearchResults searchResult = homePage.search().searchInStore("blazers");
		
		//Verify there are 2 products available with this search
		assertEquals(2, searchResult.getProducts().size());
		assertTrue(searchResult.getProducts().get(0).contains("SULLIVAN"));
		assertTrue(searchResult.getProducts().get(1).contains("STRETCH"));
		
		//Close the Search result page
		searchResult.close();
	}
}
