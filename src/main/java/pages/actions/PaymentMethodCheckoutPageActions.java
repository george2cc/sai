package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.OrderSummaryCheckoutPageLocators;
import pages.locators.PaymentMethodCheckoutPageLocators;
import utils.SeleniumDriver;

public class PaymentMethodCheckoutPageActions {

	PaymentMethodCheckoutPageLocators paymentMethodCheckoutPageLocators=null;
	
    public PaymentMethodCheckoutPageActions()
    {
        
        this.paymentMethodCheckoutPageLocators=new PaymentMethodCheckoutPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), paymentMethodCheckoutPageLocators);
    }
    
	// Click on the continue Payment summary radio button
	public void clickOnPayByVisaMasterCardRadioButton()
	{
		paymentMethodCheckoutPageLocators.paybyVisaMasterCard.click();
		
	}
	
    // enter purchase order number as text
   	public void selectPurchaseOrderNo(String purchaseOrderNo)
   	{
   		paymentMethodCheckoutPageLocators.purchaseOrderNumber.sendKeys(purchaseOrderNo);

   	}
   	
	// Click on the continue To Payment button
	public void clickOnContinueToPaymentButton()
	{
		paymentMethodCheckoutPageLocators.continueToPaymentButton.click();
		
	}
   	
}
