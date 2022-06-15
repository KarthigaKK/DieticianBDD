#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@MenubarOptionsLogo
Feature: Menu bar options and Logo on the Home Page



  Scenario: Validating the logo on the Home page
    Given User is on the browser
    When User opens the Dietician Website "https://DieticianWebsite.com"
    Then User should see a logo image with the company name on the Home Page "Company Name"


  Scenario: Validating the tab "PRODUCT" visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website "https://DieticianWebsite.com"
    Then User should see a tab with text "PRODUCT" on the top menu bar of the Home page

Scenario: Validating the tab "CLIENTS" visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website "https://DieticianWebsite.com"
    Then User should see a tab with text "CLIENTS" on the top menu bar of the Home page
    
    Scenario: Validating the tab "TEAM" visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website "https://DieticianWebsite.com"
    Then User should see a tab with text "TEAM" on the top menu bar of the Home page
    
    Scenario: Validating the tab "REGISTER" visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website "https://DieticianWebsite.com"
    Then User should see a tab with text "REGISTER" on the top menu bar of the Home page
    
    Scenario: Validating the tab "ABOUT" visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website "https://DieticianWebsite.com"
    Then User should see a tab with text "ABOUT" on the top menu bar of the Home page
    
    Scenario: Validating the tab "FEATURED" visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website "https://DieticianWebsite.com"
    Then User should see a tab with text "FEATURED" on the top menu bar of the Home page
    
    Scenario: Validating the tab "BLOG" visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website "https://DieticianWebsite.com"
    Then User should see a tab with text "BLOG" on the top menu bar of the Home page
    
    Scenario: Validating the tab "CONTACT US" visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website "https://DieticianWebsite.com"
    Then User should see a tab with text "CONTACT US" on the top menu bar of the Home page
    
    Scenario: Validating the tab Search Option on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website "https://DieticianWebsite.com"
    Then User should see a search option symbol on the bottom menu bar of the Home page
    
    Scenario: Validating the visibility of Signin option on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website "https://DieticianWebsite.com"
    Then User should see a Signin option next to the search button on the bottom menu bar of the Home page
  
