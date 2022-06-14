Feature: Sign In Form with Username

  Scenario: Validating the Sign In form heading
    Given User is on Dietician website "https://DieticianWebsite.com"
    When User lands on Sign In page "User Sign In"
    Then User should see a form with heading "SIgn In"

  Scenario: Validating Sign In button
    Given User is on Dietician website "https://DieticianWebsite.com"
    When User lands on Sign In page "User Sign In"
    Then User should see a button with text "SIGN IN"

  Scenario: Validating Sign In Process with all fields empty
    Given User is on Sign In Page "Sign In"
    When User clicks Sign In button in the Sign In form with all fields empty.
    Then User should get error message "Username and Password is invalid"

  Scenario: Validating Sign InProcess with invalid FirstName
    Given User is on Sign In Page "Sign In"
    When User clicks Sign In button entering numeric values for Username "1234" and valid values for password "SAWE!@R"
    Then User should get a message Invalid entry for first field "Username and Password is invalid"

  Scenario: Validating Sign In process with invalid password
    Given User is on Sign In Page "Sign In"
    When User clicks Sign In button entering extra length of password "12345678901234567890"
    Then User should get a message Invalid entry for password field "Username and Password is invalid"

  Scenario: Validating Sign In with both invalid username and password
    Given User is on Sign In Page "Sign In"
    When User clicks Sign In button entering invalid values for both fields "user001" and "password"
    Then User should get error message "Username and Password is invalid"

  Scenario: Validating Sign In with Forgot password button
    Given User is on Sign In Page "Sign In"
    When User clicks on Forgot Password link
    Then User should be directed to "Reset password" page

  Scenario: Validating Sign In with Not member Yet button
    Given User is on Sign In Page "Sign In"
    When User clicks on not member yet button
    Then User will land on Register Page

  Scenario: Validating Sign In with all fields valid entry
    Given User is on Sign In Page "Sign In"
    When User clicks Sign In with all field entered "validuser" and "validpassword" 
    Then User logged in successfully
