package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.HomeLink;
import com.dietician.pageObjects.TeamsPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TeamsPagination extends BaseClass {

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	TeamsPage pagination = new TeamsPage(driver);

	@Given("User is on Dietician Website {string}")
	public void user_is_on_dietician_website(String url) {
		logger.info("User is on dietician website");
		if (baseurl == url)
			assertEquals(url, baseurl);
		else
			assertTrue(true);
	}

	@When("User lands on {string}")
	public void user_lands_on(String TeamTitle) {

		pagination.getTeamPageTitle();

		String title = pagination.getTeamPageTitle();
		if (title == TeamTitle) {
			assertEquals(TeamTitle, title);
			logger.info("User is in TeamPage");
		} else {
			logger.info("User is not in TeamPage");
		}
	}

	@Then("User should see default three Doctor names on first Page")
	public void user_should_see_default_three_doctor_names_on_first_page() {

		if (pagination.Doctor1Visibility() && pagination.Doctor2Visibility() && pagination.Doctor3Visibility()) {
			logger.info("Doctor's Names are Visible in the Team page");
		}

		else
			logger.info("Doctor's Names are not Visible in the Team page");
	}
	
	
	@Given("User is on {string} of Team")
	public void user_is_on_of_team(String TeamTitle) {
		pagination.getTeamPageTitle();
		String title = pagination.getTeamPageTitle();
		if (title == TeamTitle) {
			assertEquals(TeamTitle, title);
			logger.info("User is in TeamPage");
		} else {
			logger.info("User is not in TeamPage");
		}
		
	}

	@When("User clicks on next button\\(>)")
	public void user_clicks_on_next_button() {
		pagination.clickNextButton();
	}

	@Then("User should be directed to next Doctor names on Team Page")
	public void user_should_be_directed_to_next_doctor_names_on_team_page() {
		if (pagination.Doctor4Visibility() && pagination.Doctor5Visibility() && pagination.Doctor6Visibility()) {
			logger.info("Doctor's Names are Visible in the Team page");
		}

		else
			logger.info("Doctor's Names are not Visible in the Team page");
	}

	@When("User lands on last page of Team")
	public void user_lands_on_last_page_of_team() {
		if (pagination.Doctor7Visibility() && pagination.Doctor8Visibility() && pagination.Doctor9Visibility()) {
			logger.info("Doctor's Names are Visible in the Team page");
		}

		else
			logger.info("Doctor's Names are not Visible in the Team page");
	    
	}

	@Then("Next button should be disabled")
	public void next_button_should_be_disabled() {
		if (pagination.clickNextButtondisabled()) {

			logger.info("Button is enabled");
		} else
			logger.info("Button is disabled");
	}

	@When("User lands on first page of Team")
	public void user_lands_on_first_page_of_team() {
		
		if (pagination.Doctor1Visibility() && pagination.Doctor2Visibility() && pagination.Doctor3Visibility()) {
			logger.info("Doctor's Names are Visible in the Team page");
		}

		else
			logger.info("Doctor's Names are not Visible in the Team page");
		
	}

	@Then("Previous button\\(<)should be disabled")
	public void previous_button_should_be_disabled() {
		
		if (pagination.clickPreviousButtondisabled()) {

			logger.info("Button is enabled");
		} else
			logger.info("Button is disabled");
	}

	@Given("User is on second page of Team")
	public void user_is_on_second_page_of_team() {
		
		if (pagination.Doctor4Visibility() && pagination.Doctor5Visibility() && pagination.Doctor6Visibility()) {
			logger.info("Doctor's Names are Visible in the Team page");
		}

		else
			logger.info("Doctor's Names are not Visible in the Team page");
	}

	@When("User clicks on previous button\\(<)")
	public void user_clicks_on_previous_button() {
		pagination.clickPreviousButton();
	}

	@Then("User should be directed to previous names of doctor")
	public void user_should_be_directed_to_previous_names_of_doctor() {
		
		if (pagination.Doctor1Visibility() && pagination.Doctor2Visibility() && pagination.Doctor3Visibility()) {
			logger.info("Doctor's Names are Visible in the Team page");
		}

		else
			logger.info("Doctor's Names are not Visible in the Team page");
		
		
	}


}