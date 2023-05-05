package steps.sprintone;

import pages.LogIn;
import pages.Main;
import pages.TagProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import resources.Ashot;
import resources.DriverFactory;
import resources.UserHelper;


public class TC_Digital_DownLoad_H_Cloud_Tag_010 {
    WebDriver driver = DriverFactory.getDriver();
    Main main = Main.getMain();
    LogIn logIn = LogIn.getLogIn();
    UserHelper userhelper = new UserHelper();

    Ashot shotTool = new Ashot();
    TagProduct tagProduct = TagProduct.getDigitalDownloads();

    @Given("The hot user is on the main page and click on any link")
    public void user_on_main_page() {
        driver.get("https://demo.nopcommerce.com/");
        main.clickOnlink("Digital downloads");
        main
                .clickOnlink("Log in");
        logIn
                .inputEmail(userhelper.getEmailHelper())
                .inputPassword(userhelper.getPasswordHelper())
                .buttonLogIn();
    }

    @When("The hot user clicks on {string} in the popular tag")
    public void user_enters_name(String labelLink) {
        tagProduct
                .clickOnlink(labelLink);
    }

    @Then("The hot user should be see, picture, name, ranking, cart, price on Digital Tag")
    public void user_should_be_see_item() throws Exception {
        tagProduct
                .validateLabelOnDivItemDontFailed("item-box");
    }
}
