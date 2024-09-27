package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class AccountRunner {

	@CucumberOptions(features = { "LeafTapsAssignment/features"
								  }, 
			glue = {"stepsDefinition" , "hooks"}, 
			publish = true, 
			monochrome = true,
	 dryRun = false,
	tags = "@RunFirst  @RunSecond  @RunThird" 
	// plugin = {"pretty", "html:target/cucumber-reports"}
	)
	public class AccountTestRunner extends AbstractTestNGCucumberTests {

	}

}
