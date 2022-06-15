@tag
Feature: View PDF on Diets Plans page

  @tag1
  Scenario: Validation of "View PDF" option
   Given User is logged on to Dietician website "https://DieticianWebsite.com"
    When User lands on "View Recent Diets" diet page
    Then View PDF option is available for the generated diet plans

    @tag1
  Scenario: Validation of "View PDF" option
   Given User is logged on to Dietician website "https://DieticianWebsite.com"
    When User lands on "View Recent Diets" diet page
    Then View record number, planID, customer details,plangenerated time, comments available for the generated diet plans
    

    