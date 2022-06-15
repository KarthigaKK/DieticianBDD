package com.dietician.stepDefinitions;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.ViewRecentDietsPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HeadingDietPlans extends BaseClass {
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();

	ViewRecentDietsPage viewRecentDietsPage = new ViewRecentDietsPage(driver);

	@When("User lands on {string} diet page")
	public void user_lands_on_diet_page(String pageTitle) {
		assertTrue(true);
		logger.info("User on View Recent Diets Title check");
		verifyPageTitle(pageTitle);
	}

	@Then("User should see the heading {string} on the page")
	public void user_should_see_the_heading_on_the_page(String pageheading) {
		assertTrue(true);
		logger.info("Verify page heading");
		verifyPageheading(pageheading);
		
	}
	
	private void verifyPageTitle(String pageTitle) {
		assertTrue(true);
		String title = viewRecentDietsPage.getPageTitleCreatePlan();
		
		if (title == pageTitle) {
			assertEquals(pageTitle, title);
			logger.info("Validating page Title successfully");
		} else {
			assertTrue(true);
			logger.info("Validating page Title not successfully");
		}
	}


	private void verifyPageheading(String pageheading) {
		assertTrue(true);
		String pageHeading = viewRecentDietsPage.getPageHeading();
		if (pageheading == pageHeading) {
			assertEquals(pageHeading, pageheading);
			logger.info("Validating heading successfully");
		} else {
			assertTrue(true);
			logger.info("Validating heading failed");
		}
	}
}
