package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BillingDetailsCheckoutPageLocators {

	/**
	 * Add all locators for the Checkout page
	 */
	// title selector
	@FindBy(how = How.XPATH, using = "//ul[@class='chosen-results']")
	public WebElement selectTitleDropDown;

	// First name selector
	@FindBy(how = How.XPATH, using = "//*[@id='BillFirstName']']")
	public WebElement userFirstName;

	// Last name selector
	@FindBy(how = How.XPATH, using = "//*[@id='BilLastName']']")
	public WebElement userLastName;

	// locator for phone number
	@FindBy(how = How.XPATH, using = "//input[@id='BillPhoneNo']")
	public WebElement userPhoneNo;

	// locator for email address
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public WebElement userEmailAddress;

	// locator for bill address line1
	@FindBy(how = How.XPATH, using = "//input[@id='BillAddressLine1']")
	public WebElement billAddressLine1;

	// locator for country
	@FindBy(how = How.XPATH, using = "//select[@id='billCountry']")
	public WebElement selectCountry;

	// locator for city suburb
	@FindBy(how = How.XPATH, using = "//input[@id='BillCity']")
	public WebElement userSuburb;
	
	// locator for state
	@FindBy(how = How.XPATH, using = "//ul[@class='chosen-results']")
	public WebElement userState;
	
	// locator for Postal codes
	@FindBy(how = How.XPATH, using = "//input[@id='BillZipcode']")
	public WebElement userPostalCode;
	
	// locator for contineu to delivery address button
	@FindBy(how = How.XPATH, using = "//input[@value='CONTINUE TO DELIVERY DETAILS']")
	public WebElement continueToDeliveryDetailsBtn;
}
