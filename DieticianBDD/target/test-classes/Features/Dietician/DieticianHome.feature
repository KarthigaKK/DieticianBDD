Feature: Dietician Home Page

  Scenario: Verify Dietician Home Page After Login
    Given User is on the Dietician website "https://DieticianWebsite.com"
    When User logged in successfully to the Dietician website "Dietician Home"
    Then User can see the Home tab on header menu
    
  Scenario: Verify New Patient Page After Login
   Given User is on the Dietician website "https://DieticianWebsite.com"
   When User logged in successfully to the Dietician website "Dietician Home"
   Then User can see the New Patient tab from the header menu
   
  Scenario: Verify My Patient Page After Login
  	Given User is on the Dietician website "https://DieticianWebsite.com"
  	When User logged in successfully to the Dietician website "Dietician Home"
  	Then User can see the My Patient tab from the header menu 
  	
   Scenario: Verify Diet Plans Page After Login
  	Given User is on the Dietician website "https://DieticianWebsite.com"
  	When User logged in successfully to the Dietician website "Dietician Home"
  	Then User can see the Diet Plans tab from the header menu
  	
  Scenario: Clicking New Patient menu After Login
  	Given User is on the Dietician Home page "https://DieticianWebsite.com/Dietician Home"
  	When User selects New patient tab
  	Then User lands on New Patient page "Add New Patient"
  	
  Scenario: Clicking My patient menu After Login
  	Given User is on the Dietician Home page "https://DieticianWebsite.com/Dietician Home"
  	When User selects My Patient tab
  	Then User lands on My Patient page "My Patients"
  	
  Scenario: Clicking Diet Plans menu After Login
  	Given User is on the Dietician Home page "https://DieticianWebsite.com/Dietician Home"
  	When User selects Diet Plans tab
  	Then User lands on Diet Plans page "View Recent Diets"
  	
  Scenario: Verify Dietician Home Page Side Bar After Login
  	Given User is on the Dietician Home page "https://DieticianWebsite.com/Dietician Home"
  	When User logged in successfully to the Dietician website "Dietician Home"
  	Then User can see Banner or Announcements section in right side bar
  	
  Scenario: Dietician Home Page Dietician name verification After Login
  	Given User is on the Dietician Home page "https://DieticianWebsite.com/Dietician Home"
  	When User logged in successfully to the Dietician website "Dietician Home"
  	Then User can see Logged in as "<Dietician name>" message in top of right side bar
  	
  Scenario: Verify Dietician Home Page image and Content After Login
  	Given User is on the Dietician Home page "https://DieticianWebsite.com/Dietician Home"
  	When User logged in successfully to the Dietician website "Dietician Home"
  	Then User can read Dietician Home page image and content
  	
  Scenario: Verify Dietician Home Page Ssign out btn After Login
  	Given User is on the Dietician Home page "https://DieticianWebsite.com/Dietician Home"
  	When User can see "SIGN OUT" button after successful login
  	Then User can click on "SIGN OUT" button for logging off successfully
  	
  

  	
  	
  	 
	
  	 
   
   
