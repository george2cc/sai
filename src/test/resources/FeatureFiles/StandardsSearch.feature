Feature: Acceptance testing to validate Standards payments Page is working. 
	In order to validate that 
  the SAI home site working
  To do the Acceptance Testing

@Standards 
Scenario: Validate Standards End to End Page 
	Given I am on the Home Page "https://www.saiglobal.com/en-au/standards/" of SAI Website 
	When I move to Login Menu 
	And click on Infostore link 
	And enter search term "ISO 9001" in search bar 
	And I select Standards radio button 
	And I click on Go button 
	Then I should see list of searched results 
	When I click ISO_NUMBER link 
	And I Select "HardCopy-English" from PRODUCT FORMAT 
	And I Add "02" from QUANTITY 
	And the HardCopy unit price is
	Then I click on Add To Cart button 
	And I click on Hard Copy button on pop up 
	Then I click on Continue Shopping button 
	And I Add "PDF - English - DRM" from PRODUCT FORMAT 
	And I Add "01" from QUANTITY 
	And the Pdf English unit price is
	Then I click on Add To Cart button 
	And I click on Pdf Format button on pop up 
	Then I click on View CART button 
	And I click I agree to the document licence rules checkbox 
	And I click on PPROCEED TO CHECKOUT button 
	And I click CONTINUE AS A GUEST USER link 
	Then I select the title as "Mr" 
	And I enter the First Name "George" 
	And I enter the Last Name as "Manfred" 
	And I enter the Phone Number as "0298989293" 
	And I enter the Address line1 as "123 Smith st" 
	Then I select the Country as "Australia" 
	And I enter the Suburb as "Bankstown" 
	Then I select the State as "NSW" 
	And I enter the Postal Code as "2144" 
	And I click on Continue To Delivery Details button
	And I click Use my Billing Details for Shipping checkbox
	And I click on Continue To Order Summary button
	And I verify Hardcopy product price is the same in the product page
	And I verify PDF product price are the same in the product page
	And I verify Products Subtotal sum is correct 
	Then I click on Continue Payment Method button 
	And I click on Pay by VISA_MasterCard Radio button
	And I select "TEST" from Purchase Order Number 
	And I click on Continue To Payment button 
	Then I should see the PAYMENT DETAILS page 
	And I enter payment details 
