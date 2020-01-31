package businessUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import commonUtility.ReadPropertyFile;
import objectRepository.WheelsUpPage;

public class WheelsUp {

	WebDriver driver;
	/**
	 * 
	 * @param _driver
	 */
	public WheelsUp(WebDriver _driver) {
		driver = _driver;
	}
	
	/**
	 * 
	 * @param testSteps
	 * @throws InterruptedException
	 */
	public void homePage() throws InterruptedException {
		try {
			String header = driver.findElement(By.xpath(WheelsUpPage.heading)).getText();
			System.out.println(header);
			
			WebElement obj = driver.findElement(By.xpath(WheelsUpPage.phone_number));
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView();", obj);
			TimeUnit.SECONDS.sleep(5);
			String getPhone = driver.findElement(By.xpath(WheelsUpPage.phone_number)).getText();
			System.out.println(getPhone);
			
			String getEmail = driver.findElement(By.xpath(WheelsUpPage.email)).getText();
			System.out.println(getEmail);
			
			String getAddress = driver.findElement(By.xpath(WheelsUpPage.address)).getText();
			System.out.println(getAddress);
			
			jse.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void membershipOptions() throws InterruptedException {
		try {
			System.out.println("============================");
			
			WebDriverWait wait =new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(WheelsUpPage.membership_options)));
			driver.findElement(By.xpath(WheelsUpPage.membership_options)).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(WheelsUpPage.core_membership)));
			System.out.println("Click on memebership");
			driver.findElement(By.xpath(WheelsUpPage.core_membership)).click();
			System.out.println("Click on core");
			
			TimeUnit.SECONDS.sleep(5);
			WebElement obj1 = driver.findElement(By.xpath(WheelsUpPage.core_member));
			JavascriptExecutor jse1 = (JavascriptExecutor) driver;
			jse1.executeScript("arguments[0].scrollIntoView();", obj1);
			TimeUnit.SECONDS.sleep(5);
			String getInitiationFee = driver.findElement(By.xpath(WheelsUpPage.initiation_fee)).getText();
			System.out.println(getInitiationFee);
			
			String getInitiationFeeAmount = driver.findElement(By.xpath(WheelsUpPage.initiation_fee_amount)).getText();
			System.out.println(getInitiationFeeAmount);
			
			WebElement obj2 = driver.findElement(By.xpath(WheelsUpPage.learn_more_today));
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			jse2.executeScript("arguments[0].scrollIntoView();", obj2);
			
			driver.findElement(By.xpath(WheelsUpPage.first_name)).sendKeys("James");
			driver.findElement(By.xpath(WheelsUpPage.last_name)).sendKeys("Smith");
			
			driver.findElement(By.xpath(WheelsUpPage.submit)).click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void formFilling() throws InterruptedException {
		try {
			System.out.println("Fill Form Details");
			driver.findElement(By.xpath("//mat-icon[text()='clear']")).click();
//			WebElement obj3 = driver.findElement(By.xpath(WheelsUpPage.form_email));
//			JavascriptExecutor jse3 = (JavascriptExecutor) driver;
//			jse3.executeScript("arguments[0].scrollIntoView();", obj3);
			WebDriverWait wait =new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(WheelsUpPage.form_email)));
			driver.findElement(By.xpath(WheelsUpPage.form_email)).sendKeys("dummy@gmail.com");
			driver.findElement(By.xpath(WheelsUpPage.form_phone)).sendKeys("1234567890");
			driver.findElement(By.xpath(WheelsUpPage.company_name)).sendKeys("company name");
			
			driver.findElement(By.xpath(WheelsUpPage.street_address)).sendKeys("street");
			driver.findElement(By.xpath(WheelsUpPage.city)).sendKeys("city");
			driver.findElement(By.xpath(WheelsUpPage.zipcode)).sendKeys("110011");
			driver.findElement(By.xpath(WheelsUpPage.state)).sendKeys("state");
			driver.findElement(By.xpath(WheelsUpPage.country)).sendKeys("country");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(WheelsUpPage.how_many_flights)));
			driver.findElement(By.xpath(WheelsUpPage.how_many_flights)).click();
			WebElement obj3 = driver.findElement(By.xpath(WheelsUpPage.how_many_flights_option));
			JavascriptExecutor jse3 = (JavascriptExecutor) driver;
			jse3.executeScript("arguments[0].scrollIntoView();", obj3);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(WheelsUpPage.how_many_flights_option)));
			driver.findElement(By.xpath(WheelsUpPage.how_many_flights_option)).click();
			driver.findElement(By.xpath(WheelsUpPage.travel_with_pets)).click();
			driver.findElement(By.xpath(WheelsUpPage.second_home)).click();
			WebElement obj4 = driver.findElement(By.xpath(WheelsUpPage.second_home));
			JavascriptExecutor jse4 = (JavascriptExecutor) driver;
			jse4.executeScript("arguments[0].scrollIntoView();", obj4);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(WheelsUpPage.second_home_option)));
			driver.findElement(By.xpath(WheelsUpPage.second_home_option)).click();
			driver.findElement(By.xpath(WheelsUpPage.currenty_fly)).click();
			driver.findElement(By.xpath(WheelsUpPage.membership_type)).click();
			driver.findElement(By.xpath(WheelsUpPage.hear_about_us)).click();
			WebElement obj5 = driver.findElement(By.xpath(WheelsUpPage.hear_about_us));
			JavascriptExecutor jse5 = (JavascriptExecutor) driver;
			jse5.executeScript("arguments[0].scrollIntoView();", obj5);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(WheelsUpPage.hear_about_us_option)));
			driver.findElement(By.xpath(WheelsUpPage.hear_about_us_option)).click();
			driver.findElement(By.xpath(WheelsUpPage.let_us_know)).sendKeys("Sample question");
			driver.findElement(By.xpath(WheelsUpPage.close_form)).click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/**
	 * 
	 * @param testSteps
	 * @throws InterruptedException
	 */
	
}
