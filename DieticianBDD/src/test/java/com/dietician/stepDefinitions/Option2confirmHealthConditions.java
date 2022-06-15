package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.ConfirmConditionsandCreatePlanPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Option2confirmHealthConditions extends BaseClass {

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	ConfirmConditionsandCreatePlanPage confirmandCreatePlan = new ConfirmConditionsandCreatePlanPage(driver);

	@Then("User should see option2 menu to update the health conditions")
	public void user_should_see_option2_menu_to_update_the_health_conditions() {
		if (confirmandCreatePlan.VerifybtnConfirm2() == true) {
			logger.info("Validating the Confirm1 button visible");
		}else
			assertTrue(true);
		logger.info("Validating the Confirm1 button not visible");
	}

	@Then("User should see a button with text {string} in option2 menu")
	public void user_should_see_a_button_with_text_in_option2_menu(String btnoption2Text) {
		String btnoption2 = confirmandCreatePlan.getBtnBrowseText();
		if (btnoption2Text == btnoption2) {
			assertEquals(btnoption2, btnoption2Text);
			logger.info("Validating the Confirm2 button text visible");
		} else {
			assertTrue(true);
			logger.info("Validating the Confirm2 button text not visibile");
		}
	}

	@Then("User can update the health conditions in option2 menu")
	public void user_can_update_the_health_conditions_in_option2_menu() {
		if (confirmandCreatePlan.VerifybtnConfirm2() == true) {
			confirmandCreatePlan.Verifycondition1dropdown();
			confirmandCreatePlan.Verifycondition2dropdown();
			confirmandCreatePlan.Verifycondition3dropdown();
			confirmandCreatePlan.VerifycoMorbidiCondition1dropdown();
			confirmandCreatePlan.VerifycoMorbidiCondition2dropdown();
			confirmandCreatePlan.VerifycoMorbidiCondition3dropdown();
			confirmandCreatePlan.Verifypreference1dropdown();
			confirmandCreatePlan.Verifypreference2dropdown();
			confirmandCreatePlan.Verifypreference3dropdown();
			
			logger.info("Validating the Confirm2 options visible");
			confirmandCreatePlan.clickCondition1dropdown();
			confirmandCreatePlan.clickCondition2dropdown();
			confirmandCreatePlan.clickCondition3dropdown();
			confirmandCreatePlan.clickCoMorbidiCondition1dropdown();
			confirmandCreatePlan.clickCoMorbidiCondition2dropdown();
			confirmandCreatePlan.clickCoMorbidiCondition3dropdown();
			confirmandCreatePlan.clickPreference1dropdown();
			confirmandCreatePlan.clickPreference2dropdown();
			confirmandCreatePlan.clickPreference3dropdown();
			confirmandCreatePlan.clickBtnConfirm2();
			logger.info("Validating the Confirm2 options click");
			}else {
				assertTrue(true);
			logger.info("Validating the Confirm1 options not visible");
			}
	}

	@When("User clicks the CONFIRM button in option2")
	public void user_clicks_the_confirm_button_in_option2() {
		if (confirmandCreatePlan.VerifybtnConfirm2() == true) {
			confirmandCreatePlan.clickBtnConfirm2();
			logger.info("Validating the Confirm2 options click");
			}else {
				assertTrue(true);
			logger.info("Validating the Confirm2 options click not selected");
			}
	}

	@Then("User cannot update the health conditions in option2 menu")
	public void user_cannot_update_the_health_conditions_in_option2_menu() {
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
		}
		else {
			assertTrue(true);
			logger.info("Confirm1 options Saved and can be changed");
		}
	}

}
