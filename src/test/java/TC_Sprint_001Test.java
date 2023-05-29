import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {
                "src/test/resources/features/sprintone/TC_NopCommerce_001.feature",
        },
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "usage:target/cucumber-usage.json",
                "summary"
        }
)
@Test
public class TC_Sprint_001Test extends AbstractTestNGCucumberTests {

}
