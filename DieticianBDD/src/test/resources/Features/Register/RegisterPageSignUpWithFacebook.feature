Feature: Sign Up Using Facebook button 

  Scenario: Validating the Sign up process with Facebook
    Given User is on Register page
    When  User clicks Facebook Button in the Sign Up with your Email form.
    Then User successfully login with Facebook account.
