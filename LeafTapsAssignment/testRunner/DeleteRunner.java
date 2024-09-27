package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class DeleteRunner {
	@CucumberOptions(
		    features = {
		        "LeafTapsAssignment/features/CreateAccount.feature",
		        "LeafTapsAssignment/features/EditAccount.feature",
		        "LeafTapsAssignment/features/DeleteAccount.feature"
		    },
		    glue = {"stepsDefinition", "hooks"},
		    publish = true,
		    monochrome = true,
		    dryRun = false,
		    tags = "@RunThird"
		)
		public class RunThirdTest extends AbstractTestNGCucumberTests {
		}

}
