package com.dietician.stepDefinitions;
import com.dietician.base.BaseClass;
import com.dietician.pageObjects.ListOfScreensPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListOfScreensUnderPublic extends BaseClass{
	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	ListOfScreensPage screens = new ListOfScreensPage(driver);
	
	@Then("User should see the links to public pages under the sub menu with text {string}")
	public void user_should_see_the_links_to_public_pages_under_the_sub_menu_with_text(String string) {
		logger.info("User should see the links to public pages under the sub menu");
	}

	@Then("User should see a link with text {string} under the section Public")
	public void user_should_see_a_link_with_text_under_the_section_public(String string) {
		logger.info("User should see a link under the section Public");
	}

	@Given("User is on Home page")
	public void user_is_on_home_page() {
		logger.info("User is on Home page");
	}

	@When("User selects the link {string} from the Screens menu")
	public void user_selects_the_link_from_the_screens_menu(String string) {
		logger.info("User selects the link from the Screens menu");
	}

	@Then("User is re-directed to Sign In page")
	public void user_is_re_directed_to_sign_in_page() {
		logger.info("User is re-directed to Sign In page");
	}

	@Given("User is on Sign In page")
	public void user_is_on_sign_in_page() {
		logger.info("User is on Sign In page");
	}

	@Then("User is re-directed to Register page")
	public void user_is_re_directed_to_register_page() {
		logger.info("User is re-directed to Register page");
	}

	@Then("User is re-directed to Team page")
	public void user_is_re_directed_to_team_page() {
		logger.info("User is re-directed to Team page");
	}

	@Given("User is on Team page")
	public void user_is_on_team_page() {
		logger.info("User is on Team page");
	}

	@Then("User is re-directed to Testimonials page")
	public void user_is_re_directed_to_testimonials_page() {
		logger.info("User is re-directed to Testimonials page");
	}

	@Given("User is on Testimonials page")
	public void user_is_on_testimonials_page() {
		logger.info("User is on Testimonials page");
	}

	@Then("User is re-directed to Forgot Password page")
	public void user_is_re_directed_to_forgot_password_page() {
		logger.info("User is re-directed to Forgot Password page");
	}

	@Given("User is on Forgot Password page")
	public void user_is_on_forgot_password_page() {
		logger.info("User is on Forgot Password page");
	}

	@Then("User is re-directed to Product Features page")
	public void user_is_re_directed_to_product_features_page() {
		logger.info("User is re-directed to Product Features page");
	}

	@Given("User is on Product Feature page")
	public void user_is_on_product_feature_page() {
		logger.info("User is on Product Feature page");
	}

	@Then("User is re-directed to Contact page")
	public void user_is_re_directed_to_contact_page() {
		logger.info("User is re-directed to Contact page");
	}

	@Given("User is on Contact page")
	public void user_is_on_contact_page() {
	    logger.info("User is on Contact page");
	}

	@Then("User is re-directed to Blogs page")
	public void user_is_re_directed_to_blogs_page() {
		logger.info("User is re-directed to Blogs page");
	}

	@Given("User is on Blogs page")
	public void user_is_on_blogs_page() {
		logger.info("User is on Blogs page");
	}

	@Then("User is re-directed to Featured Content page")
	public void user_is_re_directed_to_featured_content_page() {
		logger.info("User is re-directed to Featured Content page");
	}

	@Given("User is on Featured Content page")
	public void user_is_on_featured_content_page() {
		logger.info("User is on Featured Content page");
	}

	@Then("User is re-directed to Home page")
	public void user_is_re_directed_to_home_page() {
		logger.info("User is re-directed to Home page");
	}


	
}


