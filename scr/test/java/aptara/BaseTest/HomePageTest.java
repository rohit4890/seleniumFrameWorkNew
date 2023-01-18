package aptara.BaseTest;

import org.testng.annotations.Test;

import aptara.pages.HomePage;

public class HomePageTest extends BaseTest{
	
	@Test
	public void clickOnFlightButton() {
		
		page.getInstanceOf(HomePage.class).clickOnFlightsButton();
		
	}
	
	@Test
	public void clickOnCarRentButton() {
		
		page.getInstanceOf(HomePage.class).clickOnCarRentButton();
		
	}

}
