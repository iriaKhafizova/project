package businessUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import commonUtility.ReadPropertyFile;
import objectRepository.WalletHubLoginPage;
import objectRepository.WalletHubProfilePage;

public class WalletHub {
	WebDriver driver;
	/**
	 * 
	 * @param _driver
	 */
	public WalletHub(WebDriver _driver) {
		driver = _driver;
	}
	/**
	 * 
	 * @param testSteps
	 */
	// login into walletHub
	public void login(ExtentTest testSteps) {
		try {
			String userName = ReadPropertyFile.readProperties("WalletHub_UserName");
			String password = ReadPropertyFile.readProperties("WalletHub_Password");

			driver.findElement(By.xpath(WalletHubLoginPage.loginLink)).click();
			testSteps.log(Status.INFO, "Click on Login link");

			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement loginButtonelement = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(WalletHubLoginPage.loginButton)));

			driver.findElement(By.xpath(WalletHubLoginPage.emailAddressTextField)).sendKeys(userName);
			testSteps.log(Status.INFO, "Enter Email Address : " + userName);
			driver.findElement(By.xpath(WalletHubLoginPage.passwordTextField)).sendKeys(password);
			testSteps.log(Status.INFO, "Enter Password : " + password);
			loginButtonelement.click();
			testSteps.log(Status.INFO, "Click on Login button");
		} catch (Exception e) {
			testSteps.log(Status.ERROR, e);

		}

	}
	/**
	 * 
	 * @param testSteps
	 */
	// write review for Test Insurance company
	public void writeReview(ExtentTest testSteps) {
		try {
			String review = "What is Health Insurance? Health insurance is an insurance product which covers medical and surgical expenses of an insured individual. It reimburses the expenses incurred due to illness or injury or pays the care provider of the insured individual directly";

			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement ratingelement = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(WalletHubProfilePage.ratingStars)));
			Actions actions = new Actions(driver);
			actions.moveToElement(ratingelement).perform();
			testSteps.log(Status.INFO, "Mouse hover to rating stars");
			ratingelement.click();
			testSteps.log(Status.INFO, "Click on 5 star rating");
			driver.findElement(By.xpath(WalletHubProfilePage.dropDown)).click();
			testSteps.log(Status.INFO, "Click on drop down");
			driver.findElement(By.xpath(WalletHubProfilePage.healthInsuranceOption)).click();
			testSteps.log(Status.INFO, "Select Health Insurance");
			driver.findElement(By.xpath(WalletHubProfilePage.writeReview)).sendKeys(review);
			testSteps.log(Status.INFO, "Enter review : " + review);
			driver.findElement(By.xpath(WalletHubProfilePage.submitButton)).click();
			testSteps.log(Status.INFO, "Click on Submit button");
			WebElement confirmationMessage = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(WalletHubProfilePage.confirmationMessage)));
			Assert.assertEquals(confirmationMessage.getText(), "Your review has been posted.");
			testSteps.log(Status.INFO, "Verify message : " + confirmationMessage.getText());
			TimeUnit.SECONDS.sleep(5);
			String userName = ReadPropertyFile.readProperties("WalletHub_UserName");
			userName = userName.split("@")[0];
			String url = "https://wallethub.com/profile/" + userName + "/reviews/";
			driver.get(url);
			testSteps.log(Status.INFO, "Navigate to URL : " + url);
			driver.findElement(By.xpath(WalletHubProfilePage.review)).click();
			testSteps.log(Status.INFO, "Click on Review Section");
			System.out.println(driver.findElement(By.xpath(WalletHubProfilePage.postedReview)).getText());
			Assert.assertEquals(driver.findElement(By.xpath(WalletHubProfilePage.postedReview)).getText(), review);
			testSteps.log(Status.INFO, "Posted review is verified");

		} catch (Exception e) {
			testSteps.log(Status.ERROR, e);

		}

	}

}
