package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.HomePage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Then;

public class HomePageTitle extends BaseClass{

	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	HomePage Home = new HomePage(driver);
	

	@Then("User should see the title of the page as {string}")
	public void user_should_see_the_title_of_the_page_as(String HomeTitle) {
		
		String title = Home.getHomePageTitle();
	    if (title == HomeTitle)
	    {
	    	assertEquals(HomeTitle, title);
			logger.info("User is in HomePage");
	    }
		else {
	        logger.info("User is not in HomePage");
		}
		
	}
	
}
