@tag
Feature: Browse button on Create Plan page

@tag1
  Scenario: Validating the Browse button visibility
    Given User is logged on to Dietician website "https://DieticianWebsite.com"
    When User lands on "Confirm conditions and Create Plan" page
    Then User should see a button with name browse "Browse" on the page
    

  @tag1
  Scenario: Validating the Browse button tool tip option
    Given User is logged on to Dietician website "https://DieticianWebsite.com"
    When User lands on "Confirm conditions and Create Plan" page
    Then User should see a tool tip "PDF files only" for the Browse button
    
    
 
  @tag1
  Scenario: Validating the Browse button operation
    Given User is on "Confirm conditions and Create Plan" page
    When User clicks the Browse button and selects a document
    Then User should see the selected document in the field next to the Browse button on the page
    