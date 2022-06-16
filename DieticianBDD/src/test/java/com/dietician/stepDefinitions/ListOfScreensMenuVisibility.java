package com.dietician.stepDefinitions;
import com.dietician.base.BaseClass;
import com.dietician.pageObjects.ListOfScreensPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListOfScreensMenuVisibility extends BaseClass{
	
	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	ListOfScreensPage screens = new ListOfScreensPage(driver);
	
	@Given("User on the browser")
	public void user_on_the_browser() {
		logger.info("User is on browser");
	}

	@When("User opens the Dietician website")
	public void user_opens_the_dietician_website() {
		logger.info("User is on dietician website");
		
	}

	@Then("User should see a link with {int} horizontal lines on the top right corner of the Home page")
	public void user_should_see_a_link_with_horizontal_lines_on_the_top_right_corner_of_the_home_page(Integer int1) {
		logger.info("List of screen Icon is present");
	}

	@Given("User is on Dietician website")
	public void user_is_on_dietician_website() {
		logger.info("User is on dietician website");
		
	}

	@When("User selects the link with {int} horizontal lines on top right corner")
	public void user_selects_the_link_with_horizontal_lines_on_top_right_corner(Integer int1) {
		logger.info("User is on dietician website");
	}

	@Then("User should see a menu with list of clickable links is displayed")
	public void user_should_see_a_menu_with_list_of_clickable_links_is_displayed() {
		logger.info("Menu with clickable link is is present ");
	}

	@Then("User should see name on the list of screens as {string}")
	public void user_should_see_name_on_the_list_of_screens_as(String string) {
		logger.info("Name of the List Screens is present");
	}

	
	
	
	
}
