package steps.sprintone;

import divs.GridProduct;
import io.cucumber.datatable.DataTable;
import pages.DigitalDownloads;
import pages.Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import resources.Ashot;
import resources.DriverFactory;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;


public class TC_Digital_DownLoad_C_003 {
    WebDriver driver = DriverFactory.getDriver();
    Main main = Main.getMain();
    Ashot shotTool = new Ashot();
    DigitalDownloads digitalDownloads = DigitalDownloads.getDigitalDownloads();
    GridProduct gridProduct = GridProduct.getGridProduct();

    @Given("The cold user is on the main page and see main menu")
    public void user_on_main_page() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("The cold user clicks on name {string} on main menu")
    public void user_clicks_on_digital_download(String menu) {
        main.clickOnlink(menu);
    }

    
    @Then("The cold user should be see the next content on Digital Download")
    public void user_should_be_see_item(DataTable table) throws Exception {
        gridProduct.findValue(table,"product-item");

        //digitalDownloads.validateLabelOnDivItem("item-box");
    }
}
