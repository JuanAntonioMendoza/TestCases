package steps.sprintone;

import io.cucumber.datatable.DataTable;
import pages.DigitalDownloads;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Main;
import resources.Ashot;
import resources.DriverFactory;

import java.util.List;
import java.util.Map;


public class TC_Digital_DownLoad_C_001 {
    WebDriver driver = DriverFactory.getDriver();
    Ashot shotTool = new Ashot();
    Main main = Main.getMain();
    DigitalDownloads digitalDownloads = DigitalDownloads.getDigitalDownloads();

    @Given("The cold user is on the main page")
    public void user_on_main_page() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("The cold user enters name of a product {string} in the search text box")
    //public void user_enters_name(String product) {
    public void user_enters_name(String productName, DataTable table){
        digitalDownloads
                .contendValue(By.id("small-searchterms"));
        shotTool.newAshot("TC_Digital_DownLoad_C_001", "Whenashot");
        List<List<String>> data = table.asLists();
        System.out.println(productName);
        main
//                .searchBox(data.get(1).get(0));
                .searchBox(productName);

    }

    @Then("The cold user should be see, picture, name, ranking, cart, price")
    public void user_should_be_see_item() throws Exception {
        digitalDownloads
                .IsDisplayed(digitalDownloads.fullProductItem())
                .IsDisplayed(digitalDownloads.pictureProductItem())
                .IsDisplayed(digitalDownloads.nameProductItem())
                .IsDisplayed(digitalDownloads.rakingProductItem())
                .IsDisplayed(digitalDownloads.addCartProductItem())
                .IsDisplayed(digitalDownloads.priceProductItem());
        shotTool.newAshot("TC_Digital_DownLoad_C_001", "Thenashot");

    }
}
