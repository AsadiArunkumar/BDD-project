package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//options separated with a ","
		features = {"src/test/resources/Features/loginDatadrivenTesting.feature"},
		glue = {"Stepdefinations"},
		monochrome = true,
		dryRun = false,
		plugin = {
			"pretty",
			"html: reports/htmlreport"
		}
		)//closing bracket of cucumber options


public class TestRunner {
	
}
