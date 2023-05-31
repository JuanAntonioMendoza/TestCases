package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import resources.DriverFactory;
import resources.UserHelper;
import resources.genkiresources.DataTableGridGenki;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Review {
    WebDriver driver = DriverFactory.getDriver();
    UserHelper userHelper = new UserHelper();
    SoftAssert softAssert = new SoftAssert();
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
        review = "From: " + userHelper.getName() + " " + userHelper.getLastName()
               +  " | Date: " + formattedDate;
        addProductReview_ReviewText.sendKeys(review);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[2]/button")).click();

        validateReview(review);
        return this;
    }

    public void validateReview(String review){
        List<WebElement> elementsDiv = driver.findElements(By.className("product-review-item"));
        int contLap = 0;
        boolean existName = false;
        boolean existDate = false;
        for (WebElement elementDiv : elementsDiv) {
            List<WebElement> elements = elementDiv.findElements(By.cssSelector("*"));
            for (WebElement elementLabel : elements) {
                String label = elementLabel.getTagName();
                System.out.println(elementLabel.getText());
                switch (label){
                    case "div":
                        if(elementLabel.getAttribute("class").equals("text-body")){
                            if(elementLabel.getText().equals(review)){
                                existName = true;
                                existDate = true;
                            }
                        }
                        break;
                    default:
                }
            }

            if(existName && existDate)
                break;

            contLap++;
            if(elementsDiv.size() == contLap){
                softAssert.fail("Don't exist review");
                softAssert.assertAll();
            }
        }
    }

    public static By ratingReview() {
        return By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div[2]");
    }

    public static  By titleReview(){
        return By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/input");
    }

    public  static By textAreaReview(){
        return By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/textarea");
    }

    public Review validateReviewTest(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy h:mm a");
        Date date = new Date();
        String formattedDate = dateFormat.format(date);
        System.out.println(formattedDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, -1);
        Date newDate = calendar.getTime();
        System.out.println(dateFormat.format(newDate));

        List<WebElement> elementsDiv = driver.findElements(By.className("product-review-item"));
        int contLap = 0;
        boolean existName = false;
        boolean existDate = false;
        for (WebElement elementDiv : elementsDiv) {
            List<WebElement> elements = elementDiv.findElements(By.cssSelector("*"));
            for (WebElement elementLabel : elements) {
                String label = elementLabel.getTagName();
                System.out.println(elementLabel.getText() + " " + elementLabel.getText());
                switch (label){
                    case "span":
                        if(elementLabel.getText().equals(userHelper.getName()))
                            existName = true;
//                        if(elementLabel.getText().equals(formattedDate))
//                            existDate = true;
                        break;
                    default:
                }
            }

            if(existName && existDate)
                break;

            contLap++;
            if(elementsDiv.size() == contLap){
                softAssert.fail("Don't exist review");
                softAssert.assertAll();
            }
        }
        return this;
    }

}
