package com.dietician.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue= {"com.dietician.stepDefinitions"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","json:target/cucumber-reports/reports.json",
						"junit:target/cucumber-reports/Cucumber.xml",
						"html:target/cucumber-reports/reports.html",
						"html:test-output/index.html"}

		)
public class TestRunner {

}