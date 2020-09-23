package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
features ="src/test/java/features",
        glue="stepDefinitions",
        dryRun = false,
        monochrome = true,
        strict = true,
        plugin = {"html:test_output/results.html","json:test_output/results.json","junit:test_output/results.xml"}
)
public class TestRunner {
}
