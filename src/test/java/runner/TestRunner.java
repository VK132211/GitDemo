package runner;

import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\VINAY\\eclipse-workspace\\SimpleCucumberProjectUsingScenarioOutline\\src\\test\\java\\features\\Registration.feature", //the path of the feature files
		glue={"stepdefinitions"}, //the path of the step definition files
		//format= {"pretty","html:test-output", "json:report_json/cucumber.json", "junit:report_xml/cucumber.xml"},
		dryRun = false,
		monochrome = true,
		strict = true
		)


public class TestRunner {

}

   