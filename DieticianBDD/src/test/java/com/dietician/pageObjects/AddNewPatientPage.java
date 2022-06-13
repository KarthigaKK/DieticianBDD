package com.dietician.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dietician.utilities.ReadConfig;

public class AddNewPatientPage {
	WebDriver ldriver;
	ReadConfig config = new ReadConfig();

	public AddNewPatientPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

	}
	
	@FindBy(xpath = "")
	WebElement txtFullName;

	@FindBy(xpath = "")
	WebElement txtAddressLine1;
	
	@FindBy(xpath = "")
	WebElement txtAddressLine2;

	By drpCountry=By.xpath("");
	
	@FindBy(xpath = "")
	WebElement txtCity;
	
	@FindBy(xpath = "")
	WebElement txtState;
	
	@FindBy(xpath = "")
	WebElement txtPostalCode;
	
	@FindBy(xpath = "")
	WebElement txtEmail;
	
	@FindBy(xpath = "")
	WebElement txtPhoneNumber;
	
	@FindBy(xpath = "")
	WebElement btnUpdate;
	
	public void clickBtnUpdate()
	{
		// TODO Get update btn from Add New Patient page
		//btnUpdate.click();
	}
	
	public void setCountry(String value)
	{
		//Select drp=new Select(ldriver.findElement(drpCountry));
		//drp.selectByVisibleText(value);
	}
	
	public void setFullName(String fullname) {
		// TODO send fullname to fullname textbox
		// txtFullName.sendKeys(fullname);
	}
	
	public void setAddressLine1(String AddressLine1) {
		// TODO send AddressLine1 to AddressLine1 textbox
		// txtAddressLine1.sendKeys(AddressLine1);
	}
	
	public void setAddressLine2(String AddressLine2) {
		// TODO send AddressLine2 to AddressLine2 textbox
		// txtAddressLine2.sendKeys(AddressLine2);
	}
	
	public void setCity(String city) {
		// TODO send city to city textbox
		// txtCity.sendKeys(city);
	}
	
	public void setState(String state) {
		// TODO send state to state textbox
		// txtState.sendKeys(state);
	}
	
	public void setPhoneNumber(String phonenumber) {
		// TODO send phonenumber to phonenumber textbox
		// txtPhoneNumber.sendKeys(phonenumber);
	}
	
	public void setEmail(String email) {
		// TODO send email to email textbox
		// txtEmail.sendKeys(email);
	}
	
	public void setPostalCode(String postalcode) {
		// TODO send postalcode to postalcode textbox
		// txtPostalCode.sendKeys(postalcode);
	}
	
	public String getAddNewPatientPageTitle() {
		String title = "Add New Patient";
		// title = ldriver.getTitle();
		return title;
	}
	
	public String getAddNewPatientPageHeader() {
		String header = "Patient Form";
		// title = ldriver
		return header;
	}
	
	public boolean verifyBtnUpdate(String btnUpdate) {
		// TODO verify sign in btn
		if (btnUpdate == "Update")
			return true; // btnUpdate.isDisplayed();
		else
			return false;
	}
}
