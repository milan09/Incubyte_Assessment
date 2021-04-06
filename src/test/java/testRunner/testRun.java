package testRunner;
//This is my test runner class

import org.junit.runner.RunWith;
import io.cucumber.junit.*;



@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/Login.feature",
		glue="stepDefinitions",
		dryRun=true,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		)

public class testRun {
	
}
