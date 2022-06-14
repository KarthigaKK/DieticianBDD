Feature: Log in with email on Sign In Form

  Scenario: Validating the heading on Log in with your email form
    Given User is on Dietician website "https://DieticianWebsite.com"
    When User lands on Sign In page "User Sign In"
    Then User redirected to form with heading "Log in with your email"

  Scenario: Validating Login button on Log in with your email form
    Given User is on Dietician website "https://DieticianWebsite.com"
    When User lands on Sign In page "User Sign in"
    Then User should see a button with text "Log in" in the Sign In form
    
  Scenario: Validating Sign In with Email and password empty
    Given User is on Sign In Page "User Sign in"
    When User clicks Log In button with all fields empty
    Then User gets error message "Please fill out fields in textbox"
    
  Scenario: Validating Sign In with invalid email and valid password
    Given User is on Sign In Page "User Sign in"
    When User clicks Log In button with invalid email and valid password
    Then User should see message "Please fill with valid email id"
   
  Scenario: Validating Sign In with valid email and invalid password
    Given User is on Sign In Page "User Sign in"
    When User clicks Log In button with valid email and invalid password
    Then User gets a message "Invalid Password.Pleasetry again"
    
   Scenario: Validating Sign In with valid email and empty password field
    Given User is on Sign In Page "User Sign in"
    When User clicks Log In button with valid email and empty password
    Then User gets a message "Please fill the password"
  
   Scenario: Validating Sign In with both invalid email and password
    Given User is on Sign In Page "User Sign in"
    When User clicks Log In with both invalid email and password
    Then User gets a message "Invalid Login credentials"
    
   Scenario: Validating Sign In with both valid email and password
    Given User is on Sign In Page "User Sign in"
    When User clicks Log In with both valid email and password
    Then User gets a message "logged in successfully" 
    
  Scenario: Validating Sign In with Forgot your password link
    Given User is on Sign In Page "Sign In"
    When User clicks on Forgot Password link
    Then User should be directed to "Reset password" page
    
  Scenario: Validating Sign In with Facebook button
    Given User is on Sign In Page "Sign In"
    When User clicks "Facebook" button to log in
    Then User is redirected to Facebook login Page
    
   Scenario: Validating Sign In with Google button
    Given User is on Sign In Page "Sign In"
    When User clicks "Google" button to log in
    Then User is redirected to Google logIn page
   
   Scenario: Validating Sign In with SignUp button
    Given User is on Sign In Page "Sign In"
    When User clicks sign up link
    Then User is redirected to Register Page