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
@ContactUsPage
Feature: Data fields on Contact us Page

  @ContactUsPage
  Scenario: Validating all fields on Contact us page
    Given User is on "Contact Us" Page
    When User enters submit button with all fields empty
    Then User should get a message Please fill all fields above

    Scenario: Validating the First Name field on Contact Us Page
    Given User is on "Contact Us" Page
    When User enters first name with some numeric values and other fields with valid values and clicks submit button
    Then User should get a message Please fill first name with charactersof maximum ten characters long
    
    Scenario: Validating the Last Name fieldon Contact Us Page
    Given User is on "Contact Us" Page
    When User enters Last  Name field with some numeric values and other fields with valid values and click submit button
    Then User should get a message Please fill Last Name with charactersof maximum ten characters long
    
    Scenario: Validating the Email field on Contact Us Page
    Given User is on "Contact Us" Page
    When User enters Email with some image values and other fields with valid values and click submit button
    Then User should get a message Please fill Email field with character,numeric and special character combinations
    
    Scenario: Validating Subject field on Contact Us Page
    Given User is on "Contact Us" Page
    When User enters Subject with some numeric values and other fields with valid values and  click submit button
    Then User should get a message Please fill Subject field with some chacters of maximum twenty letters length
    
    Scenario: Validating "Write your Message Here" field on Contact Us Page
    Given User is on "Contact Us" Page
    When User enters Write your Message Here with some numeric values and other fields with valid values and clicks submit button
    Then User should get a message Please fill Write your Message here field with  alphabet characters  of maximum two hundred length
    
    Scenario: Validating all valid entries for all fields
    Given User is on "Contact Us" Page
    When User enters all valid values in fields and click submit button
    Then User should get a message Your Request is Submitted