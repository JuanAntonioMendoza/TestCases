package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.DriverFactory;

public class Main {
    WebDriver driver = DriverFactory.getDriver();

    public Main() {
    }

    public static Main getMain() {
        return new Main();
    }

    public Main searchBox(String product){
        WebElement searchBox = driver.findElement(By.id("small-searchterms"));
        searchBox.sendKeys(product);
        driver.findElement(By.className("search-box-button")).click();
        return this;
    }
    public Main clickOnlink(String labelA){
        WebElement link = driver.findElement(By.linkText(labelA));
        link.click();
        return this;
    }

    public  Main clicOnMainImage(){
        WebElement link = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
        link.click();
        return this;
    }

}
