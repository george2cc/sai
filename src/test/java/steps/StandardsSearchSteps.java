package steps;

import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.InfostoreSearchPageActions;
import pages.actions.OrderSummaryCheckoutPageActions;
import pages.actions.PaymentMethodCheckoutPageActions;
import pages.actions.BillingDetailsCheckoutPageActions;
import pages.actions.DeliveryDetailsCheckoutPageActions;
import pages.actions.ProductRequirementsPageActions;
import pages.actions.ProductsSearchPageActions;
import pages.actions.StandardsHomepagesActions;

import utils.SeleniumDriver;

public class StandardsSearchSteps {

	StandardsHomepagesActions standardsHomepageLocatorsActions = new StandardsHomepagesActions();
	InfostoreSearchPageActions infostoreSearchPageActions = new InfostoreSearchPageActions();
	ProductsSearchPageActions productsSeacrchPageActions = new ProductsSearchPageActions();
	ProductRequirementsPageActions productRequirementsPageActions = new ProductRequirementsPageActions();
	BillingDetailsCheckoutPageActions billingDetailsCheckoutPageActions = new BillingDetailsCheckoutPageActions();
	DeliveryDetailsCheckoutPageActions delivereyDetailsCheckoutPageActions = new DeliveryDetailsCheckoutPageActions();
	OrderSummaryCheckoutPageActions orderSummaryCheckoutPageActions = new OrderSummaryCheckoutPageActions();
	PaymentMethodCheckoutPageActions paymentMethodCheckoutPageActions = new PaymentMethodCheckoutPageActions();

	@Given("^I am on the Home Page \"([^\"]*)\" of SAI Website$")
	public void i_am_on_the_Home_Page_of_SAI_Website(String websiteURL) throws Throwable {

		SeleniumDriver.openPage(websiteURL);
	}

	@When("^I move to Login Menu$")
	public void i_move_to_Login_Menu() throws Throwable {

		// click on the locator login button
		standardsHomepageLocatorsActions.moveToLoginButtonMenu();
	}

	@When("^click on Infostore link$")
	public void click_on_Infostore_link() throws Throwable {
		SeleniumDriver.waitForPageToLoad();
	
		standardsHomepageLocatorsActions.clickOnInfostoreMenu();
	}

	@When("^enter search term \"([^\"]*)\" in search bar$")
	public void enter_search_term_in_search_bar(String term) throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		// enter search term in textbox
		infostoreSearchPageActions.sendTextToTextbox(term);
	}

	@When("^I select Standards radio button$")
	public void i_select_Standards_radio_button() throws Throwable {

		infostoreSearchPageActions.clickOnStandardsRadioButton();
	}

	@When("^I click on Go button$")
	public void i_click_on_button() throws Throwable {

		infostoreSearchPageActions.clickOnGoButton();
	}

	@Then("^I should see list of searched results$")
	public void i_should_see_list_of_searched_results() throws Throwable {

		System.out.println("Products List Found");
	}

	@When("^I click ISO_NUMBER link$")
	public void i_click_ISO_NUMBER_link() throws Throwable {
		
		productsSeacrchPageActions.clickOnStandardsSummaryLink();
	}
	
	@When("^I Select \"([^\"]*)\" from PRODUCT FORMAT$")
	public void i_Select_from_PRODUCT_FORMAT(String pdfDropdown) throws Throwable {

		productRequirementsPageActions.selectProductFormatPdf(pdfDropdown);
	}

	@When("^I Add \"([^\"]*)\" from QUANTITY$")
	public void i_Add_from_QUANTITY(String quantity) throws Throwable {

		productRequirementsPageActions.selectProductQuantity(quantity);
	}

	// the HardCopy unit price is
	@And("^the HardCopy unit price is$")
	public void the_HardCopy_unit_price_is() throws Throwable {

		String ActualHardCopyPdfUnitPrice = productRequirementsPageActions.unitPriceOfHardCopyPdf();
	}

	// the Pdf English Drm unit price is
	@And("^the Pdf English unit price is$")
	public void the_Pdf_English_unit_price_is() throws Throwable {

		String ActualPdfEnglishUnitPrice = productRequirementsPageActions.unitPriceOfPdfEnglishDrm();
	}

	@Then("^I click on Add To Cart button$")
	public void i_click_on_Add_To_Cart_button() throws Throwable {

		productRequirementsPageActions.clickOnAddToCartButton();

	}

	@And("^I click on Hard Copy button on pop up$")
	public void i_click_on_Hard_Copy_button_on_pop_up() throws Throwable {

		productRequirementsPageActions.clickOnHardCopyButton();

	}

	@Then("^I click on Pdf Format button on pop up$")
	public void i_click_on_Pdf_Format_button_on_pop_up() throws Throwable {

		productRequirementsPageActions.clickOnPdfFormatButton();

	}

	@Then("^I click on Continue Shopping button$")
	public void i_click_on_Comtinue_Shopping_button() throws Throwable {

		productRequirementsPageActions.clickOnContinueShoppingButton();

	}

	// Then I click on View CART button
	@Then("^I click on View CART button")
	public void i_click_on_View_CART() throws Throwable {

		productRequirementsPageActions.clickOnViewCartButton();
	}

	@Then("^I click I agree to the document licence rules checkbox$")
	public void i_click_I_agree_to_the_document_licence_rules_checkbox() throws Throwable {

		productRequirementsPageActions.clickOnCheckboxIAgreeRules();
	}

	// user click on PPROCEED TO CHECKOUT button
	@Then("^I click on PPROCEED TO CHECKOUT button$")
	public void i_click_on_PPROCEED_TO_CHECKOUT_button() throws Throwable {

		productRequirementsPageActions.clickOnProceedToCheckoutButton();
	}

	// click CONTINUE AS A GUEST USER link
	@Then("^I click CONTINUE AS A GUEST USER link$")
	public void i_click_CONTINUE_AS_A_GUEST_USER_link() throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		productRequirementsPageActions.clickOnContinueAsGuestUserLink();
	}

	// select the title as "Mr"
	@Then("^I select the title as \"([^\"]*)\"$")
	public void i_select_the_title_as(String userTitle) throws Throwable {

		billingDetailsCheckoutPageActions.selectUserTitle(userTitle);
	}

	// enter the First Name "George"
	@Then("^I enter the First Name \"([^\"]*)\"$")
	public void i_enter_the_First_Name(String firstName) throws Throwable {

		billingDetailsCheckoutPageActions.enterUserFirstName(firstName);
	}

	// enter the Last Name "Manfred"
	@Then("^I enter the Last Name as \"([^\"]*)\"$")
	public void i_enter_the_Last_Name_as(String lastName) throws Throwable {

		billingDetailsCheckoutPageActions.enterUserLastName(lastName);
	}

	// enter the Phone Number as 10 digits
	@Then("^I enter the Phone Number as \"([^\"]*)\"$")
	public void i_enter_the_Phone_Number(String homePhone) throws Throwable {

		billingDetailsCheckoutPageActions.enterUserPhoneNumber(homePhone);
	}

	@Then("^I enter the Email Address as \"([^\"]*)\"$")
	public void i_enter_the_Email_Address_as(String emailAddress) throws Throwable {

		billingDetailsCheckoutPageActions.enterUserEmailAddress(emailAddress);
	}

	@Then("^I enter the Address line1 as \"([^\"]*)\"$")
	public void i_enter_the_Address_line1_as(String billAddress1) throws Throwable {

		billingDetailsCheckoutPageActions.enterUserEmailAddress(billAddress1);
	}

	@Then("^I select the Country as \"([^\"]*)\"$")
	public void i_select_the_Country_as(String country) throws Throwable {

		billingDetailsCheckoutPageActions.enterUserEmailAddress(country);
	}

	@Then("^I enter the Suburb as \"([^\"]*)\"$")
	public void i_enter_the_Suburb_as(String suburb) throws Throwable {

		billingDetailsCheckoutPageActions.enterUserSuburb(suburb);
	}

	@Then("^I select the State as \"([^\"]*)\"$")
	public void i_select_the_State_as(String state) throws Throwable {

		billingDetailsCheckoutPageActions.enterUserEmailAddress(state);
	}

	@And("^I enter the Postal Code as \"([^\"]*)\"$")
	public void i_enter_the_Postal_Code_as(String postalCode) throws Throwable {

		billingDetailsCheckoutPageActions.enterUserSuburb(postalCode);
	}

	@And("^I click on Continue To Delivery Details button$")
	public void i_click_on_Continue_To_Delivery_Details_button() throws Throwable {

		billingDetailsCheckoutPageActions.clickOnDeliveryDetailsButton();
	}

	@And("^I click Use my Billing Details for Shipping checkbox$")
	public void i_click_Use_my_Billing_Details_for_Shipping_checkbox() throws Throwable {

		delivereyDetailsCheckoutPageActions.clickOnDeliveryDetailsForShipping();
	}

	@And("^I click on Continue To Order Summary button$")
	public void i_click_on_Continue_To_Order_Summary_button() throws Throwable {

		delivereyDetailsCheckoutPageActions.clickOnContinueToOrderSummary();
	}

	@And("^I verify Hardcopy product price is the same in the product page$")
	public void i_verify_Hardcopy_product_price_is_the_same_in_the_product_page() throws Throwable {

		String ExpectedHardCopyPdfUnitPrice = "";
		String ActualHardCopyPdfUnitPrice = productRequirementsPageActions.unitPriceOfHardCopyPdf();
		Assert.assertEquals(ExpectedHardCopyPdfUnitPrice, ActualHardCopyPdfUnitPrice);
	}

	@Then("^I verify PDF product price are the same in the product page$")
	public void i_verify_PDF_product_price_are_the_same_in_the_product_page() throws Throwable {

		String ExpectedPdfEnlishUnitPrice = "";
		String ActualHardPdfEnglishUnitPrice = productRequirementsPageActions.unitPriceOfPdfEnglishDrm();
		Assert.assertEquals(ExpectedPdfEnlishUnitPrice, ActualHardPdfEnglishUnitPrice);
	}

	@And("^I verify Products Subtotal sum is correct$")
	public void i_click_on_Continue_button(String arg1) throws Throwable {

	}

	@And("^I click on Continue Payment Method button$")
	public void i_click_on_Continue_Payment_Method_button() throws Throwable {

		orderSummaryCheckoutPageActions.clickOnContinuePaymentSummaryButton();
	}

	@And("^I click on Pay by VISA_MasterCard Radio button$")
	public void i_click_on_Pay_by_VISA_MasterCard_Radio_button() throws Throwable {

		paymentMethodCheckoutPageActions.clickOnPayByVisaMasterCardRadioButton();

	}

	@And("^I select \"([^\"]*)\" from Purchase Order Number$")
	public void i_select_from_Purchase_Order_Number(String purchaseOrderNo) throws Throwable {

		paymentMethodCheckoutPageActions.selectPurchaseOrderNo(purchaseOrderNo);
	}

	@And("^I click on Continue To Payment button$")
	public void i_click_on_Continue_To_Payment_button() throws Throwable {

		paymentMethodCheckoutPageActions.clickOnContinueToPaymentButton();
	}

	@And("^I should see the PAYMENT DETAILS page$")
	public void i_should_see_the_PAYMENT_DETAILS_page(String arg1) throws Throwable {

	}

	@Then("^I enter payment details$")
	public void i_enter_payment_details() throws Throwable {

	}

}
