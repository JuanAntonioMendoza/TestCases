package steps.sprintone;

import pages.DigitalDownloads;
import pages.LogIn;
import pages.Main;
import pages.Register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.Ashot;
import resources.DriverFactory;
import resources.UserHelper;

public class TC_Digital_DownLoad_H_002 {
    WebDriver driver = DriverFactory.getDriver();
    Main main = Main.getMain();
    LogIn logIn = LogIn.getLogIn();
    UserHelper userhelper = new UserHelper();
    Register register = Register.getRegister();
    Ashot shotTool = new Ashot();
    DigitalDownloads digitalDownloads = DigitalDownloads.getDigitalDownloads();

    @Given("The hot user is on the main page")
    public void user_on_main_page() {
        driver.get("https://demo.nopcommerce.com/");
        main
                .clickOnlink("Log in");
        logIn
                .inputEmail(userhelper.getEmailHelper())
                .inputPassword(userhelper.getPasswordHelper())
                .buttonLogIn();
        shotTool.newAshot("TC_Digital_DownLoad_H_002", "Givenashot");
    }

    @When("The hot user enters name of a product {string} in the search text box")
    public void user_enters_name(String product) {
        WebElement inputElement = driver.findElement(By.id("small-searchterms"));
        inputElement.sendKeys(product);
        shotTool.newAshot("TC_Digital_DownLoad_H_002", "Whenashot");
        driver.findElement(By.className("search-box-button")).click();
    }

    @Then("The hot user should be see, picture, name, ranking, cart, price")
    public void user_should_be_see_item () throws Exception {
        digitalDownloads
                .IsDisplayed(digitalDownloads.fullProductItem())
                .IsDisplayed(digitalDownloads.pictureProductItem())
                .IsDisplayed(digitalDownloads.nameProductItem())
                .IsDisplayed(digitalDownloads.rakingProductItem())
                .IsDisplayed(digitalDownloads.addCartProductItem())
                .IsDisplayed(digitalDownloads.priceProductItem());
        shotTool.newAshot("TC_Digital_DownLoad_H_002", "Thenashot");
    }
}
