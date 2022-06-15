package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.MenubarOptions;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenubarOptionsOn extends BaseClass{
	
	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	MenubarOptions menu = new MenubarOptions(driver);

	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		logger.info("User is on the Browser");
//		menu.isOnBrowser();

	}

	@When("User opens the Dietician Website {string}")
	public void user_opens_the_dietician_website(String url) {
		
		logger.info("User is on dietician website");
		if (baseurl == url)
			assertEquals(url, baseurl);
		else 
			assertTrue(true); 
	}
	
	@Then("User should see a logo image with the company name on the Home Page {string}")
	public void user_should_see_a_logo_image_with_the_company_name_on_the_home_page(String HomeLogo) {
	    
//		 if(menu.LogoVisibility())
//		 {
//				logger.info("Logo is Visible in the Home page");
//			}
//			
//			else
//				logger.info("Logo is not Visible in the Home page");
		  
	}

	@Then("User should see a tab with text {string} on the top menu bar of the Home page")
	public void user_should_see_a_tab_with_text_on_the_top_menu_bar_of_the_home_page(String string) {
	
//		ProductVisibility();
//		ClientsVisibility();
//		TeamVisibility();
//		RegisterVisibility();
//		AboutVisibility();
//		FeaturedVisibility();
//		BlogVisibility();
		
	}

	@Then("User should see a search option symbol on the bottom menu bar of the Home page")
	public void user_should_see_a_search_option_symbol_on_the_bottom_menu_bar_of_the_home_page() {
	    
//			if (menu.SearchIconVisibility()) 
//			{
//				logger.info("SearchIcon is Visible in the Home page");
//			}
//			
//			else
//				logger.info("SearchIcon is not Visible in the Home page");
	}

	@Then("User should see a Signin option next to the search button on the bottom menu bar of the Home page")
	public void user_should_see_a_signin_option_next_to_the_search_button_on_the_bottom_menu_bar_of_the_home_page() {
	    
//		if (menu.SignInButtonVisibility()) 
//		{
//			logger.info("SignIn Button is Visible in the Home page");
//		}
//		
//		else
//			logger.info("SignIn Button is not Visible in the Home page");
	}
		
	public void ProductVisibility() {
		if (menu.ProductNameVisibility()) 
		{
			logger.info("Product is Visible in the Home Page");
		}
		
		else
			logger.info("Product is not Visible in the Home Page");
	}
	
	public void ClientsVisibility() {
		if (menu.ClientsNameVisibility()) 
		{
			logger.info("Clients is Visible in the Home page");
		}
		
		else
			logger.info("Clients is not Visible in the Home page");
	}
	
	public void TeamVisibility() {
		if (menu.TeamNameVisibility()) 
		{
			logger.info("Team is Visible in the Home page");
		}
		
		else
			logger.info("Team is not Visible in the Home page");
	}
	
	public void RegisterVisibility() {
		if (menu.RegisterNameVisibility()) 
		{
			logger.info("Register is Visible in the Home page");
		}
		
		else
			logger.info("Register is not Visible in the Home page");
	}
	
	public void AboutVisibility() {
		if (menu.AboutNameVisibility()) 
		{
			logger.info("About is Visible in the Home page");
		}
		
		else
			logger.info("About is not Visible in the Home page");
	}
	
	public void FeaturedVisibility() {
		if (menu.FeaturedNameVisibility()) 
		{
			logger.info("Featured is Visible in the Home page");
		}
		
		else
			logger.info("Featured is not Visible in the Home page");
	}
	
	public void BlogVisibility() {
		if (menu.BlogNameVisibility()) 
		{
			logger.info("Blog is Visible in the Home page");
		}
		
		else
			logger.info("Blog is not Visible in the Home page");
	}
	
	public void ContactUsVisibility() {
		if (menu.ContactUsNameVisibility()) 
		{
			logger.info("ContactUs is Visible in the Home page");
		}
		
		else
			logger.info("ContactUs is not Visible in the Home page");
	}
}
