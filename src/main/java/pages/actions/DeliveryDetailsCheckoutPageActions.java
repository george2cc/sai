package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.BillingDetailsCheckoutPageLocators;
import pages.locators.DeliveryDetailsCheckoutPageLocators;
import utils.SeleniumDriver;

public class DeliveryDetailsCheckoutPageActions {
	

	DeliveryDetailsCheckoutPageLocators deliverylDetailsCheckoutPageLocators=null;
    public DeliveryDetailsCheckoutPageActions()
    {
        
        this.deliverylDetailsCheckoutPageLocators=new DeliveryDetailsCheckoutPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), deliverylDetailsCheckoutPageLocators);
    }

    /**
     *  Add actions to be performed on this page
     *  
     */
	// click on checkbox delivery details
   	public void clickOnDeliveryDetailsForShipping()
   	{
   		deliverylDetailsCheckoutPageLocators.clickCopyInvoiceAddressCheckbox.click();
       
   	}

	// click on button continue to order summary
   	public void clickOnContinueToOrderSummary()
   	{
   		deliverylDetailsCheckoutPageLocators.clickOnContinueToOrderSummaryButton.click();
       
   	}

}
