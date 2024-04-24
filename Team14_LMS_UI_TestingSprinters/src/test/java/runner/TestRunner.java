package runner;

import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue= {"stepdefinition","hooks"},
plugin={"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"html:test-output/cucumber-reports/dsalgo.html","json:target/jsonReports/report.json",
		"html:test-output/jsonReports/report2.json","junit:target/jsonReports/report1.json",
		"timeline:test-output-thread/"}
//,
//tags= ""
		)

public class TestRunner {
}