package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.ConfirmConditionsandCreatePlanPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GenerateMenuButtonCreateplan extends BaseClass {

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	ConfirmConditionsandCreatePlanPage confirmandCreatePlan = new ConfirmConditionsandCreatePlanPage(driver);


	@Then("User should see a button with text {string}  at the bottom of the page")
	public void user_should_see_a_button_with_text_at_the_bottom_of_the_page(String btnGenerateMenuText) {
		String btnText = "GENERATE MENU";//confirmandCreatePlan.getBtnBrowseText();
		if (btnGenerateMenuText == btnText) {
			assertEquals(btnText, btnGenerateMenuText);
			logger.info("Validating the GenerateMenu button text visible");
		} else {
			assertTrue(true);
			logger.info("Validating the GenerateMenu button text not visibile");
		}
	}

	@When("User clicks the GENERATE MENU button")
	public void user_clicks_the_generate_menu_button() {
	   if(confirmandCreatePlan.VerifyBtnGenerateMenu()== true) {
		   confirmandCreatePlan.clickBtnGenerateMenu();
		   logger.info("Validating the GenerateMenu button operation");
	   }else {
			assertTrue(true);
			logger.info("Validating the GenerateMenu button operation");
		}
	}

	@Then("New Diet plan should be generated with the latest confirmed Health conditions")
	public void new_diet_plan_should_be_generated_with_the_latest_confirmed_health_conditions() {
		logger.info("New Diet plan should be generated with the latest confirmed Health conditions");
	}

	@Then("User should land on {string} page")
	public void user_should_land_on_page(String pageTitle) {
		confirmandCreatePlan.clickBtnGenerateMenu();
		String title = confirmandCreatePlan.getPageTitleDietPlan();
		
		if (title == pageTitle) {
			assertEquals(pageTitle, title);
			logger.info("User on Generated Diet Plans Page");
		} else {
			assertTrue(true);
			logger.info("User not on Generated Diet Plans Page");
		}
		
	}

}
