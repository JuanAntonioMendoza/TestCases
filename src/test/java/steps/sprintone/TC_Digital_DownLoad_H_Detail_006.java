package steps.sprintone;

import pages.DigitalDownloadsProduct;
import pages.LogIn;
import pages.Main;
import pages.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import resources.Ashot;
import resources.DriverFactory;
import resources.UserHelper;

public class TC_Digital_DownLoad_H_Detail_006 {
    WebDriver driver = DriverFactory.getDriver();
    Main main = Main.getMain();
    Search search = Search.getSearch();
    LogIn logIn = LogIn.getLogIn();
    UserHelper userhelper = new UserHelper();
    DigitalDownloadsProduct digitalDownloadsProduct = DigitalDownloadsProduct.getDigitalDownloadsProduct();
    Ashot shotTool = new Ashot();

    @Given("The hot user is on the main page for check Digital Downloads Product")
    public void user_on_main_page() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("The hot user enters name of a product {string} in the search text box for start Digital Downloads Product")
    public void user_clicks_on_searchBox(String product) {
        main
                .clickOnlink("Log in");
        logIn
                .inputEmail(userhelper.getEmailHelper())
                .inputPassword(userhelper.getPasswordHelper())
                .buttonLogIn();
        main.searchBox(product);
        /*
        shotTool.newAshot("TC_Digital_DownLoad_C_001", "Whenashot");
        */
    }

    @Then("The hot user should be see button download, button add wishlist,button compare list, button email, price, ranking")
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
