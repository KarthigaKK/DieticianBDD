@tag
Feature: Heading for Create plan page 

@tag1
  Scenario: Validating the heading
    Given User is logged on to Dietician website "https://DieticianWebsite.com"
    When User lands on "Confirm conditions and Create Plan" page
    Then User sees the heading "Confirm Health Conditions and Generate a new Diet Plan" on the page
