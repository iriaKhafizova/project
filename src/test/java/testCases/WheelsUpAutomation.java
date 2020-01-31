package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browserUtility.DriverManager;
import businessUtility.WheelsUp;
import commonUtility.ReadPropertyFile;

public class WheelsUpAutomation {

	// define instances and objects
	String browserName;
	WebDriver driver;
	DriverManager driverManager = new DriverManager();

	@BeforeClass
	public void setupConfigurations() throws InterruptedException {
		// get browser name
		browserName = ReadPropertyFile.readProperties("BrowserName");
		driver = driverManager.setBrowser(browserName);

		// launch application URL
		String url = ReadPropertyFile.readProperties("ApplicationUrl");
		driver = driverManager.launchApplicationUrl(driver, url);
	}

	@Test
	public void postMessageOnFacebook() throws InterruptedException {
		WheelsUp wheelsup = new WheelsUp(driver);

		wheelsup.homePage();
		wheelsup.membershipOptions();
		wheelsup.formFilling();

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}