package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features/SalesForce.feature"},
					glue = {"stepsDefinition"} ,
					publish = true,
						monochrome = true	)
public class SalesForceRunner extends AbstractTestNGCucumberTests {

}
