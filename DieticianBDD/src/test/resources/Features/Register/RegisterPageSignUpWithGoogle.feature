Feature: Sign Up Using Google button

  Scenario: Validating the Sign up process with Google.
    Given User is on Register page
    When  User clicks Google Button in the Sign Up with your Email form.
    Then User successfully login with Google account.

