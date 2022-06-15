@tag
Feature: Option 1 to confirm Health Conditionson Create Plan page

@tag1
  Scenario: Validating option1 menu visibility
    Given User is logged on to Dietician website "https://DieticianWebsite.com"
    When User lands on "Confirm conditions and Create Plan" page
    Then User should see option1 menu to update the health conditions
    
 @tag1
  Scenario: Validating visibility of Confirm button on option 1 menu 
    Given User is logged on to Dietician website "https://DieticianWebsite.com"
    When User lands on "Confirm conditions and Create Plan" page
    Then User should see a button with text " CONFIRM" in option1 menu
    
    
     @tag1
  Scenario: Validating the option1 menu interaction
    Given User is logged on to Dietician website "https://DieticianWebsite.com"
    When User lands on "Confirm conditions and Create Plan" page
    Then User can update the health conditions in option1 menu
    
    
     @tag1
  Scenario: Validating that the option1 menu cannot be modified after confirming
    Given User is on "Create Plan" page
    When User clicks the CONFIRM button in option1 menu
    Then User cannot update the health conditions in option1 menu 
