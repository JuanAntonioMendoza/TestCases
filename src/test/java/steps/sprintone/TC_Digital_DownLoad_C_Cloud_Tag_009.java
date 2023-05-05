package steps.sprintone;

import pages.Main;
import pages.TagProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import resources.Ashot;
import resources.DriverFactory;


public class TC_Digital_DownLoad_C_Cloud_Tag_009 {
    WebDriver driver = DriverFactory.getDriver();
    Main main = Main.getMain();

    Ashot shotTool = new Ashot();
    TagProduct tagProduct = TagProduct.getDigitalDownloads();

    @Given("The cold user is on the main page and click on any link")
    public void user_on_main_page() {
        driver.get("https://demo.nopcommerce.com/");
        main.clickOnlink("Digital downloads");
    }

    @When("The cold user clicks on {string} in the popular tag")
    public void user_enters_name(String labelLink) {
        tagProduct
                .clickOnlink(labelLink);
    }

    @Then("The cold user should be see, picture, name, ranking, cart, price on Digital Tag")
    public void user_should_be_see_item() throws Exception {
        tagProduct
                .validateLabelOnDivItemDontFailed("item-box");
    }
}
