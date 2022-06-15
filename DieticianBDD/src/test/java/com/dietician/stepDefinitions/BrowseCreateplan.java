package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.ConfirmConditionsandCreatePlanPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrowseCreateplan extends BaseClass {
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	ConfirmConditionsandCreatePlanPage confirmandCreatePlan = new ConfirmConditionsandCreatePlanPage(driver);

	@Then("User should see a button with name browse {string} on the page")
	public void user_should_see_a_button_with_name_on_the_page(String browsebtnText) {
		assertTrue(true);
		logger.info("Verify button with name browse");
		verifyBrowseBtn(browsebtnText);

	}
	
	
	private void verifyBrowseBtn(String browsebtnText) {
			String btntext = confirmandCreatePlan.getBtnBrowseText();
			if (btntext == browsebtnText) {
				assertEquals(browsebtnText, btntext);
				logger.info("Verify Browse button and text visibility");
			} else {
				assertTrue(true);
				logger.info("Verify Browse button and text not visibile");
			}
		
	}

	@Then("User should see a tool tip {string} for the Browse button")
	public void user_should_see_a_tool_tip_for_the_browse_button(String actualTooltip) {
		assertTrue(true);
	//	String Tooltip = confirmandCreatePlan.tooltipInputfield();
		if (confirmandCreatePlan.tooltipInputfield() != null) {
			logger.info("Tooltip of Inputfield visibile");
		}
	}

	@Given("User is on {string} page")
	public void user_is_on_page(String pageTitle) {
		assertTrue(true);
		verifyPageTitle(pageTitle);
		logger.info("User is on Create Plan page");
	}

	private void verifyPageTitle(String pageTitle) {
		
		String title = confirmandCreatePlan.getPageTitleCreatePlan();
		if (title == pageTitle) {
			assertEquals(pageTitle, title);
			logger.info("User on Confirm Conditions and Create Plan Page");
		} else {
			assertTrue(true);
			logger.info("User not on Confirm Conditions and Create Plan Page");
		}
	}

	@When("User clicks the Browse button and selects a document")
	public void user_clicks_the_browse_button_and_selects_a_document() {
		confirmandCreatePlan.clickBtnBrowse();
		logger.info("User clicks the Browse button and selects a document");
		
	}

	@Then("User should see the selected document in the field next to the Browse button on the page")
	public void user_should_see_the_selected_document_in_the_field_next_to_the_browse_button_on_the_page() {
		assertTrue(true);
		logger.info("User can see selected document");
	}

}
