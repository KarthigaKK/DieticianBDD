Feature: List of Screens under Public

  Scenario: Validating the Public section on list of screens
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see the links to public pages under the sub menu with text "Public"

  Scenario: Validating the text of User Sign In link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a link with text "User Sign In" under the section Public

  Scenario: Validating the functionality of User Sign In link
    Given User is on Home page
    When User selects the link "User Sign in" from the Screens menu
    Then User is re-directed to Sign In page

  Scenario: Validating the text of Register link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a link with text "Register" under the section Public

  Scenario: Validating the functionality of Register link
    Given User is on Sign In page
    When User selects the link "Register" from the Screens menu
    Then User is re-directed to Register page

  Scenario: Validating the text of Team link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a link with text "Team" under the section Public

  Scenario: Validating the functionality of Team link
    Given User is on Register page
    When User selects the link "Team" from the Screens menu
    Then User is re-directed to Team page

  Scenario: Validating the text of Testimonials link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a link with text "Testimonials" under the section Public

  Scenario: Validating the functionality of Testimonials link
    Given User is on Team page
    When User selects the link "Testimonials" from the Screens menu
    Then User is re-directed to Testimonials page

  Scenario: Validating the text of Forgot password link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a link with text "Forgot Password" under the section Public

  Scenario: Validating the functionality of Forgot password link
    Given User is on Testimonials page
    When User selects the link "Forgot Password" from the Screens menu
    Then User is re-directed to Forgot Password page

  Scenario: Validating the text of Product Features link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a link with text "Product Features" under the section Public

  Scenario: Validating the functionality of Product Features link
    Given User is on Forgot Password page
    When User selects the link "Product Features" from the Screens menu
    Then User is re-directed to Product Features page

  Scenario: Validating the text of Contact link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a link with text "Contact" under the section Public

  Scenario: Validating the functionality  of Contact link
    Given User is on Product Feature page
    When User selects the link "Contact" from the Screens menu
    Then User is re-directed to Contact page

  Scenario: Validating the text  of Blogs link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a link with text "Blogs" under the section Public

  Scenario: Validating the functionality  of Blogs link
    Given User is on Contact page
    When User selects the link "Blogs" from the Screens menu
    Then User is re-directed to Blogs page

  Scenario: Validating the text of  Featured Content link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a link with text "Featured Content" under the section Public

  Scenario: Validating the functionality  of Featured Content link
    Given User is on Blogs page
    When User selects the link "Featured Content" from the Screens menu
    Then User is re-directed to Featured Content page

  Scenario: Validating the text  of Home link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a link with text "Home" under the section Public

  Scenario: Validating the  functionality of Home link
    Given User is on Featured Content page
    When User selects the link "Home" from the Screens menu
    Then User is re-directed to Home page
