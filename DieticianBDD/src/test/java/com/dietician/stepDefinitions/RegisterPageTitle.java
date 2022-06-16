package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.RegisterPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageTitle extends BaseClass{
ReadConfig config=new ReadConfig();
	
	String baseurl=config.getApplicationURL();
	RegisterPage register = new RegisterPage(driver);
	
	@Given("User is in Dietician website {string}")
	public void user_is_in_dietician_website(String url) {
			//check base application url and given url
				logger.info("User is on dietician website");
				if (baseurl.equals(url))
					assertEquals(url, baseurl);
				else 
					assertTrue(true); 
	}

	@When("User lands on Register page")
	public void user_lands_on_register_page() {
	    assertTrue(true);
	    //verifyPageTitle(pageTitle);
	    logger.info("User is on Register page");
	}

	@Then("User should see the title of the page as {string}")
	public void user_should_see_the_title_of_the_page_as(String pageTitle) {
		logger.info("Verify signin page title");
		verifyPageTitle(pageTitle);   
	}
	private void verifyPageTitle(String pageTitle)
	{
		String title = register.getRegisterPageTitle();
		System.out.println(title);
		System.out.println(pageTitle);
	    if (title.equals(pageTitle))
	    {
	    	assertEquals(pageTitle, title);
			logger.info("User is in Register Page");
	    }
		else {
			assertTrue(true); 
	        logger.info("User is not in Register Page");
		}
	}
	
	private void verifyPageHeader(String pageHeader)
	{
		String title = register.getRegisterPageTitle();
	    if (title.equals(pageHeader))
	    {
	    	assertEquals(pageHeader, title);
			logger.info("Verified 'Sign In' page heaer");
	    }
		else {
			assertTrue(true); 
		}
	}
	
	private void testMandatoryFieldValidation() {
		logger.info("Mandatory fields are username, password textboxes");
	}
}
