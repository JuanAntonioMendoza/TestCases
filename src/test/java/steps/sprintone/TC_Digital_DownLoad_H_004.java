package steps.sprintone;

import divs.GridProduct;
import io.cucumber.datatable.DataTable;
import pages.DigitalDownloads;
import pages.LogIn;
import pages.Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import resources.Ashot;
import resources.DriverFactory;
import resources.UserHelper;


public class TC_Digital_DownLoad_H_004 {
    WebDriver driver = DriverFactory.getDriver();
    Main main = Main.getMain();
    LogIn logIn = LogIn.getLogIn();
    UserHelper userhelper = new UserHelper();

    Ashot shotTool = new Ashot();
    DigitalDownloads digitalDownloads = DigitalDownloads.getDigitalDownloads();
    GridProduct gridProduct = GridProduct.getGridProduct();

    @Given("The hot user is on the main page and see main menu")
    public void user_on_main_page() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("The hot user clicks on name {string} on main menu")
    public void user_clicks_on_digital_download(String menu) {
        /*main
                .clickOnlink("Log in");
        logIn
                .inputEmail(userhelper.getEmailHelper())
                .inputPassword(userhelper.getPasswordHelper())
                .buttonLogIn();*/
        main.clickOnlink(menu);
    }

    @Then("The hot user should be see, picture, name, ranking, cart, price on Digital Download")
    public void user_should_be_see_item(DataTable table) throws Exception {
//        digitalDownloads.validateLabelOnDivItem("item-box");
        gridProduct.findValue(table,"product-item");
    }
}
