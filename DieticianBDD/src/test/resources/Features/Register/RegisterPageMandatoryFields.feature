Feature: Register page mandatory fields

  Scenario: Validating the Register page mandatory fields
    Given User is on Dietician website "https://DieticianWebsite.com"
    	When User is on Register Page "Register"
    		Then User should see all mandatory flields for Register Page with star symbol on top of those fields