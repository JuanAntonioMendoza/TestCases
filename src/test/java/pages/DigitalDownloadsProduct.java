package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import resources.DriverFactory;

public class DigitalDownloadsProduct {

    WebDriver driver = DriverFactory.getDriver();
    public DigitalDownloadsProduct() {
    }

    public static DigitalDownloadsProduct getDigitalDownloadsProduct() {
        return new DigitalDownloadsProduct();
    }

    public DigitalDownloadsProduct IsDisplayed(By value) {
        Assert.assertTrue(driver.findElement(value).isDisplayed());
        return this;
    }

    public static By pictureProductItem() {
        return By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[1]/div/div/a/img");
    }

    public static By titleProductItem() {
        return By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[1]");
    }

    public static By descriptionProductItem() {
        return By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[2]");
    }

    public static By skuProductItem() {
        return By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[4]/div/span[2]");
    }

    public static By btndownloadSampleProductItem() {
        return By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[5]");
    }

    public static By btnAddWishlistProductItem() {
        return By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[8]/div[1]");
    }

    public static By btnAddCompareListProductItem() {
        return By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[8]/div[2]");
    }

    public static By btnEmailFriendProductItem() {
        return By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[8]/div[2]");
    }

    public static By priceProductItem() {
        return By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[6]/div");
    }

    public static By ratingProductItem() {
        return By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[3]/div[1]/div");
    }

    public DigitalDownloadsProduct clickOnLink(String labelA){
        WebElement link = driver.findElement(By.linkText(labelA));
        link.click();
        return  this;
    }
}
