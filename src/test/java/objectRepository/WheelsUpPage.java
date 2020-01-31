package objectRepository;

public interface WheelsUpPage {

	// landing page locators
	public String heading = "//h1[contains(text(), 'A Revolution Has Taken Flight')]";
	public String phone_number = "//div//span[@class=\"link white text ng-star-inserted\"]";
	public String email = "//a[@href=\"mailto:info@wheelsup.com\"]";
	public String address = "//span[@class=\"base-label\"]";
	
	public String membership_options = "//a[contains(text(),'Membership Options')]";
	public String core_membership = "//a[contains(text(),'CORE MEMBERSHIP')]";
	public String core_member = "//h1[contains(text(),'Becoming a Wheels Up Core Member is easy')]";
	public String initiation_fee = "//h3[contains(text(),'Initiation fee')]";
	public String initiation_fee_amount = "//p[contains(text(),'$17,500')]";
	public String learn_more_today = "//h1[contains(text(),'Learn more today')]";
	public String first_name = "//input[@id=\"FirstName-clone\"]";
	public String last_name = "//input[@id=\"LastName-clone\"]";
	public String submit = "//a[contains(text(), 'CONTINUE')]";
	
	public String form_email = "//input[@id=\"Email-clone\"]";
	public String form_phone = "//input[@id=\"Phone-clone\"]";
	public String company_name = "//input[@id=\"Company__c-clone\"]";
	public String street_address = "//input[@id=\"Address-clone\"]";
	public String city = "//input[@id=\"City-clone\"]";
	public String zipcode = "//input[@id=\"PostalCode-clone\"]";
	public String state = "//input[@id=\"State-clone\"]";
	public String country = "//input[@id=\"Country-clone\"]";
	public String how_many_flights = "//div[@id='How_Many_Private_Flights_Per_Year__c-clone0']//div[@class='text-select']";
	public String how_many_flights_option = "//p[contains(text(),'1-5')]";
	public String travel_with_pets = "//label[@for=\"mktoRadio_79902_0-clonecss\"]";
	public String second_home = "//div[@id='Do_you_own_or_travel_to_a_second_home__c-cloneYes']//p[@class='label'][contains(text(),'Please select one')]";
	public String second_home_option = "//p[contains(text(),'No')]";
	public String currenty_fly = "//div[@id='How_does_the_Lead_currently_Travel__c-clone']//div[@class='listinputselect']//div[1]//app-input-select-box[1]//div[1]//div[1]//div[1]//label[1]";
	public String membership_type = "//div[@id='Product_Interest__c-clone']//div[@class='listinputselect']//div[1]//app-input-select-box[1]//div[1]//div[1]//div[1]//label[1]";
	public String hear_about_us = "//div[@id='leadSourceWebList-cloneAdvertisement']//p[@class='label'][contains(text(),'Please select one')]";
	public String hear_about_us_option = "//li[@class='dropdown-box-items ng-star-inserted']//p[contains(text(),'Costco')]";
	public String let_us_know = "//textarea[@class='textarea-box']";
	public String close_form = "//div[@class='close']//i[@class='icon-close']";
}