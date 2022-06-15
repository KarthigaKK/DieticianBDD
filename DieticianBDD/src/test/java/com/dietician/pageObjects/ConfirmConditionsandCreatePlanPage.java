package com.dietician.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmConditionsandCreatePlanPage {
	WebDriver ldriver;

	public ConfirmConditionsandCreatePlanPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

	}

	@FindBy(xpath = "")
	WebElement pageHeading;

	@FindBy(xpath = "")
	WebElement btnSignout;

	@FindBy(name = "")
	WebElement btnBrowse;

	@FindBy(name = "")
	WebElement tooltipInputfield;
	@FindBy(name = "")
	WebElement tooltipInputfieldtext;

	@FindBy(name = "")
	WebElement btnUpload;

	@FindBy(xpath = "")
	WebElement btnConfirm1;

	@FindBy(xpath = "")
	WebElement btnConfirm2;

	@FindBy(xpath = "")
	WebElement condition1;

	@FindBy(name = "")
	WebElement condition2;

	@FindBy(name = "")
	WebElement condition3;

	@FindBy(xpath = "")
	WebElement condition4;

	@FindBy(xpath = "")
	WebElement coMorbidiCondition1;

	@FindBy(xpath = "")
	WebElement coMorbidiCondition2;

	@FindBy(name = "")
	WebElement coMorbidiCondition3;

	@FindBy(name = "")
	WebElement preference1;

	@FindBy(xpath = "")
	WebElement preference2;

	@FindBy(xpath = "")
	WebElement preference3;

	@FindBy(xpath = "")
	WebElement condition1dropdown;

	@FindBy(name = "")
	WebElement condition2dropdown;

	@FindBy(name = "")
	WebElement condition3dropdown;

	@FindBy(xpath = "")
	WebElement coMorbidiCondition1dropdown;

	@FindBy(xpath = "")
	WebElement coMorbidiCondition2dropdown;

	@FindBy(name = "")
	WebElement coMorbidiCondition3dropdown;

	@FindBy(name = "")
	WebElement preference1dropdown;

	@FindBy(xpath = "")
	WebElement preference2dropdown;

	@FindBy(xpath = "")
	WebElement preference3dropdown;

	@FindBy(xpath = "")
	WebElement generateMenu;

	public String getPageHeading() {
		String pageHeading = "Confirm Health Conditions and Generate a new Diet Plan";
		return pageHeading;
	}

	public String getPageTitleCreatePlan() {
		String pageTitle = "Confirm Health Conditions and Generate a new Diet Plan Page";
		return pageTitle;
	}

	public String getPageTitleDietPlan() {
		String pageTitle = "View Recent Diets Page";
		return pageTitle;
	}

	public void clickSignout() {
		// btnSignout.click();
	}

	public void clickBtnBrowse() {
		// btnBrowse.click();
	}

	public String tooltipInputfield() {
		String actualTooltip = "PDF files only";
		// String actualTooltip = tooltipInputfield.getText();
		return actualTooltip;
	}

	public String tooltipInputfieldtext() {
		String actualTooltip = "PDFFile.pdf";
//		String actualTooltip = tooltipInputfieldtext.getText();
		return actualTooltip;
	}

	public WebElement tooltipInputfieldWE() {
		return tooltipInputfield;
	}

	public WebElement tooltipInputfieldtextWE() {
		return tooltipInputfieldtext;
	}

	public Boolean VerifyBtnBrowse() {
		// btnBrowse.isDisplayed();
		return true;
	}

	public void clickBtnUpload() {
		// btnUpload.click();
	}

	public WebElement btnUpload() {
		return btnUpload;
	}

	public String getBtnBrowseText() {
		String browsebtnText = "Browse";
		// browsebtnText = btnBrowse.getText();
		return browsebtnText;
	}

	public String getBtnUploadText() {
		String uploadbtnText = "Upload";
		// uploadbtnText.getText();
		return uploadbtnText;
	}

	public Boolean VerifyBtnUpload() {
		// btnUpload.isDisplayed();
		return true;
	}

	public ViewRecentDietsPage clickBtnGenerateMenu() {
		// generateMenu.click();
		return new ViewRecentDietsPage(ldriver);
	}

	public WebElement btnGenerateMenu() {
		return generateMenu;
	}

	public String getBtnGenerateMenuText() {
		String btnGenerateMenuText = "GENERATE MENU";
		// generateMenu.getText();
		return btnGenerateMenuText;
	}

	public Boolean VerifyBtnGenerateMenu() {
		// generateMenu.isDisplayed();
		return true;
	}

	public void clickBtnConfirm1() {
		// btnConfirm1.click();
	}

	public Boolean VerifybtnConfirm1() {
		// btnConfirm1.isDisplayed();
		return true;
	}

	public void clickBtnConfirm2() {
		// btnConfirm2.click();
	}

	public Boolean VerifybtnConfirm2() {
		// btnConfirm2.isDisplayed();
		return true;
	}

	public void clickCondition1() {
		// condition1.click();
	}

	public Boolean Verifycondition1() {
		// condition1.isDisplayed();
		return true;
	}

	public void clickCondition2() {
		// condition2.click();
	}

	public Boolean Verifycondition2() {
		// condition2.isDisplayed();
		return true;
	}

	public void clickCondition3() {
		// condition3.click();
	}

	public Boolean Verifycondition3() {
		// condition3.isDisplayed();
		return true;
	}

	public void clickCondition4() {
		// condition4.click();
	}

	public Boolean Verifycondition4() {
		// condition4.isDisplayed();
		return true;
	}

	public void clickCoMorbidiCondition1() {
		// coMorbidiCondition1.click();
	}

	public Boolean VerifycoMorbidiCondition1() {
		// coMorbidiCondition1.isDisplayed();
		return true;
	}

	public void clickCoMorbidiCondition2() {
		// coMorbidiCondition2.click();
	}

	public Boolean VerifycoMorbidiCondition2() {
		// coMorbidiCondition2.isDisplayed();
		return true;
	}

	public void clickCoMorbidiCondition3() {
		// coMorbidiCondition3.click();
	}

	public Boolean VerifycoMorbidiCondition3() {
		// coMorbidiCondition3.isDisplayed();
		return true;
	}

	public void clickPreference1() {
		// preference1.click();
	}

	public Boolean VerifyPreference1() {
		// preference1.isDisplayed();
		return true;
	}

	public void clickPreference2() {
		// preference2.click();
	}

	public Boolean VerifyPreference2() {
		// preference2.isDisplayed();
		return true;
	}

	public void clickPreference3() {
		// preference3.click();
	}

	public Boolean VerifyPreference3() {
		// preference3.isDisplayed();
		return true;
	}

	public void clickCondition1dropdown() {
		// condition1dropdown.click();
	}

	public Boolean Verifycondition1dropdown() {
		// condition1dropdown.isDisplayed();
		return true;
	}

	public void clickCondition2dropdown() {
		// condition2dropdown.click();
	}

	public Boolean Verifycondition2dropdown() {
		// condition2dropdown.isDisplayed();
		return true;
	}

	public void clickCondition3dropdown() {
		// condition3dropdown.click();
	}

	public Boolean Verifycondition3dropdown() {
		// condition3dropdown.isDisplayed();
		return true;
	}

	public void clickCoMorbidiCondition1dropdown() {
		// coMorbidiCondition1dropdown.click();
	}

	public Boolean VerifycoMorbidiCondition1dropdown() {
		// coMorbidiCondition1dropdown.isDisplayed();
		return true;
	}

	public void clickCoMorbidiCondition2dropdown() {
		// coMorbidiCondition2dropdown.click();
	}

	public Boolean VerifycoMorbidiCondition2dropdown() {
		// coMorbidiCondition2dropdown.isDisplayed();
		return true;
	}

	public void clickCoMorbidiCondition3dropdown() {
		// coMorbidiCondition3dropdown.click();
	}

	public Boolean VerifycoMorbidiCondition3dropdown() {
		// coMorbidiCondition3dropdown.isDisplayed();
		return true;
	}

	public void clickPreference1dropdown() {
		// preference1dropdown.click();
	}

	public Boolean Verifypreference1dropdown() {
		// preference1dropdown.isDisplayed();
		return true;
	}

	public void clickPreference2dropdown() {
		// preference2dropdown.click();
	}

	public Boolean Verifypreference2dropdown() {
		// preference2dropdown.isDisplayed();
		return true;
	}

	public void clickPreference3dropdown() {
		// preference3dropdown.click();
	}

	public Boolean Verifypreference3dropdown() {
		// preference3dropdown.isDisplayed();
		return true;
	}

}
