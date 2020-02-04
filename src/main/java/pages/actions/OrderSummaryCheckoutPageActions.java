package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.OrderSummaryCheckoutPageLocators;
import utils.SeleniumDriver;

public class OrderSummaryCheckoutPageActions {

	OrderSummaryCheckoutPageLocators orderSummaryCheckoutPageLocators=null;
	
    public OrderSummaryCheckoutPageActions()
    {
        
        this.orderSummaryCheckoutPageLocators=new OrderSummaryCheckoutPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), orderSummaryCheckoutPageLocators);
    }
    
	// Click on the continue Payment summary button
	public void clickOnContinuePaymentSummaryButton()
	{
		orderSummaryCheckoutPageLocators.continueToPaymentMethodButton.click();
		
	}
	
}
