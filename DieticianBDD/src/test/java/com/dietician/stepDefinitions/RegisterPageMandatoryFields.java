package com.dietician.stepDefinitions;
import com.dietician.base.BaseClass;
import com.dietician.pageObjects.RegisterPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageMandatoryFields extends BaseClass{
ReadConfig config=new ReadConfig();
	
	String baseurl=config.getApplicationURL();
	RegisterPage register = new RegisterPage(driver);
	
	@When("User is on Register Page {string}")
	public void user_is_on_register_page(String string) {
		logger.info("User is on Register page");
	}

	@Then("User should see all mandatory flields for Register Page with star symbol on top of those fields")
	public void user_should_see_all_mandatory_flields_for_register_page_with_star_symbol_on_top_of_those_fields() {
		logger.info("Verify Mandatory fields");
		testMandatoryFieldValidation();
	}
	
	private void testMandatoryFieldValidation() {
		logger.info("Mandatory fields are username, password textboxes");
	}

}
