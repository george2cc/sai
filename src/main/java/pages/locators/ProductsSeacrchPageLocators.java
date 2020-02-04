package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductsSeacrchPageLocators {
	
	@FindBy(how=How.XPATH,using="//a[@href='/en-au/Standards/ISO-9001-2015-586896_SAIG_ISO_ISO_1344248/']")
	public WebElement isoStandard2915;
	

}
