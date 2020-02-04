package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import pages.locators.InfostoreSearchPageLocators;
import pages.locators.StandardsHomepageLocators;
import utils.SeleniumDriver;

public class InfostoreSearchPageActions {
	
	InfostoreSearchPageLocators infostoreSearchPageLocators=null;
    public InfostoreSearchPageActions()
    {
        
        this.infostoreSearchPageLocators=new InfostoreSearchPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), infostoreSearchPageLocators);
    }
    
	// enters text in textbox
	public void sendTextToTextbox(String sendText)
	{
		infostoreSearchPageLocators.searchTexboxBar.sendKeys(sendText);
		
	}
	
    // Clicks on a Standards Radio button
	public void clickOnStandardsRadioButton()
	{
		infostoreSearchPageLocators.standardsRadioBtn.click();
		
	}

	
    // Clicks on go button
	public void clickOnGoButton()
	{
		
		infostoreSearchPageLocators.goButton.click();
		
	}

}
