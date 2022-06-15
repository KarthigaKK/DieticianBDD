@tag
Feature: Generate Menu Button on Create Plan page

@tag1
  Scenario: Validating the Generate Menu button visibility
    Given User is logged on to Dietician website "https://DieticianWebsite.com"
    When User lands on "Confirm conditions and Create Plan" page
    Then User should see a button with text "GENERATE MENU"  at the bottom of the page

    
    @tag1
  Scenario: Validating the Generate Menu button operation
    Given User is on "Confirm conditions and Create Plan" page
    When User clicks the GENERATE MENU button
    Then New Diet plan should be generated with the latest confirmed Health conditions
    
    
    @tag1
  Scenario: Validating the Generate Menu button operation
    Given User is on "Confirm conditions and Create Plan" page
    When User clicks the GENERATE MENU button
    Then User should land on "View Recent Diets" page