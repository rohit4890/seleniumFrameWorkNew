package aptara.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import aptara.utility.TakeScreenShot;

public class Test extends BaseTest{

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		try {
			try {
				TakeScreenShot.takeScreenShoot(driver, "Method 1");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
