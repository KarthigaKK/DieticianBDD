@tag
Feature: Menu Bar on Diets Plans page

  @tag1
  Scenario: Validating the tabs on the menu bar of Diets page
   Given User is logged on to Dietician website "https://DieticianWebsite.com"
    When User lands on "View Recent Diets" diet page
    Then User should see that Diet Plans tab on the menu bar is visible
