package com.dietician.stepDefinitions;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.RegisterPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageLogInHereLink extends BaseClass{
ReadConfig config=new ReadConfig();
	
	String baseurl=config.getApplicationURL();
	RegisterPage register = new RegisterPage(driver);
	
	@Given("User is on Register page")
	public void user_is_on_register_page() {
		logger.info("User is on Register page");
	}

	@When("User clicks {string} link.")
	public void user_clicks_link(String string) {
	   
		logger.info("User clicks on Log in here Link");
		register.clickLogInHere();
	}

	@Then("User is re-directed to Sign In Page")
	public void user_is_re_directed_to_sign_in_page() {
		logger.info("User redirected to Sign In page");
	}

}
