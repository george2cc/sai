package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.BillingDetailsCheckoutPageLocators;
import utils.SeleniumDriver;

public class BillingDetailsCheckoutPageActions {
	
	
	BillingDetailsCheckoutPageLocators billingDetailsCheckoutPageLocators=null;
    public BillingDetailsCheckoutPageActions()
    {
        
        this.billingDetailsCheckoutPageLocators=new BillingDetailsCheckoutPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), billingDetailsCheckoutPageLocators);
    }

    /**
     *  Add actions to be performed on this page
     *  
     */
	// select the user title
   	public void selectUserTitle(String userTitle)
   	{
   	   Select country=new Select(billingDetailsCheckoutPageLocators.selectTitleDropDown);
       country.selectByVisibleText(userTitle);
   		
   	}
   	
	// enter first name
   	public void enterUserFirstName(String userFirstName)
   	{
   		billingDetailsCheckoutPageLocators.userFirstName.sendKeys(userFirstName);
   		
   	}

	// enter Last name
   	public void enterUserLastName(String userLastName)
   	{
   		billingDetailsCheckoutPageLocators.userLastName.sendKeys(userLastName);
   		
   	}
   	
	// enter phone number
   	public void enterUserPhoneNumber(String phoneNo)
   	{
   		billingDetailsCheckoutPageLocators.userPhoneNo.sendKeys(phoneNo);
   		
   	}
   	
	// enter email address
   	public void enterUserEmailAddress(String emailAddress)
   	{
   		billingDetailsCheckoutPageLocators.userPhoneNo.sendKeys(emailAddress);
   		
   	}
   	
	// enter billing address on line1
   	public void enterUserBillingAddressLine1(String billAddress1)
   	{
   		billingDetailsCheckoutPageLocators.billAddressLine1.sendKeys(billAddress1);
   		
   	}

	// select country value
   	public void selectCountry(String country)
   	{
   		Select selectCountry = new Select(billingDetailsCheckoutPageLocators.selectCountry);
   		selectCountry.selectByVisibleText(country);
   		
   	}
   	
	// enter city suburb value
   	public void enterUserSuburb(String suburb)
   	{
   		billingDetailsCheckoutPageLocators.userSuburb.sendKeys(suburb);
   		
   	}

	// select state value
   	public void selectState(String state)
   	{
   		Select selectState = new Select(billingDetailsCheckoutPageLocators.userState);
   		selectState.selectByVisibleText(state);
   		
   	}
   	
	// enter city suburb value
   	public void enterUserPostalCode(String postalCode)
   	{
   		billingDetailsCheckoutPageLocators.userPostalCode.sendKeys(postalCode);
   		
   	}
   	
	// click on delivery details button
   	public void clickOnDeliveryDetailsButton()
   	{
   		billingDetailsCheckoutPageLocators.continueToDeliveryDetailsBtn.click();
   		
   	}

}
