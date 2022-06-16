@tag
Feature: Register Page Title

  Scenario: Validating the title of Register Page
    Given User is in Dietician website "https://DieticianWebsite.com"
    When User lands on Register page
    Then User should see the title of the page as "Register"
