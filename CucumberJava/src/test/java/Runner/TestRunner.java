package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"},
monochrome = true,
plugin = {"pretty","junit:target/JunitReports/report.xml",
		"html:target/html/reports"}, tags = "@tag1")





public class TestRunner {

}

/*
 * Reports: JSON [plugin = {"pretty","json:target/JsonReports/report.json"}]
 * JUNIT [plugin = {"pretty","junit:target/JunitReports/report.xml"}] Html
 * [plugin = {"pretty","html:target/reports"}]
 */

