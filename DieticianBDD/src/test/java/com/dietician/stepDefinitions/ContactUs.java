package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.ContactUsPage;
import com.dietician.pageObjects.MenubarOptions;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUs extends BaseClass{

	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	ContactUsPage contact = new ContactUsPage(driver);
	
	@Given("User is on {string} Page")
	public void user_is_on_page(String ContactPageTitle) {
		
		String title = contact.getContactPageTitle();
	    if (title == ContactPageTitle)
	    {
	    	assertEquals(ContactPageTitle, title);
			logger.info("User is in ContactUsPage");
	    }
		else {
	        logger.info("User is not in ContactUsPage");
		}
	}

	@When("User enters submit button with all fields empty")
	public void user_enters_submit_button_with_all_fields_empty() {
	    
		contact.clickSubmitButton();
	}

	@Then("User should get a message Please fill all fields above")
	public void user_should_get_a_message_please_fill_all_fields_above() {
	    
		 if(contact.plsfillallfieldsmsgVisibility())
		 {
				logger.info("Message is visible");
			}
			
			else
				logger.info("Message is not visible");
	}

	@When("User enters first name with some numeric values and other fields with valid values and clicks submit button")
	public void user_enters_first_name_with_some_numeric_values_and_other_fields_with_valid_values_and_clicks_submit_button() {
	    
		contact.numericFirstName();
		contact.validLastName();
		contact.validEmail();
		contact.validMessage();
		contact.validSubject();
		contact.clickSubmitButton();
	}

	@Then("User should get a message Please fill first name with charactersof maximum ten characters long")
	public void user_should_get_a_message_please_fill_first_name_with_charactersof_maximum_ten_characters_long() {
	    
		if(contact.plsfillwithvalidFirstNamemsgVisibility())
		 {
				logger.info("Message is visible");
			}
			
			else
				logger.info("Message is not visible");
	}

	@When("User enters Last  Name field with some numeric values and other fields with valid values and click submit button")
	public void user_enters_last_name_field_with_some_numeric_values_and_other_fields_with_valid_values_and_click_submit_button() {
	    
		contact.validFirstName();
		contact.numericLastName();
		contact.validEmail();
		contact.validMessage();
		contact.validSubject();
		contact.clickSubmitButton();
		
	}

	@Then("User should get a message Please fill Last Name with charactersof maximum ten characters long")
	public void user_should_get_a_message_please_fill_last_name_with_charactersof_maximum_ten_characters_long() {
	    
		if(contact.plsfillwithvalidLastNamemsgVisibility())
		 {
				logger.info("Message is visible");
			}
			
			else
				logger.info("Message is not visible");
	}

	@When("User enters Email with some image values and other fields with valid values and click submit button")
	public void user_enters_email_with_some_image_values_and_other_fields_with_valid_values_and_click_submit_button() {
	    
		contact.validFirstName();
		contact.validLastName();
		contact.numericEmail();
		contact.validMessage();
		contact.validSubject();
		contact.clickSubmitButton();
		
	}

	@Then("User should get a message Please fill Email field with character,numeric and special character combinations")
	public void user_should_get_a_message_please_fill_email_field_with_character_numeric_and_special_character_combinations() {
	    
		if(contact.plsfillwithvalidEmailmsgVisibility())
		 {
				logger.info("Message is visible");
			}
			
			else
				logger.info("Message is not visible");
	}
	

	@When("User enters Subject with some numeric values and other fields with valid values and  click submit button")
	public void user_enters_subject_with_some_numeric_values_and_other_fields_with_valid_values_and_click_submit_button() {
	    
		contact.validFirstName();
		contact.validLastName();
		contact.validEmail();
		contact.validMessage();
		contact.numericSubject();
		contact.clickSubmitButton();
	}

	@Then("User should get a message Please fill Subject field with some chacters of maximum twenty letters length")
	public void user_should_get_a_message_please_fill_subject_field_with_some_chacters_of_maximum_twenty_letters_length() {
	    
		if(contact.plsfillwithvalidSubjectmsgVisibility())
		 {
				logger.info("Message is visible");
			}
			
			else
				logger.info("Message is not visible");
	}

	@When("User enters Write your Message Here with some numeric values and other fields with valid values and clicks submit button")
	public void user_enters_write_your_message_here_with_some_numeric_values_and_other_fields_with_valid_values_and_clicks_submit_button() {
	    
		contact.validFirstName();
		contact.validLastName();
		contact.validEmail();
		contact.numericMessage();
		contact.validSubject();
		contact.clickSubmitButton();
	}

	@Then("User should get a message Please fill Write your Message here field with  alphabet characters  of maximum two hundred length")
	public void user_should_get_a_message_please_fill_write_your_message_here_field_with_alphabet_characters_of_maximum_two_hundred_length() {
	    
		if(contact.plsfillwithvalidWriteMessageVisibility())
		 {
				logger.info("Message is visible");
			}
			
			else
				logger.info("Message is not visible");
	}

	@When("User enters all valid values in fields and click submit button")
	public void user_enters_all_valid_values_in_fields_and_click_submit_button() {
	    
		contact.validFirstName();
		contact.validLastName();
		contact.validEmail();
		contact.validMessage();
		contact.validSubject();
		contact.clickSubmitButton();
	}

	@Then("User should get a message Your Request is Submitted")
	public void user_should_get_a_message_your_request_is_submitted() {
	    
		if(contact.MsgRequestSubmitvisibility())
		 {
				logger.info("Message is visible");
			}
			
			else
				logger.info("Message is not visible");
	}
}
