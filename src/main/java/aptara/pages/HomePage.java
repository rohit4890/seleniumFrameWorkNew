package aptara.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
	
	private By flight = By.id("flightss");
	private By carRent = By.xpath("//span[contains(.,\"Car rentals\")]");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public WebElement getFlightButton() {
		return getElementWithWait(flight);
	}
	
	public WebElement getCarRentButton() {
		return getElementWithWait(carRent);
	}
	

	public void clickOnFlightsButton() {

		getFlightButton().click();
	}
	
	public void clickOnCarRentButton() {
	
		getCarRentButton().click();
	}
}
