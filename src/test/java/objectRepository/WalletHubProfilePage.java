package objectRepository;

public interface WalletHubProfilePage {

	public String ratingStars = "(//review-star[@class='rvs-svg']/div/*[local-name()='svg'])[5]";
	public String dropDown = "//span[text()='Select...']";
	public String healthInsuranceOption = "//span[text()='Select...']//following::ul/li[text()='Health Insurance']";
	public String writeReview = "//textarea[@class='textarea wrev-user-input validate']";
	public String submitButton = "//div[text()='Submit']";
	public String confirmationMessage = "//h4[text()='Your review has been posted.']";
	public String review = "//li[@class='selected']";
	public String postedReview = "//div[@class='reviews']/div/p[2]";
}
