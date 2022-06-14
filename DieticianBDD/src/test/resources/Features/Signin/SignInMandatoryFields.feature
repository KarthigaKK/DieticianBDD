Feature: Sign In page mandatory fields

  Scenario: Validating the Sign In page mandatory fields
   Given User is on Dietician website "https://DieticianWebsite.com"
    When User is on Sign In Page "Sign In"
    Then User should see all mandatory flields with star symbol on top of those fields
