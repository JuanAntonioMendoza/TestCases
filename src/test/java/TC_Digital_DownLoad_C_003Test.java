import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = "src/test/resources/features/springone/TC_Digital_DownLoad_C_003.feature")
@Test
public class TC_Digital_DownLoad_C_003Test extends AbstractTestNGCucumberTests {
}