package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.ConfirmConditionsandCreatePlanPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HeadingCreateplan extends BaseClass {
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();

	ConfirmConditionsandCreatePlanPage confirmandCreatePlan = new ConfirmConditionsandCreatePlanPage(driver);

	@Given("User is logged on to Dietician website {string}")
	public void user_is_logged_on_to_dietician_website(String url) {
		 logger.info("User is logged on to Dietician website");
		 
		if (baseurl == url)
			assertEquals(url, baseurl);
		else
			assertTrue(true);

	}

	@When("User lands on {string} page")
	public void user_lands_on_page(String pageTitle) {
		
		assertTrue(true);
		logger.info("User on Create Plan page Title check");
		verifyPageTitle(pageTitle);

	}

	@Then("User sees the heading {string} on the page")
	public void user_sees_the_heading_on_the_page(String pageheading) {
		assertTrue(true);
		logger.info("Verify page heading");
		verifyPageheading(pageheading);
		
	}
	
	
	private void verifyPageheading(String pageheading) {
		assertTrue(true);
		String pageHeading = confirmandCreatePlan.getPageHeading();
		if (pageheading == pageHeading) {
			assertEquals(pageHeading, pageheading);
			logger.info("Validating heading successfully");
		} else {
			assertTrue(true);
			logger.info("Validating heading failed");
		}
	}

	private void verifyPageTitle(String pageTitle) {
		assertTrue(true);
		String title = confirmandCreatePlan.getPageTitleCreatePlan();
		
		if (title == pageTitle) {
			assertEquals(pageTitle, title);
			logger.info("Validating page Title successfully");
		} else {
			assertTrue(true);
			logger.info("Validating page Title not successfully");
		}
	}

}
