package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentMethodCheckoutPageLocators {

	/**
	 * Add all locators for the Payment Method Checkout page
	 */
	// Credit card Visa Mastercard locator
	@FindBy(how = How.XPATH, using = "//input[@id='AccountRadio1']")
	public WebElement paybyVisaMasterCard;
	
	// Purchase order locator
	@FindBy(how = How.XPATH, using = "//input[@id='txtRefOrderNo']")
	public WebElement purchaseOrderNumber;
	
	// Continue to payment locator
	@FindBy(how = How.XPATH, using = "//button[@id='btnContinueToPaymet']")
	public WebElement continueToPaymentButton;
}
