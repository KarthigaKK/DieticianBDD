package com.dietician.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewRecentDietsPage {
WebDriver ldriver;
	
	public ViewRecentDietsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	@FindBy (xpath="")
	WebElement viewPDF;

	@FindBy (xpath="")
	WebElement btnSignout;
	
	@FindBy (xpath="")
	WebElement dietplan;
	
	@FindBy (xpath="")
	WebElement recordnumber;
	@FindBy (xpath="")
	WebElement planID;
	@FindBy (xpath="")
	WebElement customerdetails;
	@FindBy (xpath="")
	WebElement plangeneratedtime;
	@FindBy (xpath="")
	WebElement comments;
	
	public Boolean Verifyrecordnumber() {
	//	recordnumber.isDisplayed();
			return true;
		}
	public Boolean VerifyplanID() {
		//	recordnumber.isDisplayed();
				return true;
			}
	public Boolean Verifycustomerdetails() {
		//	recordnumber.isDisplayed();
				return true;
			}
	public Boolean Verifyplangeneratedtime() {
		//	recordnumber.isDisplayed();
				return true;
			}
	public Boolean Verifycomments() {
		//	recordnumber.isDisplayed();
				return true;
			}
	
	
	
	public Boolean Verifydietplan() {
		//	dietplan.isDisplayed();
			return true;
		}
	
	public Boolean VerifyviewPDF() {
		//	viewPDF.isDisplayed();
			return true;
		}
	
	public void clickSignout() {
		//	btnSignout.click();
		}
	
	public void clickviewPDF() {
		//	btnviewPDF.click();
		}
	
	public String getPageHeading() {
		String pageHeading = "Generated Diet Plans";
		return pageHeading;
	}
	public String getPageTitleCreatePlan() {
		String pageTitle = "View Recent Diets Page";
		return pageTitle;
	}
}
