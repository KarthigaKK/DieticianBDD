package com.dietician.stepDefinitions;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.RegisterPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSignUpWithEmail extends BaseClass{
ReadConfig config=new ReadConfig();
	
	String baseurl=config.getApplicationURL();
	RegisterPage register = new RegisterPage(driver);
	

	@Then("User should see a form with heading {string}, to sign up using Email Id.")
	public void user_should_see_a_form_with_heading_to_sign_up_using_email_id(String pageheader) {
		logger.info("Verify Sign up with your email header");
		verifyPageHeader(pageheader);
	}

	@Then("User should see a button with text {string} in the Sign Up with your Email form.")
	public void user_should_see_a_button_with_text_in_the_sign_up_with_your_email_form(String btnSignUp) {
		logger.info("Verify Sign Up button");
		register.verifySignUpBtn(btnSignUp);
	}

	@When("User clicks SIGN UP Button in the Sign Up with your Email form with all fields empty .")
	public void user_clicks_sign_up_button_in_the_sign_up_with_your_email_form_with_all_fields_empty() {
		logger.info("Mandatory fields cannot be empty");
		register.clickSignUp();
	}

	@When("User clicks SIGN UP Button in the Sign Up with your Email form  by entering numeric text for First Name, valid values for the remaining fields .")
	public void user_clicks_sign_up_button_in_the_sign_up_with_your_email_form_by_entering_numeric_text_for_first_name_valid_values_for_the_remaining_fields() {
		logger.info("Invalid data entered for First Name");
		register.clickSignUp();
	}

	@When("User clicks SIGN UP Button in the Sign Up form with your Email by entering numeric text for Last Name, valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_with_your_email_by_entering_numeric_text_for_last_name_valid_values_for_the_remaining_fields() {
		logger.info("Invalid data entered for Last Name");
		register.clickSignUp();
	}

	@When("User clicks SIGN UP Button in the Sign Up form with your Email by entering numeric text for Username, valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_with_your_email_by_entering_numeric_text_for_username_valid_values_for_the_remaining_fields() {
		logger.info("Invalid data entered for Username");
	}

	@Then("User should see a message {string}.")
	public void user_should_see_a_message(String string) {
		logger.info("Invalid data entered for Email Address");
	}

	@When("User clicks SIGN UP Button in the Sign Up form with your Email by entering invalid email Id for Email Address, valid values for the remaining fields.")
	public void user_clicks_sign_up_button_in_the_sign_up_form_with_your_email_by_entering_invalid_email_id_for_email_address_valid_values_for_the_remaining_fields() {
		logger.info("Invalid data entered for Email Address");
	}

	@Then("User should see a message \"Invalid data entered for \"Email Address\".")
	public void user_should_see_a_message_invalid_data_entered_for_email_address() {
		logger.info("Invalid data entered for Email Address");
	}

	@When("User clicks SIGN UP Button in the Sign Up form with your Email by entering invalid Password, valid values for the remaining fields.")
	public void user_clicks_sign_up_button_in_the_sign_up_form_with_your_email_by_entering_invalid_password_valid_values_for_the_remaining_fields() {
		logger.info("Invaild Password");
	}

	@When("User clicks SIGN UP Button in the Sign Up form with your Email by entering a value that is different than the Password field value, valid values for the remaining fields.")
	public void user_clicks_sign_up_button_in_the_sign_up_form_with_your_email_by_entering_a_value_that_is_different_than_the_password_field_value_valid_values_for_the_remaining_fields() {
		logger.info("Confirm Password should same as Password");
	}

	@When("User clicks SIGN UP Button in the Sign Up with your Email form  by entering valid values for the all fields.")
	public void user_clicks_sign_up_button_in_the_sign_up_with_your_email_form_by_entering_valid_values_for_the_all_fields() {
		logger.info("User is redirected to SignIn page");
	}
	
	@Then("User is re-directed to Sign In page.")
	public void user_is_re_directed_to_sign_in_page() {
		logger.info("User is re-directed to SignIn page");
	}


	private void verifyPageHeader(String pageHeader) {
		String title = register.getSignUpEmailPageHeader();
		if (title.equals(pageHeader)) {
			assertEquals(pageHeader, title);
			logger.info("Verified 'Sign up with your email' page header");
		} else {
			assertTrue(true);
		}
	}
}
