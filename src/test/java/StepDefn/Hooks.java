package StepDefn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public static void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RSPC\\eclipse-workspace\\Telecom\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");

	}

	@After
	public static void afterMethod() {
		driver.close();
		driver.quit();

}
}