package com.dietician.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

	
	WebDriver ldriver;
	public ContactUsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy (xpath="")
	WebElement FirstName;
	
	@FindBy (xpath="")
	WebElement LastName;
	
	@FindBy (xpath="")
	WebElement Email;
	
	@FindBy (xpath="")
	WebElement Subject;
	
	@FindBy (xpath="")
	WebElement Message;
	
	@FindBy (xpath="")
	WebElement SubmitButton;
	
	@FindBy (xpath="")
	WebElement FillAllFieldsMsg;
	
	@FindBy (xpath="")
	WebElement FillWithValidFirstName;
	
	@FindBy (xpath="")
	WebElement FillWithValidLastName;
	
	@FindBy (xpath="")
	WebElement FillWithValidEmail;
	
	@FindBy (xpath="")
	WebElement FillWithValidSubject;
	
	@FindBy (xpath="")
	WebElement FillWithValidMessage;
	
	@FindBy (xpath="")
	WebElement RequestSubmit;
	
	public void numericFirstName() {
//		FirstName.sendKeys("12345");
	}
	
	public void validFirstName() {
//		FirstName.sendKeys("padmapriya");
	}
	
	public void numericLastName() {
//		LastName.sendKeys("12345");
	}
	
	public void validLastName() {
//		LastName.sendKeys("padmapriya");
	}

	public void numericEmail() {
//		Email.sendKeys("12345");
	}
	public void validEmail() {
//		Email.sendKeys("padma@gmail.com");
	}
	
	public void numericSubject() {
//		Subject.sendKeys("12345");
	}
	
	public void validSubject() {
//		Subject.sendKeys("Dietician");
	}
	
	public void numericMessage() {
//		Message.sendKeys("12345");
	}
	
	public void validMessage() {
//		Message.sendKeys("");
	}
	
	public void clickSubmitButton() {
//		SubmitButton.click();
	}
	
	public boolean plsfillallfieldsmsgVisibility() {
		return true; // FillAllFieldsMsg.isDisplayed();
	}
	
	public boolean plsfillwithvalidFirstNamemsgVisibility() {
		return true;  //FillWithValidFirstName.isDisplayed();
	}
	
	public boolean plsfillwithvalidLastNamemsgVisibility() {
		return true; // FillWithValidLastName.isDisplayed();
	}
	
	public boolean plsfillwithvalidEmailmsgVisibility() {
		return true;  //FillWithValidEmail.isDisplayed();
	}
	
	public boolean plsfillwithvalidSubjectmsgVisibility() {
		return true;  //FillWithValidSubject.isDisplayed();
	}
	
	public boolean plsfillwithvalidWriteMessageVisibility() {
		return true; //FillWithValidMessage.isDisplayed();
	}
	
	public boolean MsgRequestSubmitvisibility() {
		return true;  //RequestSubmit.isDisplayed();
	}
	
	public String getContactPageTitle(){
		String title = "ContactUs";
//		title=ldriver.getTitle();
		return title; 
	}
	
	
}
