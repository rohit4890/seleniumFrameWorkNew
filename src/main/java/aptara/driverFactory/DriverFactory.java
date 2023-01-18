package aptara.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	
	/*
	 * This method is used to initialize the thread local driver on the basis of given browser
	 * @param browser
	 * @return This will return tlDriver
	 */
	public WebDriver initializeDriver(String browser) {
		
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
			
		}else if(browser.equalsIgnoreCase("safari")) {
			
			WebDriverManager.safaridriver().setup();
			tlDriver.set(new SafariDriver());
			
		}else if(browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			tlDriver.set(new EdgeDriver());
		
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		else {
			System.out.println("Please provide correct browser name");
		}
		
		getWebDriver().manage().deleteAllCookies();
		getWebDriver().manage().window().maximize();
		
		return getWebDriver();
		
	}
	
	/*
	 * This is used to get the driver with ThreadLocal
	 * @return tlDriver
	 */
	public static synchronized WebDriver getWebDriver() {
		
		return tlDriver.get();
	}

}
