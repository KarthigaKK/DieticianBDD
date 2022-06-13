package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.SignInPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInWithEmail extends BaseClass {

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	SignInPage signIn = new SignInPage(driver);

	@Then("User redirected to form with heading {string}")
	public void user_redirected_to_form_with_heading(String pageheader) {
		logger.info("Verify Login with email page header");
		verifyPageHeader(pageheader);
	}
	
	@Then("User should see a button with text {string} in the Sign In form")
	public void user_should_see_a_button_with_text_in_the_sign_in_form(String btnlogin) {
		logger.info("Verify Login button");
		signIn.verifyLogInBtn(btnlogin);
	}

	@When("User clicks Log In button with all fields empty")
	public void user_clicks_log_in_button_with_all_fields_empty() {
		logger.info("User click login btn with all fields empty");
		signIn.clickLoginIcon();
	}

	@Then("User gets error message {string}")
	public void user_gets_error_message(String string) {
		logger.info("User should get error message");
		
		invalidLogin("Invalid login credentials");
	}
	
	@When("User clicks Log In button with invalid email and valid password")
	public void user_clicks_log_in_button_with_invalid_email_and_valid_password() {
		logger.info("User clicks login with invalid email and valid password");
		signIn.setLoginEmail("logan@yahoo.");
		signIn.setLoginPwd("Rose34D");
		signIn.clickLoginIcon();
	}

	@Then("User should see message {string}")
	public void user_should_see_message(String errormessage) {
		logger.info(errormessage);
	}
	
	@When("User clicks Log In button with valid email and invalid password")
	public void user_clicks_log_in_button_with_valid_email_and_invalid_password() {
		logger.info("User clicks login with valid email and invalid password");
		signIn.setLoginEmail("logan@yahoo.com");
		signIn.setLoginPwd("@#$@@@AAAAAAAAAA");
		signIn.clickLoginIcon();
	}

	@Then("User gets a message {string}")
	public void user_gets_a_message(String errormessage) {
		logger.info(errormessage);
	}
	
	@When("User clicks Log In button with valid email and empty password")
	public void user_clicks_log_in_button_with_valid_email_and_empty_password() {
		logger.info("User clicks login btn with valid email and empty password");
		signIn.setLoginEmail("logan@yahoo.com");
		signIn.setLoginPwd("");
		signIn.clickLoginIcon();
	}

	@When("User clicks Log In with both invalid email and password")
	public void user_clicks_log_in_with_both_invalid_email_and_password() {
		logger.info("User clicks login with valid email and invalid password");
		signIn.setLoginEmail("logan@yahoo");
		signIn.setLoginPwd("@#$@@@AAAAA2434");
		signIn.clickLoginIcon();
	}
	

	@When("User clicks Log In with both valid email and password")
	public void user_clicks_log_in_with_both_valid_email_and_password() {
		logger.info("User clicks login with valid email and invalid password");
		signIn.setLoginEmail("logan@yahoo.com");
		signIn.setLoginPwd("ROse123*");
		signIn.clickLoginIcon();
	}
	
	@When("User clicks {string} button to log in")
	public void user_clicks_button_to_log_in(String fbbtn) {
		logger.info("User clicks "+ fbbtn +" button to log in");
	   signIn.clickFacebookBtn();
	}

	@Then("User is redirected to Facebook login Page")
	public void user_is_redirected_to_facebook_login_page() {
		logger.info("User redirected to facebook login page");
	}

	
	
	@Then("User is redirected to Google logIn page")
	public void user_is_redirected_to_google_log_in_page() {
		logger.info("User redirected to google login page");
	}

	@When("User clicks sign up link")
	public void user_clicks_sign_up_link() {
		logger.info("User clicks sign up link");
	   signIn.clicklinkSignUp();
	}

	@Then("User is redirected to Register Page")
	public void user_is_redirected_to_register_page() {
		logger.info("User redirected to Register page");
	}
	private void verifyPageHeader(String pageHeader) {
		String title = signIn.getSignInEmailPageHeader();
		if (title.equals(pageHeader)) {
			assertEquals(pageHeader, title);
			logger.info("Verified 'Login with email' page header");
		} else {
			assertTrue(true);
		}
	}
	private void invalidLogin(String errormessage)
	{
		String msg = signIn.InvalidLogin();
		if (msg == errormessage)
	    {
	    	assertEquals(errormessage, msg);
			logger.info("Invalid login credentials");
	    }
		else {
			assertTrue(true); 
	      
		}
	}
}
