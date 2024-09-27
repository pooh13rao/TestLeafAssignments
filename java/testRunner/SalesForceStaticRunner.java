package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/features/SalesForceStatic.feature" }, glue = {
		"stepsDefinition" }, publish = true, monochrome = true)
public class SalesForceStaticRunner extends AbstractTestNGCucumberTests {

}
