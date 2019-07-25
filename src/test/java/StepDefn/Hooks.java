package StepDefn;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
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
	public static void afterMethod(Scenario Scenario) {
		
		if (Scenario.isFailed()) {
			final byte[] screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		Scenario.embed(screenshot, "image/png");
		}
		
		driver.close();
		driver.quit();

}
}