import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = "src/test/resources/features/sprintone/TC_Digital_DownLoad_C_001.feature")
@Test
public class TC_Digital_DownLoad_C_001Test extends AbstractTestNGCucumberTests {
}
