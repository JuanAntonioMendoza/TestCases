package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.DriverFactory;

public class Search {
    WebDriver driver = DriverFactory.getDriver();

    public Search() {
    }

    public static Search getSearch() {
        return new Search();
    }

    public Search clickOnLink(String labelA){
        WebElement link = driver.findElement(By.linkText(labelA));
        link.click();
        return  this;
    }
}
