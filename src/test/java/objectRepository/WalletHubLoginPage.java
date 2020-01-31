package objectRepository;

public interface WalletHubLoginPage {

	// login page Locators
	public String loginLink = "//span[text()='Login']";
	public String emailAddressTextField = "//input[@ng-model='fields.email']";
	public String passwordTextField = "//input[@ng-model='fields.password']";
	public String loginButton = "//span[text()='Login']";

}
