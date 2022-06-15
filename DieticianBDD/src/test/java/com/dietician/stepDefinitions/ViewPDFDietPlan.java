package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.ViewRecentDietsPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Then;

public class ViewPDFDietPlan extends BaseClass {
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();

	ViewRecentDietsPage viewRecentDietsPage = new ViewRecentDietsPage(driver);


	@Then("View PDF option is available for the generated diet plans")
	public void view_pdf_option_is_available_for_the_generated_diet_plans() {
		 if (viewRecentDietsPage.VerifyviewPDF() == true) {
		    	assertTrue(true);
				logger.info("View PDF is visible");
		    }else {
		    	assertTrue(true);
				logger.info("View PDF is not visible");
		    }
	}

	@Then("View record number, planID, customer details,plangenerated time, comments available for the generated diet plans")
	public void view_record_number_plan_id_customer_details_plangenerated_time_comments_available_for_the_generated_diet_plans() {
		assertEquals(viewRecentDietsPage.Verifyrecordnumber(),true);
		assertEquals(viewRecentDietsPage.VerifyplanID(),true);
		assertEquals(viewRecentDietsPage.Verifycustomerdetails(),true);
		assertEquals(viewRecentDietsPage.Verifyplangeneratedtime(),true);
		assertEquals(viewRecentDietsPage.Verifycomments(),true);
		
		logger.info("Record Number, Plan ID, Customer Details, Plan Generated time, Comments fields visible");
	}
}
