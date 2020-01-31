package browserUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class ChromeBrowser implements Browser {

	private static final String USER_DIR = "user.dir";
	private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";

	// steps to initialize Chrome browser
	public WebDriver initiateBrowser() {
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver;
		System.setProperty(WEBDRIVER_CHROME_DRIVER, System.getProperty(USER_DIR) + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(opts);
		driver.manage().window().maximize();
		return driver;
	}

}
