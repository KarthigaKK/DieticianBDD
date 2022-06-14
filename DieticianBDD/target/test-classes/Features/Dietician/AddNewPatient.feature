Feature: Add New Patient Page

	Scenario: Add New Patient Details
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User wants to enter New Patient details
		Then Patient Data From is visible
		
	Scenario: Empty Form submission For Add New Patient Details
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User attempts to submit the form without filling up mandatory fields from sheetname "EmptyData"
		Then Unable to update and display "Please fillup all the mandatory fields" error message

	Scenario: Full Name Field Numeric Value Validation
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
	  When User attempts to put numeric value in Full Name field from sheetname "FullNameInt"
		Then Unable to enter and show "Only characters are allowed" error message		

	Scenario: Full Name Field Space Validation
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User does not put space in between  First Name and Last Name for Full Name field from sheetname "FullNameNoSpace"
		Then Unable to enter and show "First and Last Name should have space in between" error message
		
	Scenario: Full Name Field Empty Value Validation
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User attempts to submit the form without filling up Full Name field from sheetname "FullNameEmpty"
		Then Unable to enter and show "Please enter Full Name" error message
		
	Scenario: Addess line 1 Field Empty Value Validation
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User does not enter any value in Addess linel field from sheetname "AddessLineEmpty"
		Then Unable to enter and show "Please enter Addess line 1" error message
		
	Scenario: Country Field Empty Value Validation
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User submit the form without selecting any value for Country field from sheetname "CountryEmpty"
		Then Unable to enter and show "Please select Country from dropdown" error message
		
	Scenario: City Field Numeric Value Validation
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User attempts to put numeric value in City field from sheetname "Cityint"
		Then Unable to enter and show "Only characters are allowed" error message
		
	Scenario: City Field Empty Value Validation
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User attempts to submit the form without filling up City field from sheetname "CityEmpty"
		Then Unable to enter and show "Please enter City" error message
		
	Scenario: State, province or region Field Numeric Value Validation
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User attempts to put numeric value in State, province or region field from sheetname "StateInt"
		Then Unable to enter and show "Only characters are allowed" error message
		
	Scenario: State, province or region Field Empty Value Validation
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User attempts to submit the form without filling up State, province or region field from sheetname "StateEmpty"
		Then Unable to enter and show "Please enter State, province or region" error message
		
	Scenario: Postal code Field Empty Value Validation
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User attempts to submit the form without filling up Postal code field from sheetname "PostalCodeEmpty"
		Then Unable to enter and show "Please enter Postal code" error message
		
	Scenario: Postal code Field Wrong Data Fomat Validation
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User entered not supported data format in Postal code field from sheetname "PostalCodeInvalid"
		Then Unable to enter and show "Invalid Postal code format" error message
		
	Scenario: Email Field Empty Value Validation
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User does not enter any value in Email field from sheetname "EmailFieldEmpty"
		Then Unable to enter and show "Please enter Email" error message
		
	Scenario: Email Field Wrong Data Fomat Validation
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User entered not supported data format in Email field from sheetname "EmailFieldWrongFormat"
		Then Unable to enter and show "Invalid email format" error message
		
	Scenario: Phone number Field Character Value Validation
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User attempts to put characters in Phone number field from sheetname "PhoneNoInvalid"
		Then Unable to enter and show "Only Numeric values are allowed" error message
		
	Scenario: Phone number Field Empty Value Validation
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User attempts to submit the form without filling up Phone number field from sheetname "PhoneNoEmpty"
		Then Unable to enter and show "Please enter Phone number" error message
		
	Scenario: Inserting Valid New Patient data submission
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User fills up the form with Valid Data Inputs from sheetname "ValidData"
		Then User can see "Update" button
		
	Scenario: Valid New Patient data submission
		Given User is on the Add New Patient Page "https://DieticianWebsite.com/Add New Patient"
		When User clicks on the Add New Patient button after entering valid Patient data "ValidData"
		Then User lands on My Patients page with the "New Patient" details displayed
		