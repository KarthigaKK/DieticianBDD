@tag
Feature: Heading for Diet Plans page

  @tag1
  Scenario: Validating the heading of theDiet plans page
    Given User is logged on to Dietician website "https://DieticianWebsite.com"
    When User lands on "View Recent Diets" diet page
    Then User should see the heading "Generated Diet Plans" on the page
 
