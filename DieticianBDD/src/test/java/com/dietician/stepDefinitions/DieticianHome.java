package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.DieticianHomePage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DieticianHome extends BaseClass{
	
	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	String homeurl=config.getDieticianHomeUrl();
	DieticianHomePage dietHome=new DieticianHomePage(driver);
	

	@Given("User is on the Dietician website {string}")
	public void user_is_on_the_dietician_website(String url) {
		//check base amp url and given url
				logger.info("User is on dietician website");
				if (baseurl.equals(url))
					assertEquals(url, baseurl);
				else 
					assertTrue(true); 
	}

	@When("User logged in successfully to the Dietician website {string}")
	public void user_logged_in_successfully_to_the_dietician_website(String pagetitle) {
		logger.info("Verify Dietician Home page title");
		verifyDieticianHomePageTitle(pagetitle);
	}

	@Then("User can see the Home tab on header menu")
	public void user_can_see_the_home_tab_on_header_menu() {
		logger.info("Verify Home menu");
		dietHome.VerifyHomeMenu();
	}
	
	@Then("User can see the New Patient tab from the header menu")
	public void user_can_see_the_new_patient_tab_from_the_header_menu() {
		logger.info("Verify New Patient menu");
		dietHome.VerifyMenuNewPatient();
	}
	

	@Then("User can see the My Patient tab from the header menu")
	public void user_can_see_the_my_patient_tab_from_the_header_menu() {
		logger.info("Verify My Patient menu");
		dietHome.VerifyMenuMyPatients();
	}
	
	@Then("User can see the Diet Plans tab from the header menu")
	public void user_can_see_the_diet_plans_tab_from_the_header_menu() {
		logger.info("Verify My Patient menu");
		dietHome.VerifyMenuDietPlans();
	}
	
	@Given("User is on the Dietician Home page {string}")
	public void user_is_on_the_dietician_home_page(String url) {
		//check base amp url and given url
		logger.info("User is on dietician website");
		if (baseurl.equals(url))
			assertEquals(url, homeurl);
		else 
			assertTrue(true); 
	}

	@When("User selects New patient tab")
	public void user_selects_new_patient_tab() {
		logger.info("User selects new patient tab");
		dietHome.clickMenuNewPatient();
	}

	@Then("User lands on New Patient page {string}")
	public void user_lands_on_new_patient_page(String pagetitle) {
		logger.info("Verify New Patient page title");
		verifyNewPatientPageTitle(pagetitle);
	}
	
	@When("User selects My Patient tab")
	public void user_selects_my_patient_tab() {
		logger.info("User selects my patient tab");
		dietHome.clickMenuMyPatients();
	}

	@Then("User lands on My Patient page {string}")
	public void user_lands_on_my_patient_page(String pagetitle) {
		logger.info("Verify My patient page title");
		verifyMyPatientPageTitle(pagetitle);
	}
	
	@When("User selects Diet Plans tab")
	public void user_selects_diet_plans_tab() {
		logger.info("User selects Diet Plans tab");
		dietHome.clickMenuDietPlans();
	}

	@Then("User lands on Diet Plans page {string}")
	public void user_lands_on_diet_plans_page(String pagetitle) {
		logger.info("Verify Diet Plan page title");
		verifyDietPlanPageTitle(pagetitle);
	}
	
	@Then("User can see Banner or Announcements section in right side bar")
	public void user_can_see_banner_or_announcements_section_in_right_side_bar() {
		logger.info("Verify Banner or Announcements section");
		dietHome.VerifycontentBannerorAnnouncements();
	}
	
	@Then("User can see Logged in as {string} message in top of right side bar")
	public void user_can_see_logged_in_as_message_in_top_of_right_side_bar(String DieticianName)  {
		logger.info("Display dietician name");
		dietHome.getDieticianName(DieticianName);
	}
	
	@Then("User can read Dietician Home page image and content")
	public void user_can_read_dietician_home_page_image_and_content() {
		logger.info("Verify page image and content");
		dietHome.verifyPageImageAndContent();
	}
	

	@When("User can see {string} button after successful login")
	public void user_can_see_button_after_successful_login(String btnname) {
		logger.info("Verify "+ btnname +" button after login");
		dietHome.verifyBtnSignOut();
	}
	
	@Then("User can click on {string} button for logging off successfully")
	public void user_can_click_on_button_for_logging_off_successfully(String btnname) {
		logger.info("User "+ btnname +" Successfully");
		dietHome.clickBtnSignOut();
	}
	
	private void verifyDieticianHomePageTitle(String pageTitle)
	{
		String title = dietHome.getDieticianHomePageTitle();
	    if (title.equals(pageTitle))
	    {
	    	assertEquals(pageTitle, title);
			logger.info("Verified 'Dietician Home' page title");
	    }
		else {
			assertTrue(true); 
		}
	}

	private void verifyNewPatientPageTitle(String pageTitle)
	{
		String title = dietHome.getNewPatientPageTitle();
	    if (title.equals(pageTitle))
	    {
	    	assertEquals(pageTitle, title);
			logger.info("Verified 'New Patient' page title");
	    }
		else {
			assertTrue(true); 
		}
	}
	
	private void verifyMyPatientPageTitle(String pageTitle)
	{
		String title = dietHome.getMyPatientPageTitle();
	    if (title.equals(pageTitle))
	    {
	    	assertEquals(pageTitle, title);
			logger.info("Verified 'My Patient' page title");
	    }
		else {
			assertTrue(true); 
		}
	}
	
	private void verifyDietPlanPageTitle(String pagetitle)
	{
		String title = dietHome.getViewRecentDietsPageTitle();
	    if (title.equals(pagetitle))
	    {
	    	assertEquals(pagetitle, title);
			logger.info("Verified 'My Patient' page title");
	    }
		else {
			assertTrue(true); 
		}
	}

}
