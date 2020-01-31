package browserUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	private static final String MOZILLA = "Mozilla";
	private static final String CHROME = "Chrome";


	/**
	 * 
	 * @param browserName
	 * @return
	 */
	public WebDriver setBrowser(String browserName) {
		if (browserName.equalsIgnoreCase(CHROME)) {

			ChromeBrowser openchrome = new ChromeBrowser();
			return openchrome.initiateBrowser();

		} else if (browserName.equalsIgnoreCase(MOZILLA)) {
//					MozillaBrowser openmozilla=new MozillaBrowser();
//					return openmozilla.initiateBrowser();
		}

		else {
			System.out.println(
					"Oops! we do not have this option please choose \n ChromeBrowser \n Internet Explorer \n Mozilla \n olny  ");

		}
		return null;

	}

	/**
	 * 
	 * @param driver
	 * @param url
	 * @return
	 * @throws InterruptedException
	 */
	public WebDriver launchApplicationUrl(WebDriver driver, String url) throws InterruptedException {
		driver.get(url);
		TimeUnit.SECONDS.sleep(2);

		return driver;
	}

}
