package com.dietician.stepDefinitions;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.RegisterPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSignUpWithFacebook extends BaseClass{
ReadConfig config=new ReadConfig();
	
	String baseurl=config.getApplicationURL();
	RegisterPage register = new RegisterPage(driver);
	

	@When("User clicks Facebook Button in the Sign Up with your Email form.")
	public void user_clicks_facebook_button_in_the_sign_up_with_your_email_form() {
	    logger.info("User clicks on Facebook Button");
	}

	@Then("User successfully login with Facebook account.")
	public void user_successfully_login_with_facebook_account() {
		logger.info("User redirected to facebook login page");
	}
	
	
}
