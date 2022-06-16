
Feature: List of Screens menu visibility

  Scenario: Validating the visibility of List of screens link on Home page
    Given User on the browser
    When User opens the Dietician website
    Then User should see a link with 3 horizontal lines on the top right corner of the Home page

  Scenario: Validating the functionality of List of screens link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a menu with list of clickable links is displayed
    
  
  Scenario: Validating the name of List of screens menu
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see name on the list of screens as "Screens"
    
