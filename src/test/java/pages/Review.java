package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import resources.DriverFactory;
import resources.UserHelper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Review {
    WebDriver driver = DriverFactory.getDriver();
    UserHelper userHelper = new UserHelper();
    public Review() {
    }

    public static Review getReview() {
        return new Review();
    }

    public Review IsDisplayed(By value) {
        Assert.assertTrue(driver.findElement(value).isDisplayed());
        return this;
    }

    public static By errorAlert() {
        return By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]");
    }

    public Review disableLabel(String labelId){
        WebElement label = driver.findElement(By.id(labelId));
        if (label.isEnabled()) {
            System.out.println("Enable");
        } else {
            System.out.println("Disabled");
        }
        return this;
    }

    public Review createReview(){
        WebElement addProductReview_Title = driver.findElement(By.id("AddProductReview_Title"));
        addProductReview_Title.sendKeys("Review");
        WebElement addProductReview_ReviewText = driver.findElement(By.id("AddProductReview_ReviewText"));
        String review = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy h:mm a");
        Date date = new Date();
        String formattedDate = dateFormat.format(date);
        review = "From: " + userHelper.getName() + " " + userHelper.getName()
               +  " | Date: " + formattedDate;
        addProductReview_ReviewText.sendKeys(review);
        return this;
    }

    public static By ratingReview() {
        return By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div[2]/div[2]");
    }

}
