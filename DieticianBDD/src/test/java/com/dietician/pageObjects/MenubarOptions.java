package com.dietician.pageObjects;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenubarOptions {

	WebDriver ldriver;
	public MenubarOptions(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy (xpath="")
	WebElement Product;
	
	@FindBy (xpath="")
	WebElement Clients;
	
	@FindBy (xpath="")
	WebElement Team;
	
	@FindBy (xpath="")
	WebElement Register;
	
	@FindBy (xpath="")
	WebElement About;
	
	@FindBy (xpath="")
	WebElement Featured;
	
	@FindBy (xpath="")
	WebElement Blog;
	
	@FindBy (xpath="")
	WebElement ContactUs;
	
	@FindBy (xpath="")
	WebElement SearchIcon;
	
	@FindBy (xpath="")
	WebElement SignInButton;
	
	@FindBy (xpath="")
	WebElement Logo;
	
	public boolean LogoVisibility() {
		return Logo.isDisplayed();
	}
	
//	public boolean isOnBrowser() {
//		return StringUtils.isNotEmpty(ldriver.getWindowHandle());
//	}
	
	public boolean ProductNameVisibility() {
		return Product.isDisplayed();
	}
	
	public boolean ClientsNameVisibility() {
		return Clients.isDisplayed();
	}
	
	public boolean TeamNameVisibility() {
		return Team.isDisplayed();
	}
	
	public boolean RegisterNameVisibility() {
		return Register.isDisplayed();
	}
	
	public boolean AboutNameVisibility() {
		return About.isDisplayed();
	}
	
	public boolean FeaturedNameVisibility() {
		return Featured.isDisplayed();
	}
	
	public boolean BlogNameVisibility() {
		return Blog.isDisplayed();
	}
	
	public boolean ContactUsNameVisibility() {
		return ContactUs.isDisplayed();
	}
	
	public boolean SearchIconVisibility() {
		return SearchIcon.isDisplayed();
	}
	
	public boolean SignInButtonVisibility() {
		return SignInButton.isDisplayed();
	}
}
