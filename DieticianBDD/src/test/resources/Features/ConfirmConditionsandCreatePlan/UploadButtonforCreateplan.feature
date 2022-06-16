@tag
Feature: Upload button on Create Plan page

  @tag1
  Scenario: Validating the Upload button
    Given User is logged on to Dietician website "https://DieticianWebsite.com"
    When User lands on "Confirm conditions and Create Plan" page
    Then User should see a button with name upload "Upload" on the page
    
  
  @tag1
  Scenario: Validating the Upload button operation
    Given User is on "Confirm conditions and Create Plan" page
    When User clicks upload button 
    Then User should be able to upload file
    
     @tag1
  Scenario: Validating the Upload button with no file selected
    Given User is on "Confirm conditions and Create Plan" page
    When User clicks the Upload button without selecting a document
    Then User should see an error message "Only files with extension .pdf are allowed"
    
    @tag1
  Scenario: Validating the Upload functionality with correct file format and size
    Given User is on "Confirm conditions and Create Plan" page
    When User clicks the Upload button by selecting a pdf file of size less than 2MB
    Then User should see an message "File uploaded succesfully"
    