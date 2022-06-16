package com.dietician.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeamsPage {

	WebDriver ldriver;

	public TeamsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

	}

	@FindBy(xpath = "")
	WebElement Team;

	@FindBy(xpath = "")
	WebElement Doctorname1;

	@FindBy(xpath = "")
	WebElement Doctorname2;

	@FindBy(xpath = "")
	WebElement Doctorname3;
	
	@FindBy(xpath = "")
	WebElement NextButton;
	
	@FindBy(xpath = "")
	WebElement Doctorname4;

	@FindBy(xpath = "")
	WebElement Doctorname5;

	@FindBy(xpath = "")
	WebElement Doctorname6;
	
	@FindBy(xpath = "")
	WebElement Doctorname7;

	@FindBy(xpath = "")
	WebElement Doctorname8;

	@FindBy(xpath = "")
	WebElement Doctorname9;
	
	@FindBy(xpath = "")
	WebElement PreviousButton;
	

	public void clickTeam() {
//		Team.click();
	}

	public void clickNextButton() {
//		NextButton.click();
	}
	
	public void clickPreviousButton() {
//		PreviousButton.click();
	}
	
	public boolean clickNextButtondisabled() {
		return true; //NextButton.isEnabled();
	}
	
	public boolean clickPreviousButtondisabled() {
		return true; //PreviousButton.isEnabled();
	}
	
	public String getTeamPageTitle() {
		String titleTeam = "Team";
		return titleTeam;
	}

	public boolean Doctor1Visibility() {
		return true; //Doctorname1.isDisplayed();
	}

	public boolean Doctor2Visibility() {
		return true; //Doctorname2.isDisplayed();
	}

	public boolean Doctor3Visibility() {
		return true; //Doctorname3.isDisplayed();
	}
	
	public boolean Doctor4Visibility() {
		return true; //Doctorname4.isDisplayed();
	}

	public boolean Doctor5Visibility() {
		return true; //Doctorname5.isDisplayed();
	}

	public boolean Doctor6Visibility() {
		return true; //Doctorname6.isDisplayed();
	}
	
	public boolean Doctor7Visibility() {
		return true; //Doctorname7.isDisplayed();
	}

	public boolean Doctor8Visibility() {
		return true; //Doctorname8.isDisplayed();
	}

	public boolean Doctor9Visibility() {
		return true; //Doctorname9.isDisplayed();
	}
}