package com.dietician.stepDefinitions;
import com.dietician.base.BaseClass;
import com.dietician.pageObjects.RegisterPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSignUpWithGoogle extends BaseClass{
ReadConfig config=new ReadConfig();
	
	String baseurl=config.getApplicationURL();
	RegisterPage register = new RegisterPage(driver);
	

	@When("User clicks Google Button in the Sign Up with your Email form.")
	public void user_clicks_google_button_in_the_sign_up_with_your_email_form() {
		logger.info("User clicks on Google Button");
	}

	@Then("User successfully login with Google account.")
	public void user_successfully_login_with_google_account() {
		logger.info("User redirected to Google login page");
	}
	
}
