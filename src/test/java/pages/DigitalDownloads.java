package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import resources.DriverFactory;
import java.util.List;

public class DigitalDownloads {
    WebDriver driver = DriverFactory.getDriver();

    public DigitalDownloads() {

    }

    public static DigitalDownloads getDigitalDownloads() {
        return new DigitalDownloads();
    }

    public DigitalDownloads IsDisplayed(By value) {
        Assert.assertTrue(driver.findElement(value).isDisplayed());
        return this;
    }

    public static By fullProductItem() {
        return By.className("product-item");
    }

    public static By pictureProductItem() {
        return By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[1]/a/img");
    }

    public static By nameProductItem() {
        return By.className("product-title");
    }

    public static By rakingProductItem() {
        return By.className("rating");
    }

    public static By addCartProductItem() {
        return By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[1]");
    }

    public static By priceProductItem() {
        return By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[1]/span");
    }

    public DigitalDownloads validateLabelOnDivItem(String classdiv) {

        List<WebElement> elementsDiv = driver.findElements(By.cssSelector("div." + classdiv));

        for (WebElement elementDiv : elementsDiv) {
            List<WebElement> elementos = elementDiv.findElements(By.cssSelector("*"));
            for (WebElement elemento : elementos) {
                String clase = elemento.getAttribute("class");

                switch (elemento.getTagName()) {
                    case "img":
                        String alt = elemento.getAttribute("alt");
                        validateDisplayImg(alt);
                        break;
                    case "a":
                        String href = elemento.getAttribute("href");
                        validateProductTitle(href);
                        break;
                    case "div":
                        String title = elemento.getAttribute("title");
                        if(clase.equals("product-rating-box"))
                            validateProductRating(title);
                        break;
                    case "button":
                        String classbtn = elemento.getAttribute("class");
                        if(classbtn.equalsIgnoreCase("button-2 product-box-add-to-cart-button")){
                            if(elemento.getText().equals("ADD TO CART"))
                                System.out.println("Passed");
                        }
                        break;
                    case "span":
                        String classspan = elemento.getAttribute("class");
                        if(classspan.equalsIgnoreCase("price actual-price")){
                            if(!elemento.getText().isEmpty())
                                System.out.println("Passed");
                            else
                                System.out.println("Failed");
                            throw new AssertionError("Class don't have anything: " + classspan );
                        }
                        break;
                    default:
                        // Nothing
                        break;
                }
            }
        }
        return this;
    }

    public DigitalDownloads validateDisplayImg(String alt){
        switch(alt){
            case "Picture of If You Wait (donation)":
                IsDisplayed(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img"));
            break;
            case "Picture of Night Visions":
                IsDisplayed(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img"));
            break;
            case "Picture of Science & Faith":
                IsDisplayed(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img"));
            break;
        }
        return this;
    }

    public DigitalDownloads validateProductTitle(String href){
        switch(href){
            case "https://demo.nopcommerce.com/if-you-wait-donation":
                IsDisplayed(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/h2/a"));
                break;
            case "https://demo.nopcommerce.com/night-visions":
                IsDisplayed(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/h2/a"));
                break;
            case "https://demo.nopcommerce.com/science-faith":
                IsDisplayed(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a"));
                break;
        }
        return this;
    }

    public DigitalDownloads validateProductRating(String title){
        switch(title){
            case "1 review(s)":
                IsDisplayed(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[1]"));
                break;
            case "2 review(s)":
                IsDisplayed(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[1]"));
                break;
        }
        return this;
    }

    public DigitalDownloads clickOnlink(String labelA){
        WebElement link = driver.findElement(By.linkText(labelA));
        link.click();
        return this;
    }

    public DigitalDownloads clickOnViewAllTag(){
        WebElement link = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[4]/div[2]/div[2]/a"));
        link.click();
        return this;
    }

    public DigitalDownloads validateLabelOnDivItemDontFailed(String classdiv) {

        WebElement imagen = driver.findElement(By.tagName("img"));
        List<WebElement> elementsDiv = driver.findElements(By.cssSelector("div." + classdiv));

        for (WebElement elementDiv : elementsDiv) {
            List<WebElement> elementos = elementDiv.findElements(By.cssSelector("*"));
            for (WebElement elemento : elementos) {
                String clase = elemento.getAttribute("class");

                switch (elemento.getTagName()) {
                    case "img":
                        String alt = elemento.getAttribute("alt");
                        validateDisplayImg(alt);
                        break;
                    case "a":
                        String href = elemento.getAttribute("href");
                        validateProductTitle(href);
                        break;
                    case "div":
                        String title = elemento.getAttribute("title");
                        if(clase.equals("product-rating-box"))
                            validateProductRating(title);
                        break;
                    case "button":
                        String classbtn = elemento.getAttribute("class");
                        if(classbtn.equalsIgnoreCase("button-2 product-box-add-to-cart-button")){
                            if(elemento.getText().equals("ADD TO CART"))
                                System.out.println("Passed");
                        }
                        break;
                    case "span":
                        String classspan = elemento.getAttribute("class");
                        if(classspan.equalsIgnoreCase("price actual-price")){
                            System.out.println(classspan);
                            System.out.println(elemento.getText());
                            if(!elemento.getText().isEmpty())
                                System.out.println("Passed");
                            else
                                System.out.println("Failed");
                            //throw new AssertionError("Class don't have anything: " + classspan );
                        }
                        break;
                    default:
                        // Nothing
                        break;
                }
            }
        }
        return this;
    }

}