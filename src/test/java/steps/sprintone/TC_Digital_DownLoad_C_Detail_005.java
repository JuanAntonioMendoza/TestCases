package steps.sprintone;

import pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import resources.Ashot;
import resources.DriverFactory;

public class TC_Digital_DownLoad_C_Detail_005 {
    WebDriver driver = DriverFactory.getDriver();
    Main main = Main.getMain();
    Search search = Search.getSearch();
    DigitalDownloadsProduct digitalDownloadsProduct = DigitalDownloadsProduct.getDigitalDownloadsProduct();
    Ashot shotTool = new Ashot();

    @Given("The cold user is on the main page for check Digital Downloads Product")
    public void user_on_main_page() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("The cold user enters name of a product {string} in the search text box for start Digital Downloads Product")
    public void user_clicks_on_searchBox(String product) {
        main.searchBox(product);
        /*
        shotTool.newAshot("TC_Digital_DownLoad_C_001", "Whenashot");
        */
    }

    @Then("The cold user should be see button download, button add wishlist,button compare list, button email, price, ranking")
    public void user_should_be_see_item() {
        search
                .clickOnLink("Night Visions");
        digitalDownloadsProduct
                .IsDisplayed(digitalDownloadsProduct.pictureProductItem())
                .IsDisplayed(digitalDownloadsProduct.titleProductItem())
                .IsDisplayed(digitalDownloadsProduct.descriptionProductItem())
                .IsDisplayed(digitalDownloadsProduct.skuProductItem())
                .IsDisplayed(digitalDownloadsProduct.btndownloadSampleProductItem())
                .IsDisplayed(digitalDownloadsProduct.btnAddWishlistProductItem())
                .IsDisplayed(digitalDownloadsProduct.btnAddCompareListProductItem())
                .IsDisplayed(digitalDownloadsProduct.btnEmailFriendProductItem())
                .IsDisplayed(digitalDownloadsProduct.priceProductItem())
                .IsDisplayed(digitalDownloadsProduct.ratingProductItem());

        //digitalDownloads.validateLabelOnDivItem("item-box");
        /*
        shotTool.newAshot("TC_Digital_DownLoad_C_001", "Thenashot");
        */
    }
}
