package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.HomeLink;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeLinks extends BaseClass{

	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	HomeLink link = new HomeLink(driver);
	
	
	@Given("User is on Home page {string}")
	public void user_is_on_home_page(String HomeTitle) { 
		
		String title = link.getHomePageTitle();
	    if (title == HomeTitle)
	    {
	    	assertEquals(HomeTitle, title);
			logger.info("User is in HomePage");
	    }
		else {
	        logger.info("User is not in HomePage");
		}
		
	}
	

	@When("User clicks on PRODUCT Link on Home Page")
	public void user_clicks_on_product_link_on_home_page() {
	    
		link.clickProduct();
	}

	@Then("User is re-directed to  Product Page {string}")
	public void user_is_re_directed_to_product_page(String ProductTitle) {
	    
		String title = link.getProductPageTitle();
	    if (title == ProductTitle)
	    {
	    	assertEquals(ProductTitle, title);
			logger.info("User is in ProductPage");
	    }
		else {
	        logger.info("User is not in ProductPage");
		}
		
	}
	
	@When("User clicks on Client link on Home Page")
	public void user_clicks_on_client_link_on_home_page() {
		link.clickClient();
	}

	@Then("User is re-directed to  Client Testimonial Page {string}")
	public void user_is_re_directed_to_client_testimonial_page(String ClientTitle) {
	    
		String title = link.getClientPageTitle();
	    if (title == ClientTitle)
	    {
	    	assertEquals(ClientTitle, title);
			logger.info("User is in ClientPage");
	    }
		else {
	        logger.info("User is not in ClientPage");
		}
	}
	
	@When("User clicks on Team Link on Home Page")
	public void user_clicks_on_team_link_on_home_page() {
	    link.clickTeam();
	}

	@Then("User is directed to Doctor Team page {string}")
	public void user_is_directed_to_doctor_team_page(String TeamTitle) {
	    
		String title = link.getTeamPageTitle();
	    if (title == TeamTitle)
	    {
	    	assertEquals(TeamTitle, title);
			logger.info("User is in TeamPage");
	    }
		else { 
	        logger.info("User is not in TeamPage");
		}
	}
	
	@When("User clicks on REGISTER Link on Home Page")
	public void user_clicks_on_register_link_on_home_page() {
	   link.clickRegister();
	}

	@Then("User is directed to Register page {string}")
	public void user_is_directed_to_register_page(String RegisterTitle) {
		String title = link.getRegisterPageTitle();
	    if (title == RegisterTitle)
	    {
	    	assertEquals(RegisterTitle, title);
			logger.info("User is in RegisterPage");
	    }
		else {
	        logger.info("User is not in RegisterPage");
		}
		
	}
	
	@When("User clicks on About Link on Home page")
	public void user_clicks_on_about_link_on_home_page() {
	    link.clickAbout();
	}

	@Then("User is directed to About Page {string}")
	public void user_is_directed_to_about_page(String AboutTitle) {
		String title = link.getAboutPageTitle();
	    if (title == AboutTitle)
	    {
	    	assertEquals(AboutTitle, title);
			logger.info("User is in AboutPage");
	    }
		else {
	        logger.info("User is not in AboutPage");
		}
	}
	@When("User clicks on Featured link")
	public void user_clicks_on_featured_link() {
	    link.clickFeatured();
	}

	@Then("User is directed to Featured content page {string}")
	public void user_is_directed_to_featured_content_page(String FeaturedTitle) {
	    
		String title = link.getFeaturedPageTitle();
	    if (title == FeaturedTitle)
	    {
	    	assertEquals(FeaturedTitle, title);
			logger.info("User is in FeaturedPage");
	    }
		else {
	        logger.info("User is not in FeaturedPage");
		}
	}
	@When("User clicks on Blogs link")
	public void user_clicks_on_blogs_link() {
	    link.clickBlogs();
	}

	@Then("User is directed to Blogs Page {string}")
	public void user_is_directed_to_blogs_page(String BlogsTitle) {
	    
		String title = link.getBlogsPageTitle();
	    if (title == BlogsTitle)
	    {
	    	assertEquals(BlogsTitle, title);
			logger.info("User is in BlogsPage");
	    }
		else {
	        logger.info("User is not in BlogsPage");
		}
	}
	@When("User clicks on  Contact us link")
	public void user_clicks_on_contact_us_link() {
	    link.clickContactUs();
	}

	@Then("User is directed to Contact us Page {string}")
	public void user_is_directed_to_contact_us_page(String ContactTitle) {
		String title = link.getContactUsPageTitle();
	    if (title == ContactTitle)
	    {
	    	assertEquals(ContactTitle, title);
			logger.info("User is in ContactPage");
	    }
		else {
	        logger.info("User is not in ContactPage");
		}
	}
}
