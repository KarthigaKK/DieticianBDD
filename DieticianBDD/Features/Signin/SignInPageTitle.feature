Feature: Sign In Page Title

  Scenario: Validating the title of Sign In Page
    Given User is on Dietician website "https://DieticianWebsite.com"
    When User click on icon symbol on Sign In Page
    Then User should see the title of the page as "User Sign In"
