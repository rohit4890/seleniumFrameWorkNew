package aptara.BaseTest;

import aptara.driverFactory.DriverFactory;

import aptara.pages.Page;
import aptara.utility.ConfigReader;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import aptara.pages.BasePage;



public class BaseTest {

	public Page page;
	public DriverFactory driverFactory;
	public ConfigReader configReader;
	public WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		
		configReader = new ConfigReader();
		
		driverFactory = new DriverFactory();
		driverFactory.initializeDriver(configReader.getDataFromPropertiesFile("browser"));
		
		DriverFactory.getWebDriver().get(configReader.getDataFromPropertiesFile("appURL"));
		driver = DriverFactory.getWebDriver();
		page = new BasePage(driver);
	}
}
