package StepDefn;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\java\\AddCustomer.feature" }, tags = {}, dryRun = false, glue = {
		"StepDefn" }, monochrome = true, plugin = {"html:target","json:target/CucumberReport.json"})

public class TestRunner {

}
