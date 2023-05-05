package steps.sprintone;

import pages.DigitalDownloads;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.Ashot;
import resources.DriverFactory;


public class TC_Digital_DownLoad_C_001 {
    WebDriver driver = DriverFactory.getDriver();
    Ashot shotTool = new Ashot();
    DigitalDownloads digitalDownloads = DigitalDownloads.getDigitalDownloads();

    @Given("The cold user is on the main page")
    public void user_on_main_page() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("The cold user enters name of a product {string} in the search text box")
    public void user_enters_name(String product) {
        WebElement inputElement = driver.findElement(By.id("small-searchterms"));
        inputElement.sendKeys(product);
        shotTool.newAshot("TC_Digital_DownLoad_C_001", "Whenashot");
        driver.findElement(By.className("search-box-button")).click();
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
        System.out.println("Final Test");
    }
}
