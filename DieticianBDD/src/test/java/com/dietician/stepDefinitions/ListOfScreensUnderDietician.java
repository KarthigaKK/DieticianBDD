package com.dietician.stepDefinitions;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.ListOfScreensPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ListOfScreensUnderDietician  extends BaseClass{
	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	ListOfScreensPage screens = new ListOfScreensPage(driver);
	
	@Then("User should see the links to Dietician pages under the sub menu with text {string}")
	public void user_should_see_the_links_to_dietician_pages_under_the_sub_menu_with_text(String string) {
		logger.info("User should see the links to Dietician pages under the sub menu");
	}

	@When("User selects the link {string} from the Screens menu before signing in")
	public void user_selects_the_link_from_the_screens_menu_before_signing_in(String string) {
		logger.info("User selects the link from the Screens menu before signing in");
	}

	@When("User selects the link {string} from the Screens menu after signing in")
	public void user_selects_the_link_from_the_screens_menu_after_signing_in(String string) {
		logger.info("User selects the link from the Screens menu after signing in");
	}

	@Then("User is re-directed to View Recent Diets page")
	public void user_is_re_directed_to_view_recent_diets_page() {
		logger.info("User is re-directed to View Recent Diets page");
	}

	@Given("User is on View Recent Diets page after signning in")
	public void user_is_on_view_recent_diets_page_after_signning_in() {
		logger.info("User is on View Recent Diets page after signning in");
	}

	@Then("User is re-directed to View Recent Test Reports page")
	public void user_is_re_directed_to_view_recent_test_reports_page() {
		logger.info("User is re-directed to View Recent Test Reports page");
	}

	@Given("User is on View Recent Test Reports page after signning in")
	public void user_is_on_view_recent_test_reports_page_after_signning_in() {
		logger.info("Dietician pages of screens are visible");
	}

	@Then("User is re-directed to Add New Patient page")
	public void user_is_re_directed_to_add_new_patient_page() {
		logger.info("User is re-directed to Add New Patient page");
	}

	@Given("User is on Add New Patient page after signning in")
	public void user_is_on_add_new_patient_page_after_signning_in() {
		logger.info("User is on Add New Patient page after signning in");
	}

	@Then("User is re-directed to Dietician Home page")
	public void user_is_re_directed_to_dietician_home_page() {
		logger.info("User is on Add New Patient page after signning in");
	}

	@Given("User is on Dietician Home page after signning in")
	public void user_is_on_dietician_home_page_after_signning_in() {
		logger.info("User is on Dietician Home page after signning in");
	}

	@Then("User is re-directed to My Patients page")
	public void user_is_re_directed_to_my_patients_page() {
		logger.info("User is re-directed to My Patients page");
	}

	@Given("User is on My Patients page after signning in")
	public void user_is_on_my_patients_page_after_signning_in() {
		logger.info("User is on My Patients page after signning in");
	}

	@Then("User is re-directed to Confirm Conditions and Create Plan page")
	public void user_is_re_directed_to_confirm_conditions_and_create_plan_page() {
		logger.info("User is re-directed to Confirm Conditions and Create Plan page");
	}


}
