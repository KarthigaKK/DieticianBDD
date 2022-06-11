package com.dietician.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.dietician.utilities.ReadConfig;


public class SignInPage {
	WebDriver ldriver;
	ReadConfig config=new ReadConfig();
	public SignInPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	@FindBy (xpath="")
	WebElement UserSignInIcon;
	
	@FindBy (name="")
	WebElement txtUserName;
	
	@FindBy (name="")
	WebElement txtPassword;
	
	@FindBy (xpath="")
	WebElement btnSignin;
	
	@FindBy (xpath="")
	WebElement loginSuccessMessage;

	
	public void clickSignInIcon() {
		//TODO Get sign in icon from siginin page
		//UserSignInIcon.click();
	}
	
	public void setLoginUser(String loginuser) {
		//TODO send username to username textbox
		 //txtUserName.sendKeys(loginuser);	
	}
	
	public void setLoginPwd(String loginpwd) {
		//TODO send password to password textbox
		// txtPassword.sendKeys(loginpwd);
		
	}
	
	public void clickSigninBtn() {
		//TODO click signin button
		//btnSignin.click();
	}
	
	public String loginSuccessMessage() {
		//TODO verify login success message
		return loginSuccessMessage.getText();
	}
	
	public boolean VerifySignUpIcon(){
		//TODO verify signup icon 
		return true;  //UserSignInIcon.isDisplayed();
	}
		
	public String getSignInPageTitle(){
		String title = "User Sign In";
		//title = ldriver.getTitle();
		return title; 
	}
	
	
}
