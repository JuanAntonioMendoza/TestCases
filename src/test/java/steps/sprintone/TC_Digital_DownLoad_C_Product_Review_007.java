package steps.sprintone;

import pages.DigitalDownloadsProduct;
import pages.Main;
import pages.Review;
import pages.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import resources.Ashot;
import resources.DriverFactory;

public class TC_Digital_DownLoad_C_Product_Review_007 {
    WebDriver driver = DriverFactory.getDriver();
    Main main = Main.getMain();
    Search search = Search.getSearch();
    DigitalDownloadsProduct digitalDownloadsProduct = DigitalDownloadsProduct.getDigitalDownloadsProduct();
    Review review = Review.getReview();

    Ashot shotTool = new Ashot();

    @Given("The cold user is on the main page for check Digital Downloads Product and see review")
    public void user_on_main_page() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("The cold user enters name of a product {string} in the search text box for start Digital Downloads Product and press link")
    public void user_clicks_on_searchBox(String product) {
        main.searchBox(product);
        search
                .clickOnLink("Night Visions");
        digitalDownloadsProduct
                .clickOnLink("Add your review");
        /*
        shotTool.newAshot("TC_Digital_DownLoad_C_001", "Whenashot");
        */
    }

    @Then("The cold user should be see form review disable")
    public void user_should_be_see_form_review() {
        review
                .IsDisplayed(review.errorAlert())
                .disableLabel("AddProductReview_Title")
                .disableLabel("AddProductReview_ReviewText");

        /*
        shotTool.newAshot("TC_Digital_DownLoad_C_001", "Thenashot");
        */
    }
}
