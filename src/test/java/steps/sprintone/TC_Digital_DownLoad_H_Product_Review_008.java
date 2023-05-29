package steps.sprintone;

import pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import resources.Ashot;
import resources.DriverFactory;
import resources.UserHelper;

public class TC_Digital_DownLoad_H_Product_Review_008 {
    WebDriver driver = DriverFactory.getDriver();
    Main main = Main.getMain();
    Search search = Search.getSearch();
    DigitalDownloadsProduct digitalDownloadsProduct = DigitalDownloadsProduct.getDigitalDownloadsProduct();
    Review review = Review.getReview();
    LogIn logIn = LogIn.getLogIn();
    UserHelper userhelper = new UserHelper();

    Ashot shotTool = new Ashot();

    @Given("The hot user is on the main page for check Digital Downloads Product and see review")
    public void user_on_main_page() {
        driver.get("https://demo.nopcommerce.com/");
//        main
//                .clickOnlink("Log in");
//        logIn
//                .openLogIn()
//                .inputEmail(userhelper.getEmailHelper())
//                .inputPassword(userhelper.getPasswordHelper())
//                .buttonLogIn();
    }

    @When("The hot user enters name of a product {string} in the search text box for start Digital Downloads Product and press link")
    public void user_clicks_on_searchBox(String product) {
        main.searchBox(product);
        search
//                .clickOnLink("If You Wait (donation)");
                .clickOnLink("Night Visions");
        digitalDownloadsProduct
                .clickOnLink("Add your review");
    }

    @Then("The hot user should be see form and add review")
    public void user_should_be_see_form_review_and_add_review() {
        review
                .createReview()
                .IsDisplayed(review.ratingReview())
                .IsDisplayed(review.titleReview())
                .IsDisplayed(review.textAreaReview());
    }
}
