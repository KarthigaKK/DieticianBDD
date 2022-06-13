package com.dietician.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dietician.utilities.ReadConfig;

public class DieticianHomePage {
	
	WebDriver ldriver;
	ReadConfig config = new ReadConfig();

	public DieticianHomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

	}

	@FindBy(xpath = "")
	WebElement menuHome;

	@FindBy(xpath = "")
	WebElement menuNewPatient;
	
	@FindBy(name = "")
	WebElement menuMyPatients;

	@FindBy(name = "")
	WebElement menuDietPlans;

	@FindBy(xpath = "")
	WebElement menuUserIcon;

	@FindBy(xpath = "")
	WebElement contentBannerorAnnouncements;
	
	@FindBy(xpath = "")
	WebElement pageImageAndContent;

	@FindBy(xpath = "")
	WebElement lblDieticianName;
	
	@FindBy(xpath = "")
	WebElement btnSignOut;
	

	
	public void clickMenuHome() {
		// TODO Get menu home from dietician page
		// clickMenuHome.click();
	}
	
	public void clickMenuNewPatient() {
		// TODO Get menu new patient from dietician page
		// clickMenuHome.click();
	}
	
	public void clickMenuMyPatients() {
		// TODO Get menu My Patients from dietician page
		// clickMyPatients.click();
	}
	
	public void clickMenuDietPlans() {
		// TODO Get menu My Patients from dietician page
		// clickMenuDietPlans.click();
	}
	
	public void clickMenuUserIcon() {
		// TODO Get menu My Patients from dietician page
		// clickMenuUserIcon.click();
	}

	public String getLabelDieticianName() {
		// TODO Get dietician name from dietician page
		String dieticianName="Paul";
		return dieticianName;
	}
	
	public void clickBtnSignOut() {
		// TODO click signout from dietician page
		// btnSignOut.click();
	}
	
	public boolean verifyBtnSignOut() {
		// TODO click signout from dietician page
		return true;// btnSignOut.isDisplayed();
	}
	
	public boolean VerifyHomeMenu() {
		// TODO verify home menu
		return true; // menuHome.isDisplayed();
	}
	
	public boolean VerifyMenuNewPatient() {
		// TODO verify New Patient menu
		return true; // menuNewPatient.isDisplayed();
	}
	
	public boolean VerifyMenuMyPatients() {
		// TODO verify My patients menu
		return true; // menuMyPatients.isDisplayed();
	}
	
	public boolean VerifyMenuDietPlans() {
		// TODO verify Diet plans menu
		return true; // menuDietPlans.isDisplayed();
	}
	
	public String getDieticianName(String DieticianName) {
		String dieticianName="paul";
		// TODO verify Diet plans menu
		return dieticianName; // lblDieticianName.isDisplayed();
	}
	public boolean VerifycontentBannerorAnnouncements() {
		// TODO verify contentBannerorAnnouncements section
		return true; // contentBannerorAnnouncement.isDisplayed();
	}
	
	public boolean verifyPageImageAndContent(){
		// TODO verify PageImageAndContent
		return true; // pageImageAndContent.isDisplayed();
	}
	public String getDieticianHomePageTitle() {
		String title = "Dietician Home";
		// title = ldriver.getTitle();
		return title;
	}
	
	public String getNewPatientPageTitle() {
		String title = "Add New Patient";
		// title = ldriver.getTitle();
		return title;
	}
	
	public String getMyPatientPageTitle() {
		String title = "My patient";
		// title = ldriver.getTitle();
		return title;
	}
	
	public String getViewRecentDietsPageTitle() {
		String title = "View Recent Diets";
		// title = ldriver.getTitle();
		return title;
	}
}
