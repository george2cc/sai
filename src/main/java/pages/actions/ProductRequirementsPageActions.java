package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.ProductRequirementsPageLocators;
import utils.SeleniumDriver;

public class ProductRequirementsPageActions {
	
	ProductRequirementsPageLocators productRequirementsPageLocators=null;
    public ProductRequirementsPageActions()
    {
        
        this.productRequirementsPageLocators=new ProductRequirementsPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), productRequirementsPageLocators);
    }

    /**
     *  Add actions to be performed on this page
     *  
     */
    
    // select pdf product format from dropdown
   	public void selectProductFormatPdf(String pdfProductFormat)
   	{
   	   Select country=new Select(productRequirementsPageLocators.selectProductFormat);
       country.selectByVisibleText(pdfProductFormat);
   		
   	}
   	
    // Clicks on a Standards Radio button
   	public void selectProductQuantity(String productQuantity)
   	{
   	   Select country=new Select(productRequirementsPageLocators.selectProductQuantity);
       country.selectByVisibleText(productQuantity);

   	}
   	
    // unit price of hard copy pdf 
   	public String unitPriceOfPdfEnglishDrm()
   	{
   		String unitPriceOfPdfEnglish = productRequirementsPageLocators.pdfEnglishUnitPrice.getText();
   		System.out.println("unit price of pdf englihs is: "+unitPriceOfPdfEnglish);
		return unitPriceOfPdfEnglish;

   	}
   	
    // unit price of hard copy pdf 
   	public String unitPriceOfHardCopyPdf()
   	{
   		String unitPriceOfHardCopyPdf = productRequirementsPageLocators.hardCopyUnitPrice.getText();
   		System.out.println("unit price of pdf englihs is: "+unitPriceOfHardCopyPdf);
		return unitPriceOfHardCopyPdf;

   	}
   	
   	
    // Clicks on the add to cart button
   	public void clickOnAddToCartButton()
   	{
   		productRequirementsPageLocators.clickAddToCartButton.click();

   	}
   	
    // Clicks on Hard Copy button on pop up
   	public void clickOnHardCopyButton()
   	{
   		productRequirementsPageLocators.clickOnHardCopyButton.click();

   	}

    // Clicks on pdf format button on pop up
   	public void clickOnPdfFormatButton()
   	{
   		productRequirementsPageLocators.clickOnpdfFormatButton.click();

   	}
   	
    // Clicks on the add to cart button
   	public void clickOnContinueShoppingButton()
   	{
   		productRequirementsPageLocators.clickOnContinueShoppingButton.click();

   	}

    // Clicks on the view cart button
   	public void clickOnViewCartButton()
   	{
   		productRequirementsPageLocators.clickOnViewCartButton.click();

   	}
   	
    // Clicks on the checkbox 
   	public void clickOnCheckboxIAgreeRules()
   	{
   		productRequirementsPageLocators.clickOnAgreeRulesCheckbox.click();

   	}
   	
    // Clicks on the proceed to Checkout button 
   	public void clickOnProceedToCheckoutButton()
   	{
   		productRequirementsPageLocators.clickOnProceedToCheckoutButton.click();

   	}
   	
    // Clicks on Continue as Guest user link
   	public void clickOnContinueAsGuestUserLink()
   	{
   		productRequirementsPageLocators.continueAsGuestUserLIink.click();

   	}

}
