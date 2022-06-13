package com.dietician.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dietician.utilities.ReadConfig;

public class SignInPage {
	WebDriver ldriver;
	ReadConfig config = new ReadConfig();

	public SignInPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

	}

	@FindBy(xpath = "")
	WebElement UserSignInIcon;

	@FindBy(xpath = "")
	WebElement UserLoginIcon;
	
	@FindBy(name = "")
	WebElement txtUserName;

	@FindBy(name = "")
	WebElement txtPassword;

	@FindBy(xpath = "")
	WebElement btnSignin;

	@FindBy(xpath = "")
	WebElement loginSuccessMessage;

	@FindBy(xpath = "")
	WebElement loginFailureMessage;

	@FindBy(xpath = "")
	WebElement linkForgotPasssword;
	
	@FindBy(xpath = "")
	WebElement linkNotAMemberYet;
	
	@FindBy(xpath = "")
	WebElement clickFacebookBtn;
	
	@FindBy(xpath = "")
	WebElement clickGoogleBtn;
	
	@FindBy(xpath = "")
	WebElement linkSignUp;
	
	public void clickSignInIcon() {
		// TODO Get sign in icon from siginin page
		// UserSignInIcon.click();
	}
	
	public void clickFacebookBtn() {
		// TODO Get facebook btn from siginin page
		// clickFacebookBtn.click();
	}
	
	public void clickGoogleBtn() {
		// TODO Get google btn from siginin page
		// clickGoogleBtn.click();
	}
	
	public void clicklinkSignUp() {
		// TODO Get sign up from siginin page
		// clicklinkSignUp.click();
	}
	public void clickLoginIcon() {
		// TODO Get sign in icon from Login page
		// UserLoginIcon.click();
	}


	public void setLoginUser(String loginuser) {
		// TODO send username to username textbox
		// txtUserName.sendKeys(loginuser);
	}
	
	public void setLoginEmail(String loginemail) {
		// TODO send username to username textbox
		// txtUserName.sendKeys(loginuser);
	}

	public void setLoginPwd(String loginpwd) {
		// TODO send password to password textbox
		// txtPassword.sendKeys(loginpwd);

	}

	public void clickSigninBtn() {
		// TODO click signin button
		// btnSignin.click();
	}

	public void clicklinkForgotPassword() {
		// TODO click signin button
		// linkForgotPasssword.click();
	}

	public void clicklinkNotAMemberYet() {
		// TODO click signin button
		// linkNotAMemberYet.click();
	}
	public String loginSuccessMessage() {
		String successMsg = "User logged in succesffully";
		// TODO verify login success message
		return successMsg;
	}

	public String loginFailureMessage() {
		String errorMsg = "Username and Password is invalid";
		// TODO verify login success message
		// errorMsg = loginFailureMessage.getText();
		return errorMsg;
	}

	public String InvalidLogin() {
		String errorMsg = "Invalid login credentials";
		// TODO verify login success message
		// errorMsg = loginFailureMessage.getText();
		return errorMsg;
	}

	public boolean VerifySignUpIcon() {
		// TODO verify signup icon
		return true; // UserSignInIcon.isDisplayed();
	}

	public void validateRequiredFields() {

	}

	public String getSignInPageTitle() {
		String title = "User Sign In";
		// title = ldriver.getTitle();
		return title;
	}

	public String getSignInPageHeader() {
		String header = "Sign In";
		// title = ldriver
		return header;
	}

	public String getSignInEmailPageHeader() {
		String header = "Log in with your email";
		// title = ldriver
		return header;
	}
	public boolean verifySignInBtn(String btnname) {
		// TODO verify sign in btn
		if (btnname == "Sign In")
			return true; // SignInBtn.isDisplayed();
		else
			return false;
	}
	
	public boolean verifyLogInBtn(String btnlogin) {
		// TODO verify sign in btn
		if (btnlogin == "Log in")
			return true; // SignInBtn.isDisplayed();
		else
			return false;
	}
}
