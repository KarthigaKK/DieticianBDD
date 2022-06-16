
Feature: Log In here link

  Scenario: Validating Log In Here link 
    Given User is on Register page 
    When User clicks "Log in here" link.
    Then User is re-directed to Sign In Page
