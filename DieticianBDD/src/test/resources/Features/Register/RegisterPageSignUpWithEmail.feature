Feature: Sign Up form heading
  Scenario: Validating the Sign Up form heading
    Given User is on Dietician website "https://DieticianWebsite.com"
    When User lands on Register page
    Then User should see a form with heading "Sign Up with your email", to sign up using Email Id.

  Scenario: Validating the Sign Up button for the option "Sign up using Email Id" on  Register page.
    Given User is on Dietician website "https://DieticianWebsite.com"
    When User lands on Register page
    Then User should see a button with text "Sign Up" in the Sign Up with your Email form.

	Scenario: Validating the Sign up process with all fields being empty
		Given User is on Register page
		When User clicks SIGN UP Button in the Sign Up with your Email form with all fields empty .
		Then User should see a message "Mandatory fields cannot be empty"

	Scenario: Validating the Sign up process with invalid Name
		Given User is on Register page
    When User clicks SIGN UP Button in the Sign Up with your Email form  by entering numeric text for First Name, valid values for the remaining fields . 
    Then User should see a message "Invalid data entered for First Name"
    
  Scenario: Validating the Sign up process with invalid Last Name
  	Given User is on Register page
    When User clicks SIGN UP Button in the Sign Up form with your Email by entering numeric text for Last Name, valid values for the remaining fields  
    Then User should see a message "Invalid data entered for Last Name"
    
  Scenario: Validating the Sign up process with invalid UserName
  	Given User is on Register page
    When User clicks SIGN UP Button in the Sign Up form with your Email by entering numeric text for Username, valid values for the remaining fields
    Then User should see a message "Invalid data entered for Username".
    
  Scenario: Validating the Sign up process with invalid Email
  	Given User is on Register page
    When User clicks SIGN UP Button in the Sign Up form with your Email by entering invalid email Id for Email Address, valid values for the remaining fields. 
    Then User should see a message "Invalid data entered for "Email Address".
    
	Scenario: Validating the Sign up process with invalid Password
		Given User is on Register page
    When User clicks SIGN UP Button in the Sign Up form with your Email by entering invalid Password, valid values for the remaining fields.
    Then User should see a message "Invalid Password"
    
  Scenario: Validating the Sign up process with invalid Confirm Password
  	Given User is on Register page 
    When User clicks SIGN UP Button in the Sign Up form with your Email by entering a value that is different than the Password field value, valid values for the remaining fields.
    Then User should see a message "Confirm Password should same as Password".
    
    
  Scenario: Validating the Sign up process with all valid input field.
  	Given User is on Register page
    When User clicks SIGN UP Button in the Sign Up with your Email form  by entering valid values for the all fields.
    Then User is re-directed to Sign In page.
	    
    
  
  	
    