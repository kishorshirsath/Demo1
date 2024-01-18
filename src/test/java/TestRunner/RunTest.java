package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"AllFeatureFiles"},
		glue= {"Steps"},
		dryRun= false
		
		
		
		)
public class RunTest {

}
