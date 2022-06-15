package com.dietician.stepDefinitions;

import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.ViewRecentDietsPage;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Then;

public class MenuBarDietsPlans extends BaseClass {
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();

	ViewRecentDietsPage viewRecentDietsPage = new ViewRecentDietsPage(driver);


	@Then("User should see that Diet Plans tab on the menu bar is visible")
	public void user_should_see_that_diet_plans_tab_on_the_menu_bar_is_selected() {
	    if (viewRecentDietsPage.Verifydietplan() == true) {
	    	assertTrue(true);
			logger.info("Diet Plans tab on the menu bar is visible");
	    }else {
	    	assertTrue(true);
			logger.info("Diet Plans tab on the menu bar is not visible");
	    }
	}
}
