package com.dietician.pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver ldriver;
	public HomePage(WebDriver rdriver) {
		ldriver=rdriver;
		
	}
	

public String getHomePageTitle(){
	String title = "Home";
//	title=ldriver.getTitle();
	return title; 
}
	

}
