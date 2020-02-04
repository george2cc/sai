package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderSummaryCheckoutPageLocators {

	/**
	 * Add all locators for the Order Summary Checkout page
	 */
	// hard copy price
	@FindBy(how = How.XPATH, using = "//div[@class='text-price']//span[contains(text(), '$487.60')]")
	public WebElement hardCopyEnglishTextPrice;

	// pdf copy price
	@FindBy(how = How.XPATH, using = "//span[@class='price'][contains(text(), '$487.60')]")
	public WebElement pdfCopyEnglishTextPrice;

	// product sub total price
	@FindBy(how = How.XPATH, using = "//div[@class='container-fluid OrderSummaryPriceSection']//div[contains(text(), '$487.60')]")
	public WebElement productsSubTotalPrice;
	
	// continue to payment method button
	@FindBy(how = How.XPATH, using = "//input[@value='CONTINUE TO PAYMENT METHOD']")
	public WebElement continueToPaymentMethodButton;
	


}
