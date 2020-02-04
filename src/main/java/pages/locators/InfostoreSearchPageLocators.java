package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InfostoreSearchPageLocators {
	/**
	 *  Add all locators for the infostore page
	 */
	// serach textbox bar
	@FindBy(how=How.ID,using="globalSearch")
	public WebElement searchTexboxBar;
	
	// Go button 
	@FindBy(how=How.ID,using="btnSearch")
	public WebElement goButton;
	
	// Standards Radio button 
	@FindBy(how=How.XPATH,using="//input[@value='STANDARD' and @id='radio2']")
	public WebElement standardsRadioBtn;
	
	// Standards Radio button 
	@FindBy(how=How.XPATH,using="//input[@value='ALL' and @id='radio1']")
	public WebElement allContentRadioBtn;
	
	@FindBy(how=How.XPATH,using="//a[@class='dropdown-toggle']//span[contains(text(),'Standards')]")
	public WebElement standardsMenuLink;

}
