package aptara.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class Page {

	public WebDriver driver;
	public WebDriverWait wait;
	
	// Constructor of Page Class - It initialize the variables driver and wait, whenever object of child class 
	// will be created.
	public Page(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	
	// Abstract methods that will be defined in child class and will be used in every pages
	public abstract String getPageTitle();
	public abstract WebElement getElement(By locator);
	public abstract WebElement getElementWithWait(By locator);
	public abstract List<WebElement> getElementList(By locator);
	public abstract WebElement waitForButtonClick(By locator);
	
	// Generic method that gives object of any provided page class
	public <Tpage extends BasePage>Tpage getInstanceOf(Class<Tpage> pageClass) {
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
