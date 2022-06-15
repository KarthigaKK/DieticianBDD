@tag
Feature: Option 2 to confirm Health Conditionson Create Plan page

 @tag1
  Scenario: Validating option2 menu visibility
    Given User is logged on to Dietician website "https://DieticianWebsite.com"
    When User lands on "Confirm conditions and Create Plan" page
    Then User should see option2 menu to update the health conditions
    
 @tag1
  Scenario: Validating visibility of Confirm button on option2 menu 
    Given User is logged on to Dietician website "https://DieticianWebsite.com"
    When User lands on "Confirm conditions and Create Plan" page
    Then User should see a button with text "CONFIRM" in option2 menu
    
@tag1
  Scenario: Validating the option 2 menu interaction
    Given User is logged on to Dietician website "https://DieticianWebsite.com"
    When User lands on "Confirm conditions and Create Plan" page
    Then User can update the health conditions in option2 menu
    
 @tag1
  Scenario: Validating that the option 2 menu cannot be modified after confirming
    Given User is on "Confirm conditions and Create Plan" page
    When User clicks the CONFIRM button in option2
    Then User cannot update the health conditions in option2 menu        
       

