package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StandardsHomepageLocators {
	/**
	 *  Add all locators for the standards page
	 */
	
	@FindBy(how=How.XPATH,using="//div[@class='desktop-login']")
	public WebElement loginButtonLink;
	
	//@FindBy(how=How.XPATH,using="//div[@class='desktop-login']//a[contains(text(),'Infostore')]")
	//public WebElement infostoreMenuLink;
	
	private final String menuLink="Infostore";
	@FindBy (how=How.XPATH, using = "//div[@class='desktop-login'] and contains(text()," +"\""+ menuLink + "\""+")]")
	private WebElement infostoreMenuLink;
	

}
