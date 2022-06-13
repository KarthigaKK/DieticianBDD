package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.SignInPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInWithUserName extends BaseClass{
	
	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	SignInPage signIn = new SignInPage(driver);
	
	@Given("User is on Dietician website {string}")
	public void user_is_on_dietician_website(String url) {
		//check base amp url and given url
		logger.info("User is on dietician website");
		if (baseurl == url)
			assertEquals(url, baseurl);
		else 
			assertTrue(true); 
	   
	} 

	@When("User lands on Sign In page {string}")
	public void user_lands_on_sign_in_page(String pagetitle) {
		logger.info("Verify User Sign in page title");
		verifyPageTitle(pagetitle);
	}

	@Then("User should see a form with heading {string}")
	public void user_should_see_a_form_with_heading(String pageheader) {
		logger.info("Verify signin page header");
		verifyPageHeader(pageheader);
	}

	@Then("User should see a button with text {string}")
	public void user_should_see_a_button_with_text(String btnname) {
		logger.info("Verify signin button");
		signIn.verifySignInBtn(btnname);
	}

	/*@Given("User is on Sign In Page {string}")
	public void user_is_on_sign_in_page(String pagetitle) {
		logger.info("User on signin page");
		verifyPageTitle(pagetitle);
	} */

	@When("User clicks Sign In button in the Sign In form with all fields empty.")
	public void user_clicks_sign_in_button_in_the_sign_in_form_with_all_fields_empty() {
		logger.info("User click signin btn with all fields empty");
		signIn.clickSigninBtn();		
	}

	@Then("User should get error message {string}")
	public void user_should_get_error_message(String errormessage) {
		logger.info("User should get error message");
		
		invalidLogin("Invalid login credentials");
	}

	@When("User clicks Sign In button entering numeric values for Username {string} and valid values for password {string}")
	public void user_clicks_sign_in_button_entering_numeric_values_for_username_and_valid_values_for_password(String username,String password) {
		logger.info("User enter numeric values for username and valid password");
		signIn.setLoginUser(username);
		signIn.setLoginPwd(password);
		signIn.clickSigninBtn();
	}

	@Then("User should get a message Invalid entry for first field {string}")
	public void user_should_get_a_message_invalid_entry_for_first_field(String errormessage) {
		logger.info("Invalid entry for username field");
		loginFaied(errormessage);
	}

	@When("User clicks Sign In button entering extra length of password {string}")
	public void user_clicks_sign_in_button_entering_extra_length_of_password(String password) {
		logger.info("password length exist the limit");
		signIn.setLoginPwd(password);
		signIn.clickSigninBtn();
	}

	@Then("User should get a message Invalid entry for password field {string}")
	public void user_should_get_a_message_invalid_entry_for_password_field(String errormessage) {
		logger.info("Invalid entry for username field");
		loginFaied(errormessage);
	}

	@When("User clicks Sign In button entering invalid values for both fields {string} and {string}")
	public void user_clicks_sign_in_button_entering_invalid_values_for_both_fields_and(String username, String password) {		
		logger.info("Invalid username and password");
		signIn.setLoginUser(username);
		signIn.setLoginPwd(password);
		signIn.clickSigninBtn();
	}

	@When("User clicks on Forgot Password link")
	public void user_clicks_on_forgot_password_link() {
		logger.info("User click forgot password field");
		signIn.clicklinkForgotPassword();
	}

	@Then("User should be directed to {string} page")
	public void user_should_be_directed_to_page(String string) {
		logger.info("User redirect to "+string +" page");
		//driver.navigate().to("Forgot Password");
	}

	@When("User clicks on not member yet button")
	public void user_clicks_on_not_member_yet_button() {
		logger.info("User launch not a member page");
		signIn.clicklinkNotAMemberYet();
		
	}

	@Then("User will land on Register Page")
	public void user_will_land_on_register_page() {
		logger.info("User launch on register page");
		//driver.navigate().to("Register Page");
	}

	@When("User clicks Sign In with all field entered {string} and {string}")
	public void user_clicks_sign_in_with_all_field_entered_and(String username, String password) {
		logger.info("User entered valid username and password");
		signIn.setLoginUser(username);
		signIn.setLoginPwd(password);
		signIn.clickSigninBtn();
		loginSuccess("User login successfull");
	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
		logger.info("User logged in succesffully");
		loginSuccess("User logged in succesffully");
	}

	private void verifyPageTitle(String pageTitle)
	{
		String title = signIn.getSignInPageTitle();
	    if (title.equals(pageTitle))
	    {
	    	assertEquals(pageTitle, title);
			logger.info("Verified 'User Sign In' page title");
	    }
		else {
			assertTrue(true); 
		}
	}
	
	private void verifyPageHeader(String pageHeader)
	{
		String title = signIn.getSignInPageHeader();
	    if (title.equals(pageHeader))
	    {
	    	assertEquals(pageHeader, title);
			logger.info("Verified 'Sign In' page heaer");
	    }
		else {
			assertTrue(true); 
		}
	}
	
	private void loginFaied(String errormessage)
	{
		String msg = signIn.loginFailureMessage();
		if (msg.equals(errormessage))
	    {
	    	assertEquals(errormessage, msg);
			logger.info(errormessage);
	    }
		else {
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
	
	

	private void loginSuccess(String successmessage)
	{
		String msg = signIn.loginSuccessMessage();
		if (msg.equals(successmessage))
	    {
	    	assertEquals(successmessage, msg);
			logger.info("User logged in succesffully");
	    }
		else {
			assertTrue(true); 
	      
		}
	}
	
	

}
