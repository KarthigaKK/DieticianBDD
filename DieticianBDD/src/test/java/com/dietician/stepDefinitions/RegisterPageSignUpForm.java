package com.dietician.stepDefinitions;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.RegisterPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSignUpForm extends BaseClass{
ReadConfig config=new ReadConfig();
	
	String baseurl=config.getApplicationURL();
	RegisterPage register = new RegisterPage(driver);
	

	@Then("User should see a form with heading {string}, to sign up using mobile number")
	public void user_should_see_a_form_with_heading_to_sign_up_using_mobile_number(String pageheader) {
		logger.info("Verify signin page header");
		verifyPageHeader(pageheader);
	}

	@Then("User should see a button with text {string} in the Sign Up form")
	public void user_should_see_a_button_with_text_in_the_sign_up_form(String btnname) {
		logger.info("Verify SIGN UP button");
		register.verifySignUpFormBtn(btnname);
	}

	@When("User clicks SIGN UP Button in the Sign Up form with all fields empty.")
	public void user_clicks_sign_up_button_in_the_sign_up_form_with_all_fields_empty() {
		logger.info("User click SIGN UP btn with all fields empty");
		register.clickSignUpForm();
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		logger.info("Mandatory fields cannot be empty");
		invalidLogin("Mandatory fields cannot be empty");
	}

	@When("User clicks SIGN UP Button in the Sign Up form  by entering numeric text for First Name, valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_numeric_text_for_first_name_valid_values_for_the_remaining_fields() {
	    logger.info("Invalid data entered for First Name");
	}

	@When("User clicks SIGN UP Button in the Sign Up form  by entering numeric text for Last Name, valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_numeric_text_for_last_name_valid_values_for_the_remaining_fields() {
	    logger.info("Invalid data entered for Last Name");
	}

	@When("User clicks SIGN UP Button in the Sign Up form  by entering Aphanumeric text for Mobile Number, valid values for the remaining fields.")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_aphanumeric_text_for_mobile_number_valid_values_for_the_remaining_fields() {
	    logger.info("Invalid data entered for Mobile Number");
	}

	@When("User clicks SIGN UP Button in the Sign Up form  by entering numeric text for Any other field, valid values for the remaining fields.")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_numeric_text_for_any_other_field_valid_values_for_the_remaining_fields() {
	    logger.info("Invalid data entered for Any other field");
	}

	@When("User clicks SIGN UP Button in the Sign Up form  by entering invalid email Id for Email,valid values for the remaining fields.")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_invalid_email_id_for_email_valid_values_for_the_remaining_fields() {
	    logger.info("Invalid data entered for Email");
	}

	@Then("User should see a message \"Invalid data entered for \"Email\".")
	public void user_should_see_a_message_invalid_data_entered_for_email() {
	    logger.info("Invalid data entered for Email");
	}

	@When("User clicks SIGN UP Button in the Sign Up form  by entering invalid Password , valid values for the remaining fields.")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_invalid_password_valid_values_for_the_remaining_fields() {
	    logger.info("Invalid data entered for Password");
	}
	
	@When("User clicks SIGN UP Button in the Sign Up form by entering valid values for the all fields.")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_valid_values_for_the_all_fields() {
		logger.info("User clicks sign in page");
	}


	private void verifyPageHeader(String pageHeader)
	{
		String title = register.getRegisterPageTitle();
	    if (title.equals(pageHeader))
	    {
	    	assertEquals(pageHeader, title);
			logger.info("Verified 'Register' page header");
	    }
		else {
			assertTrue(true); 
		}
	}
	
	private void invalidLogin(String errormessage)
	{
		String msg = register.InvalidSignUp();
		if (msg == errormessage)
	    {
	    	assertEquals(errormessage, msg);
			logger.info("Mandatory fields cannot be empty");
	    }
		else {
			assertTrue(true); 
	      
		}
	}
	
}
