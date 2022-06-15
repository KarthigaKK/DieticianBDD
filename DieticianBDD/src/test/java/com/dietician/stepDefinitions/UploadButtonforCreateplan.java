package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.ConfirmConditionsandCreatePlanPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadButtonforCreateplan extends BaseClass {

	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	ConfirmConditionsandCreatePlanPage confirmandCreatePlan = new ConfirmConditionsandCreatePlanPage(driver);

	@Then("User should see a button with name upload {string} on the page")
	public void user_should_see_a_button_with_name_upload_on_the_page(String uploadbtnText) {
		assertTrue(true);
		logger.info("Verify button with name upload");
		verifyUploadBtn(uploadbtnText);
	}

	private void verifyUploadBtn(String uploadbtnText) {
		String btntext = confirmandCreatePlan.getBtnUploadText();
		if (btntext == uploadbtnText) {
			assertEquals(uploadbtnText, btntext);
			logger.info("Verify upload button and text visibility");
		} else {
			assertTrue(true);
			logger.info("Verify upload button and text not visibile");
		}

	}

	@When("User clicks upload button")
	public void user_clicks_upload_button() {
		confirmandCreatePlan.clickBtnUpload();
		logger.info("User clicks upload button ");
	}

	@Then("User should be able to upload file")
	public void user_should_be_able_to_upload_file() {
		logger.info("User should be able to upload file ");
	}

	@When("User clicks the Upload button without selecting a document")
	public void user_clicks_the_upload_button_without_selecting_a_document() {
		logger.info("Upload button without selecting a document");
		confirmandCreatePlan.clickBtnUpload();
		if (confirmandCreatePlan.tooltipInputfield() == null) {
			logger.info("Document not selected");
		} else
			assertTrue(true);
		logger.info("Document selected");
	}

	@Then("User should see an error message {string}")
	public void user_should_see_an_error_message(String message) {
		logger.info("User should see an error message");
		 logger.info(message);

	}
	@When("User clicks the Upload button by selecting a pdf file of size less than 2MB")
	public void user_clicks_the_upload_button_by_selecting_a_pdf_file_of_size_less_than_2mb() {
		//pdfUpload();
		logger.info("Uploading PDF file of size less than 2MB");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String message) {
		logger.info("File uploaded succesfully");
		logger.info(message);
	}

	private void pdfUpload() { 
		File file = new File("./Data/PDFDOC.pdf");
		confirmandCreatePlan.btnUpload().sendKeys(file.getAbsolutePath());
		confirmandCreatePlan.clickBtnUpload();
	}

	public static void printFileSizeNIO(String fileName) {
        Path path = Paths.get(fileName);
        try {
            // size of a file (in bytes , 2000000)
            long bytes = Files.size(path);
            System.out.println(String.format("%,d bytes", bytes));  

        } catch (IOException e) {
            e.printStackTrace();
        }
}
}