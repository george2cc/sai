package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.ProductsSeacrchPageLocators;
import pages.locators.StandardsHomepageLocators;
import utils.SeleniumDriver;

public class ProductsSearchPageActions {
	
	ProductsSeacrchPageLocators productsSearchPageLocators=null;
    public ProductsSearchPageActions()
    {
        
        this.productsSearchPageLocators=new ProductsSeacrchPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), productsSearchPageLocators);
    }

    /**
     *  Add actions to be performed on this page
     *  
     */
    
    // Clicks on a Standards Radio button
   	public void clickOnStandardsSummaryLink()
   	{
   		productsSearchPageLocators.isoStandard2915.click();
   		
   	}
    
}
