package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features/SalesForceDynamic.feature"},
					glue = {"stepsDefinition"} ,
					publish = true,
						monochrome = true
							//	dryRun = false,
								//plugin = {"pretty", "html:target/cucumber-reports"}
								)
public class SalesForceDynamicRunner extends AbstractTestNGCucumberTests {

}
