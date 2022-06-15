package com.dietician.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLink {

	WebDriver ldriver;
	public HomeLink(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy (xpath="")
	WebElement Product;
	
	@FindBy (xpath="")
	WebElement Client;
	
	@FindBy (xpath="")
	WebElement Team;
	
	@FindBy (xpath="")
	WebElement Register;
	
	@FindBy (xpath="")
	WebElement About;
	
	@FindBy (xpath="")
	WebElement Featured;
	
	@FindBy (xpath="")
	WebElement Blogs;
	
	@FindBy (xpath="")
	WebElement ContactUs;
	
	public void clickProduct() {
//		Product.click();
	}
	
	public void clickClient() {
//		Client.click();
	}
	
	public void clickTeam() {
//		Team.click();
	}
	
	public void clickRegister() {
//		Register.click();
	}
	
	public void clickAbout() {
//		About.click();
	}
	public void clickFeatured() {
//		Featured.click();
	}
	
	public void clickBlogs() {
//		Blogs.click();
	}
	
	public void clickContactUs() {
//		ContactUs.click();
	}
	
	public String getHomePageTitle(){
		String titleHome = "Home";
		return titleHome; 
	}
	
	public String getProductPageTitle(){
		String titleProduct = "Product";
		return titleProduct; 
	}
	
	public String getClientPageTitle(){
		String titleClient = "Client";
		return titleClient; 
	}
	
	public String getTeamPageTitle(){
		String titleTeam = "Team";
		return titleTeam; 
	}
	
	public String getRegisterPageTitle(){
		String titleRegister = "Register";
		return titleRegister; 
	}
	
	public String getAboutPageTitle(){
		String titleAbout = "About";
		return titleAbout; 
	}
	
	public String getFeaturedPageTitle(){
		String titleFeatured = "FeaturedContent";
		return titleFeatured; 
	}
	public String getBlogsPageTitle(){
		String titleBlogs = "Blogs";
		return titleBlogs; 
	}
	public String getContactUsPageTitle(){
		String titleContactUs = "ContactUs";
		return titleContactUs; 
	}
}
