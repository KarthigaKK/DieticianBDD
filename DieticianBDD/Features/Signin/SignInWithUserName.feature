Feature: Sign In Form with Username

  Scenario: Validating the Sign In form heading
    Given User is on Dietician website
    When User lands on Sign In page
    Then User should see a form with heading "User Sign In"

  Scenario: Validating Sign In button
    Given User is on Dietician website
    When User lands on Sign In page
    Then User should see a button with text "SIGN IN"

  Scenario: Validating Sign In Process with all fields empty
    Given User is on Sign In Page
    When User clicks Sign In button in the Sign In form with all fields empty.
    Then User should get error message "Please fill out the fields"

  Scenario: Validating Sign InProcess with invalid FirstName
    Given User is on Sign In Page
    When User clicks Sign In button entering numeric values for Username and valid values for password
    Then User should get a message Invalid entry for first field

  Scenario: Validating Sign In process with invalid password
    Given User is on Sign In Page
    When User clicks Sign In button entering extra length of password
    Then User should get a message Invalid entry for password field

  Scenario: Validating Sign In with both invalid username and password
    Given User is on Sign In Page
    When User clicks Sign In button entering invalid values for both fields
    Then User should get error message "Invalid login credentials"

  Scenario: Validating Sign In with "Forgot password" button
    Given User is on Sign In Page
    When User clicks on Forgot Password button
    Then User should be directed to "Reset password" link

  Scenario: Validating Sign In with Not member Yet button
    Given User is on Sign In Page
    When User clicks on "not member yet "button
    Then User will land on Register Page

  Scenario: Validating Sign In with all fields valid entry
    Given User is on Sign In Page
    When User clicks Sign In with all field entered
    Then User logged in successfully
