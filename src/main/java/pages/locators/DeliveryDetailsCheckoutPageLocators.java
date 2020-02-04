package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DeliveryDetailsCheckoutPageLocators {

	/**
	 * Add all locators for the Delivery Details page
	 */
	// checkbox delivery details
	@FindBy(how = How.XPATH, using = "//input[@id='checkboxCopyInvoiceAddress']")
	public WebElement clickCopyInvoiceAddressCheckbox;
	
	// order summary button
	@FindBy(how = How.XPATH, using = "//input[@value='CONTINUE TO ORDER SUMMARY']")
	public WebElement clickOnContinueToOrderSummaryButton;
}
