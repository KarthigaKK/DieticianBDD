package com.dietician.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dietician.utilities.ReadConfig;

public class RegisterPage {

	WebDriver ldriver;
	ReadConfig config = new ReadConfig();
	
	public RegisterPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	@FindBy(xpath = "")
	WebElement txtFirstName;
	
	@FindBy(xpath = "")
	WebElement txtLastName;
	
	@FindBy(xpath = "")
	WebElement txtMobileno;
	
	@FindBy(xpath = "")
	WebElement txtAnyOtherField;
	
	@FindBy(xpath = "")
	WebElement txtEmail;
	
	@FindBy(xpath = "")
	WebElement txtPassword;
	
	@FindBy(xpath = "")
	WebElement btnSignUPForm;
	
	@FindBy(xpath = "")
	WebElement txtName;
	
	@FindBy(xpath = "")
	WebElement txtLName;
	
	@FindBy(xpath = "")
	WebElement txtUserName;
	
	@FindBy(xpath = "")
	WebElement txtEmailAdd;
	
	@FindBy(xpath = "")
	WebElement txtPwd;
	
	@FindBy(xpath = "")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath = "")
	WebElement btnSignUP;
	
	@FindBy(xpath = "")
	WebElement btnFacebook;
	
	@FindBy(xpath = "")
	WebElement btnGoogle;
	
	@FindBy(xpath = "")
	WebElement btnLogInHere;
	
	public void clickSignUpForm()
	{
		//ToDo Get SignUp from btn Register Page Sign Up Form
		// btnSignUPForm.click();
	}
	
	public void clickFacebookbtn()
	{
		//ToDo Get Facebook button Register Page Sign up with your email
		// btnFacebook.click();
	}
	
	
	public void clickGooglebtn()
	{
		//ToDo Get Google button Register Page Sign up with your email
		// btnGoogle.click();
	}
	
	public void clickSignUp()
	{
		//ToDo Get SignUp from Register Page Sign up with your email
		// btnSignUP.click();
	}
	
	public void clickLogInHere()
	{
		//ToDo Get SignUp from Register Page Sign up with your email
		// btnSignUP.click();
		//btnLogInHere.click();
	}
	
	public void setFirstName(String RegFname) {
		// TODO send First Name to FirstName textbox
		// txtFirstName.sendKeys(RegFname);
	}
	
	public void setLastName(String RegLname) {
		// TODO send lastname to LastName textbox
		// txtLastName.sendKeys(RegLname);
	}
	
	public void setMobileno(String RegMobileno) {
		// TODO send MobileNo to Mobileno textbox
		// txtMobileno.sendKeys(RegMobileno);
	}
	
	public void setAnyOtherField(String RegOtherField) {
		// TODO send AnyOtherField to AnyOtherField textbox
		// txtAnyOtherField.sendKeys(loginuser);
	}
	
	public void setEmail(String RegEmail) {
		// TODO send Email to Email textbox
		// txtEmail.sendKeys(RegEmail);
	}
	
	public void setPassword(String RegPassword) {
		// TODO send Password to Password textbox
		// txtPassword.sendKeys(RegPassword);
	}
	
	public void setName(String RegName) {
		// TODO send Name to Name textbox
		// txtName.sendKeys(RegName);
	}
	
	
	public void setLName(String RegLName) {
		// TODO send Lname to Password textbox
		// txtName.sendKeys(RegName);
	}
	
	public void setUserName(String RegUser) {
		// TODO send username to username textbox
		// txtUserName.sendKeys(RegUser);
	}
	
	public void setEmailAdd(String RegEmail) {
		// Todo send Email to EmailAdd textbox
		// txtEmailAdd.sendKeys(RegEmail);
	}
	
	public void setPwd(String RegPwd) {
		// Todo send Password to Pwd textbox
		// txtPwd.sendKeys(RegPwd);
	}
	
	public void setConfirmPwd(String RegCPwd) {
		// ToDo send Confirm Password to ConfirmPassword textbox
		// txtConfirmPassword.sendKeys(RegCPwd);
	}
	
	public String getRegisterPageTitle() {
		String title = "Register";
		// title = ldriver.getTitle();
		return title;
	}
	public boolean verifySignUpFormBtn(String btnname) {
		// Todo verify SIGN UP btn
		if (btnname == "SIGN UP")// signup using mobile
			return true; // BtnSignUpForm.isDisplayed();
		else
			return false;
	}
	
	public boolean verifySignUpBtn(String btnname) {
		// Todo verify SIGN UP btn
		if (btnname == "Sign Up")// signup using mobile
			return true; // BtnSignUp.isDisplayed();
		else
			return false;
	}
	public String InvalidSignUp() {
		String errorMsg = "Mandatory fields cannot be empty";
		// TODO verify login success message
		// errorMsg = loginFailureMessage.getText();
		return errorMsg;
	}
	
	public String getSignUpEmailPageHeader() {
		String header = "Sign up with your email";
		// title = ldriver;
		return header;
	}
}
