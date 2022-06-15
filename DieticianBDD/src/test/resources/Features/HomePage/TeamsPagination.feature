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
@TeamsPagination
Feature: Pagination of Doctor Teams page

  @TeamsPagination
    Scenario: Validating the first Page of Doctor Team
    Given User is on Dietician Website "https://DieticianWebsite.com"
    When User lands on "Teams page"
    Then User should see default three Doctor names on first Page

    Scenario: Validating default number of Doctor names on first Doctor Team Page
    Given User is on Dietician Website "https://DieticianWebsite.com"
    When User lands on "Teams page"
    Then User should see default three Doctor names on first Page
    
    Scenario: Validating the next page(>) button on the first page of Team
    Given User is on "first page" of Team
    When User clicks on next button(>)  
    Then User should be directed to next Doctor names on Team Page
    
    Scenario: Validating next(>)button on the last page of Team
    Given User is on "first page" of Team
    When User lands on last page of Team
    Then Next button should be disabled
    
    Scenario: Validating the previous (<) button on first page of Team
    Given User is on Dietician Website "https://DieticianWebsite.com"
    When User lands on first page of Team
    Then Previous button(<)should be disabled
    
    Scenario: Validating the previous button (<)  when there are previous pages to display
    Given User is on second page of Team
    When User clicks on previous button(<)
    Then User should be directed to previous names of doctor
