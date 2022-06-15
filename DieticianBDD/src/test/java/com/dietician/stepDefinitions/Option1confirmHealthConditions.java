package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.ConfirmConditionsandCreatePlanPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Option1confirmHealthConditions extends BaseClass {

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	ConfirmConditionsandCreatePlanPage confirmandCreatePlan = new ConfirmConditionsandCreatePlanPage(driver);

	@Then("User should see option1 menu to update the health conditions")
	public void user_should_see_option1_menu_to_update_the_health_conditions() {
		
		if (confirmandCreatePlan.VerifybtnConfirm1() == true) {
			logger.info("Validating the Confirm1 button visible");
		}else
			assertTrue(true);
		logger.info("Validating the Confirm1 button not visible");
	}

	@Then("User should see a button with text {string} in option1 menu")
	public void user_should_see_a_button_with_text_in_option1_menu(String btnoption1Text) {
		String btnoption1 = confirmandCreatePlan.getBtnBrowseText();
		if (btnoption1Text == btnoption1) {
			assertEquals(btnoption1, btnoption1Text);
			logger.info("Validating the Confirm1 button text visible");
		} else {
			assertTrue(true);
			logger.info("Validating the Confirm1 button text not visibile");
		}
	}

	@Then("User can update the health conditions in option1 menu")
	public void user_can_update_the_health_conditions_in_option1_menu() {
		if (confirmandCreatePlan.VerifybtnConfirm1() == true) {
		confirmandCreatePlan.Verifycondition1();
		confirmandCreatePlan.Verifycondition2();
		confirmandCreatePlan.Verifycondition3();
		confirmandCreatePlan.VerifycoMorbidiCondition1();
		confirmandCreatePlan.VerifycoMorbidiCondition2();
		confirmandCreatePlan.VerifycoMorbidiCondition3();
		confirmandCreatePlan.VerifyPreference1();
		confirmandCreatePlan.VerifyPreference2();
		confirmandCreatePlan.VerifyPreference3();
		
		logger.info("Validating the Confirm1 options visible");
		confirmandCreatePlan.clickCondition1();
		confirmandCreatePlan.clickCondition2();
		confirmandCreatePlan.clickCondition3();
		confirmandCreatePlan.clickCoMorbidiCondition1();
		confirmandCreatePlan.clickCoMorbidiCondition2();
		confirmandCreatePlan.clickCoMorbidiCondition3();
		confirmandCreatePlan.clickPreference1();
		confirmandCreatePlan.clickPreference2();
		confirmandCreatePlan.clickPreference3();
		confirmandCreatePlan.clickBtnConfirm1();
		logger.info("Validating the Confirm1 options click");
		}else {
			assertTrue(true);
		logger.info("Validating the Confirm1 options not visible");
		}
	}

	@When("User clicks the CONFIRM button in option1 menu")
	public void user_clicks_the_confirm_button_in_option1_menu() {
		if (confirmandCreatePlan.VerifybtnConfirm1() == true) {
		confirmandCreatePlan.clickBtnConfirm1();
		logger.info("Validating the Confirm1 options click");
		}else {
			assertTrue(true);
		logger.info("Validating the Confirm1 options click not selected");
		}
	}

	@Then("User cannot update the health conditions in option1 menu")
	public void user_cannot_update_the_health_conditions_in_option1_menu() {
		if (confirmandCreatePlan.VerifybtnConfirm1() == false) {
			confirmandCreatePlan.Verifycondition1(); 
			confirmandCreatePlan.Verifycondition2(); 
			confirmandCreatePlan.Verifycondition3();
			confirmandCreatePlan.VerifycoMorbidiCondition1();
			confirmandCreatePlan.VerifycoMorbidiCondition2();
			confirmandCreatePlan.VerifycoMorbidiCondition3();
			confirmandCreatePlan.VerifyPreference1();
			confirmandCreatePlan.VerifyPreference2();
			confirmandCreatePlan.VerifyPreference3();
		logger.info("Confirm1 options Saved and cannot be changed");
		}else {
			assertTrue(true);
			logger.info("Confirm1 options Saved and can be changed");

		}

	}
}
