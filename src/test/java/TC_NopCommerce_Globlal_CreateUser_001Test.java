import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = "src/test/resources/features/global/TC_NopCommerce_Globlal_CreateUser_001.feature")
@Test
public class TC_NopCommerce_Globlal_CreateUser_001Test extends AbstractTestNGCucumberTests {
}
