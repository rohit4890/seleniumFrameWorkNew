package aptara.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page{

	public BasePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			return element;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public WebElement getElementWithWait(By locator) {
		WebElement element = null;
		try {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return element;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public List<WebElement> getElementList(By locator) {
		List<WebElement> element = null;
		try {
			element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
			return element;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public WebElement waitForButtonClick(By locator) {
		WebElement element = null;
		try {
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			return element;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}

}
