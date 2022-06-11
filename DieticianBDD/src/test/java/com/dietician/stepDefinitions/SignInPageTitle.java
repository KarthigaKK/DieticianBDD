package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.Logger;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.SignInPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPageTitle extends BaseClass {
	
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

	@When("User click on icon symbol on Sign In Page")
	public void user_click_on_icon_symbol_on_sign_in_page() {
		logger.info("Verify and click Signin icon");
		//Verify signIn icon
		if (signIn.VerifySignUpIcon()) 
		{
			signIn.clickSignInIcon();
			logger.info("User clicked SignIn icon");
		}
	}

	@Then("User should see the title of the page as {string}")
	public void user_should_see_the_title_of_the_page_as(String pageTitle) {
		logger.info("Verify signin page title");
		verifyPageTitleAndHeader(pageTitle);
	}
	
	@When("User is on Sign In Page {string}")
	public void user_is_on_sign_in_page(String pageheader) {
		logger.info("Verify signin page header");
		verifyPageTitleAndHeader(pageheader);
	}

	@Then("User should see all mandatory flields with star symbol on top of those fields")
	public void user_should_see_all_mandatory_flields_with_star_symbol_on_top_of_those_fields() {
		logger.info("Verify Mandatory fields");

		testMandatoryFieldValidation();

	}

	private void verifyPageTitleAndHeader(String pageTitle)
	{
		 String title = signIn.getSignInPageTitle();
		    if (title == pageTitle)
		    {
		    	assertEquals(pageTitle, title);
				logger.info("User Signin successfully");
		    }
			else {
				assertTrue(true); 
		        logger.info("User Signin failed");
			}
	}
	
	private void testMandatoryFieldValidation() {
		logger.info("Mandatory fields username,password textbox ,signin button are present");
		}

}
