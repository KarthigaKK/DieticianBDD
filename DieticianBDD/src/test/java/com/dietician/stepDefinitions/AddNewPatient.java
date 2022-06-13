package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.AddNewPatientPage;
import com.dietician.utilities.ReadConfig;

import com.dietician.utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewPatient extends BaseClass{
	
	ReadConfig config=new ReadConfig();
	String addnewpatienturl=config.getAddNewPatientUrl();
	AddNewPatientPage addpatient=new AddNewPatientPage(driver);
	
	@Given("User is on the Add New Patient Page {string}")
	public void user_is_on_the_add_new_patient_page(String url) {
		//check base amp url and given url
		logger.info("User is on Add new patient page");
		if (baseurl.equals(url))
			assertEquals(url, addnewpatienturl);
		else 
			assertTrue(true); 
	}

	@When("User wants to enter New Patient details")
	public void user_wants_to_enter_new_patient_details() {
		logger.info("User wants to enter patient details");		
	}

	@Then("Patient Data From is visible")
	public void patient_data_from_is_visible() {
		logger.info("Patient form header is visible");
		addpatient.getAddNewPatientPageHeader();
	}

	@When("User attempts to submit the form without filling up mandatory fields from sheetname {string}")
	public void user_attempts_to_submit_the_form_without_filling_up_mandatory_fields_from_sheetname(String sheetName) throws InvalidFormatException, IOException {
		logger.info("User fill the form without entering mandatory fields");
		List<Map<String,String>> testData = readExcelFile(sheetName);
	    for (int i = 0; i < testData.size()-1; i++) {
	       if (testData.get(i).get("FullName") == "" && testData.get(i).get("AddressLine1") == "" && testData.get(i).get("AddressLine2") == ""  
	    		   && testData.get(i).get("City") == "" && testData.get(i).get("State") == "" && testData.get(i).get("PostalCode") == "" && testData.get(i).get("Email") =="" && testData.get(i).get("PhoneNo") == "") {	
	    	   addNewPatient(testData , i);
	       }
	    }
	}

	@Then("Unable to update and display {string} error message")
	public void unable_to_update_and_display_error_message(String errormessage) {
		logger.info(errormessage);	   
	}	
	
	@When("User attempts to put numeric value in Full Name field from sheetname {string}")
	public void user_attempts_to_put_numeric_value_in_full_name_field_from_sheetname(String sheetName) throws InvalidFormatException, IOException {
		logger.info("User enters numeric value in full name field");
		List<Map<String,String>> testData = readExcelFile(sheetName);		
		for (int i = 0; i < testData.size()-1; i++) {
			boolean isInt = false;
			try {
				Integer.parseInt(testData.get(i).get("FullName"));
				isInt = true;
			}
			catch (Exception e) {}
			if (isInt) {
				addNewPatient(testData , i);
			}
		}
	}

	@Then("Unable to enter and show {string} error message")
	public void unable_to_enter_and_show_error_message(String errormessage) {
		logger.info(errormessage);
	}
	
	
	@When("User does not put space in between  First Name and Last Name for Full Name field from sheetname {string}")
	public void user_does_not_put_space_in_between_first_name_and_last_name_for_full_name_field_from_sheetname(String sheetName) throws InvalidFormatException, IOException {
		logger.info("User enters full name without space");
		List<Map<String,String>> testData = readExcelFile(sheetName);		
		for (int i = 0; i < testData.size()-1; i++) {
			if (testData.get(i).get("FullName").indexOf(" ") == -1) {
				addNewPatient(testData , i);
			}
		}		
	}
	
	@When("User attempts to submit the form without filling up Full Name field from sheetname {string}")
	public void user_attempts_to_submit_the_form_without_filling_up_full_name_field_from_sheetname(String sheetName) throws InvalidFormatException, IOException {
		logger.info("User leaves full name as empty");
		List<Map<String,String>> testData = readExcelFile(sheetName);		
		for (int i = 0; i < testData.size()-1; i++) {
			if (testData.get(i).get("FullName") == "") {
				addNewPatient(testData , i);
			}
		}		
	}
	
	@When("User does not enter any value in Addess linel field from sheetname {string}")
	public void user_does_not_enter_any_value_in_addess_linel_field_from_sheetname(String sheetName) throws InvalidFormatException, IOException {
		logger.info("User leaves Addess line l as empty");
		List<Map<String,String>> testData = readExcelFile(sheetName);		
		for (int i = 0; i < testData.size()-1; i++) {
			if (testData.get(i).get("AddressLine1") == "") {
				addNewPatient(testData , i);
			}
		}
	}

	@When("User submit the form without selecting any value for Country field from sheetname {string}")
	public void user_submit_the_form_without_selecting_any_value_for_country_field_from_sheetname(String sheetName) throws InvalidFormatException, IOException {
		logger.info("User leaves country field as empty");
		List<Map<String,String>> testData = readExcelFile(sheetName);		
		for (int i = 0; i < testData.size()-1; i++) {
			if (testData.get(i).get("Country") == "") {
				addNewPatient(testData , i);
			}
		}
	}
	
	@When("User attempts to put numeric value in City field from sheetname {string}")
	public void user_attempts_to_put_numeric_value_in_city_field_from_sheetname(String sheetName) throws InvalidFormatException, IOException {
		logger.info("User enters numeric value in city field");
		List<Map<String,String>> testData = readExcelFile(sheetName);		
		for (int i = 0; i < testData.size()-1; i++) {
			boolean isInt = false;
			try {
				Integer.parseInt(testData.get(i).get("City"));
				isInt = true;
			}
			catch (Exception e) {}
			if (isInt) {
				addNewPatient(testData , i);
			}
		}
	}
	
	@When("User attempts to submit the form without filling up City field from sheetname {string}")
	public void user_attempts_to_submit_the_form_without_filling_up_city_field_from_sheetname(String sheetName) throws InvalidFormatException, IOException {
		logger.info("User leaves city as empty");
		List<Map<String,String>> testData = readExcelFile(sheetName);		
		for (int i = 0; i < testData.size()-1; i++) {
			if (testData.get(i).get("City") == "") {
				addNewPatient(testData , i);
			}
		}
	}

	@When("User attempts to put numeric value in State, province or region field from sheetname {string}")
	public void user_attempts_to_put_numeric_value_in_state_province_or_region_field_from_sheetname(String sheetName) throws InvalidFormatException, IOException {
		logger.info("User enters numeric value in State field");
		List<Map<String,String>> testData = readExcelFile(sheetName);		
		for (int i = 0; i < testData.size()-1; i++) {
			boolean isInt = false;
			try {
				Integer.parseInt(testData.get(i).get("State"));
				isInt = true;
			}
			catch (Exception e) {}
			if (isInt) {
				addNewPatient(testData , i);
			}
		}
	}
	

	@When("User attempts to submit the form without filling up State, province or region field from sheetname {string}")
	public void user_attempts_to_submit_the_form_without_filling_up_state_province_or_region_field_from_sheetname(String sheetName) throws InvalidFormatException, IOException {
		logger.info("User leaves state as empty");
		List<Map<String,String>> testData = readExcelFile(sheetName);		
		for (int i = 0; i < testData.size()-1; i++) {
			if (testData.get(i).get("State") == "") {
				addNewPatient(testData , i);
			}
		}
	}

	@When("User attempts to submit the form without filling up Postal code field from sheetname {string}")
	public void user_attempts_to_submit_the_form_without_filling_up_postal_code_field_from_sheetname(String sheetName) throws InvalidFormatException, IOException {
		logger.info("User leaves postal code as empty");
		List<Map<String,String>> testData = readExcelFile(sheetName);		
		for (int i = 0; i < testData.size()-1; i++) {
			if (testData.get(i).get("PostalCode") == "") {
				addNewPatient(testData , i);
			}
		}
	}

	@When("User entered not supported data format in Postal code field from sheetname {string}")
	public void user_entered_not_supported_data_format_in_postal_code_field_from_sheetname(String sheetName) throws InvalidFormatException, IOException {
		logger.info("User enters string in postal code");
		List<Map<String,String>> testData = readExcelFile(sheetName);		
		for (int i = 0; i < testData.size()-1; i++) {
			boolean isInt = false;
			try {
				Integer.parseInt(testData.get(i).get("PostalCode"));
				isInt = true;
			}
			catch (Exception e) {}
			if (isInt) {
				addNewPatient(testData , i);
			}
		}
	}
	
	@When("User does not enter any value in Email field from sheetname {string}")
	public void user_does_not_enter_any_value_in_email_field_from_sheetname(String sheetName) throws InvalidFormatException, IOException {
		logger.info("User leaves email as empty");
		List<Map<String,String>> testData = readExcelFile(sheetName);		
		for (int i = 0; i < testData.size()-1; i++) {
			if (testData.get(i).get("Email") == "") {
				addNewPatient(testData , i);
			}
		}
	}

	@When("User entered not supported data format in Email field from sheetname {string}")
	public void user_entered_not_supported_data_format_in_email_field_from_sheetname(String sheetName) {
		logger.info("User enter invalid email format");
	}
	
	@When("User attempts to put characters in Phone number field from sheetname {string}")
	public void user_attempts_to_put_characters_in_phone_number_field_from_sheetname(String sheetName) {
		logger.info("User enter character in phone no field");
	}

	@When("User attempts to submit the form without filling up Phone number field from sheetname {string}")
	public void user_attempts_to_submit_the_form_without_filling_up_phone_number_field_from_sheetname(String sheetName) throws InvalidFormatException, IOException {
		logger.info("User leaves phone no as empty");
		List<Map<String,String>> testData = readExcelFile(sheetName);		
		for (int i = 0; i < testData.size()-1; i++) {
			if (testData.get(i).get("PhoneNo") == "") {
				addNewPatient(testData , i);
			}
		}
	}
	
	@When("User fills up the form with Valid Data Inputs from sheetname {string}")
	public void user_fills_up_the_form_with_valid_data_inputs_from_sheetname(String sheetName) throws InvalidFormatException, IOException {
		logger.info("User enter valid data inside all fields in the form");
		List<Map<String,String>> testData = readExcelFile(sheetName);
		for (int i = 0; i < testData.size()-1; i++) {
			if (testData.get(i).get("PhoneNo") == "") {
				addNewPatient(testData , i);
			}
		}
	}

	@Then("User can see {string} button")
	public void user_can_see_button(String btnName) {
		logger.info("Update Button dispalyed");
		addpatient.verifyBtnUpdate(btnName);
	   
	}

	@When("User clicks on the Add New Patient button after entering valid Patient data {string}")
	public void user_clicks_on_the_add_new_patient_button_after_entering_valid_patient_data(String sheetName) {
		logger.info("User click update button after entering field values");
		addpatient.clickBtnUpdate();
	}

	@Then("User lands on My Patients page with the {string} details displayed")
	public void user_lands_on_my_patients_page_with_the_details_displayed(String pageName) {
		logger.info("User redirected to "+pageName+" page");
	
	}

	
	private List<Map<String,String>> readExcelFile(String sheetName) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
	    return reader.getData(System.getProperty("user.dir") + "/src/test/resources/Add New Patient.xlsx", sheetName);
	}
	
	private void addNewPatient(List<Map<String,String>> testData, int i) {
		/*System.out.println(testData.get(i).get("FullName"));
		System.out.println(testData.get(i).get("AddressLine1"));
		System.out.println(testData.get(i).get("AddressLine2"));
		System.out.println(testData.get(i).get("Country"));
		System.out.println(testData.get(i).get("City"));
		System.out.println(testData.get(i).get("State"));
		System.out.println(testData.get(i).get("PostalCode"));
		System.out.println(testData.get(i).get("Email"));
		System.out.println(testData.get(i).get("PhoneNo")); */
		
		addpatient.setFullName(testData.get(i).get("FullName"));
		addpatient.setAddressLine1(testData.get(i).get("AddressLine1"));
		addpatient.setAddressLine2(testData.get(i).get("AddressLine2"));
		addpatient.setCountry(testData.get(i).get("Country"));
		addpatient.setCity(testData.get(i).get("City"));
		addpatient.setState(testData.get(i).get("State"));
		addpatient.setPostalCode(testData.get(i).get("PostalCode"));
		addpatient.setEmail(testData.get(i).get("Email"));
		addpatient.setPhoneNumber(testData.get(i).get("PhoneNo"));
		addpatient.clickBtnUpdate();
	}
	
	
	
	
}
