package runner2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature2/Login2.feature", glue = "stepDefinition2", tags = {
		"@Login" }, monochrome = true, plugin = { "pretty", "html:target/HtmlReport" })
public class TestRunner2 {

}
