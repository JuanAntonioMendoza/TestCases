package steps.global;

import pages.DigitalDownloads;
import pages.Main;
import pages.Register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import resources.Ashot;
import resources.DriverFactory;
import resources.UserHelper;

public class TC_NopCommerce_Globlal_CreateUser_001 {
    WebDriver driver = DriverFactory.getDriver();
    Main main = Main.getMain();
    Register register = Register.getRegister();
    UserHelper userHelper = new UserHelper();

    Ashot shotTool = new Ashot();
    DigitalDownloads digitalDownloads = DigitalDownloads.getDigitalDownloads();

    @Given("The user is on the main page")
    public void user_on_main_page() {
        driver.get("https://demo.nopcommerce.com/");

    }

    @When("The user enters a {string} in main page")
    public void user_enters_name(String labellink) {
        main.clickOnlink(labellink);
    }

    @Then("The user create a temporary credentials")
    public void user_should_be_see_item() throws Exception {
        register
                .radioButtonGender()
                .inputFirstName(userHelper.getName())
                .inputLastName(userHelper.getLastName())
                .dropListDay("15")
                .dropListMonth("July")
                .dropListYear("1992")
                .inputEmail(userHelper.getEmailHelper())
                .inputCompany("Ust")
                .inputPassword(userHelper.getPasswordHelper())
                .buttonRegister();
    }
}
