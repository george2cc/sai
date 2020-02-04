package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductRequirementsPageLocators {

	/**
	 * Add all locators for the infostore page
	 */
	// locator for product format from dropdown selection
	@FindBy(how = How.XPATH, using = "//ul[@class='chosen-results']//li[1]")
	public WebElement selectProductFormat;

	// locator for product quantity from dropdown selection
	@FindBy(how = How.XPATH, using = "//ul[@class='chosen-results']//li[1]")
	public WebElement selectProductQuantity;

	// locator for pdf english drm
	@FindBy(how = How.XPATH, using = "//*[@id='pdtPrice'][contains(text(), '$219.43')]")
	public WebElement pdfEnglishUnitPrice;

	// locator for Hard Copy
	@FindBy(how = How.XPATH, using = "//*[@id='pdtPrice'][contains(text(), '$243.80')]")
	public WebElement hardCopyUnitPrice;

	// locator for add to card button
	@FindBy(how = How.XPATH, using = "//a[@id='addCartConfirm']")
	public WebElement clickAddToCartButton;

	// locator for Continue shopping button
	@FindBy(how = How.XPATH, using = "//a[@id='continueShopping']")
	public WebElement clickOnContinueShoppingButton;

	// locator for View Cart button
	@FindBy(how = How.XPATH, using = "//input[@id='viewcart']']")
	public WebElement clickOnViewCartButton;

	// locator for checkbox
	@FindBy(how = How.XPATH, using = "//input[@id='agreeRules']")
	public WebElement clickOnAgreeRulesCheckbox;

	// locator for Proceed to Checkout button
	@FindBy(how = How.XPATH, using = "//a[@id='btnCheckOut']")
	public WebElement clickOnProceedToCheckoutButton;

	// locator for continue as a Guest link
	@FindBy(how = How.LINK_TEXT, using = "Continue as a Guest User")
	public WebElement continueAsGuestUserLIink;

	// locator for pdf format button
	@FindBy(how = How.XPATH, using = "// *[@id='btnConfirmOk'][@value='PDF Format']")
	public WebElement clickOnpdfFormatButton;
	
	// locator for Hard copy pdf format button
	@FindBy(how = How.XPATH, using = "//*[@id='btnConfirmCancel'][@value='Hardcopy Format']")
	public WebElement clickOnHardCopyButton;

	
}
