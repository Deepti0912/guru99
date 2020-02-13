package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features = "/guru99/src/main/java/features/mobilePage.feature", glue = {"stepDefinations"}
)

public class TestRunner {
}
