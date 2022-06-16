package com.dietician.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dietician.utilities.ReadConfig;

public class ListOfScreensPage {
	WebDriver ldriver;
	ReadConfig config = new ReadConfig();
	
	public ListOfScreensPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	@FindBy(xpath = "")
	WebElement ListOfScreensIcon;

	
}
