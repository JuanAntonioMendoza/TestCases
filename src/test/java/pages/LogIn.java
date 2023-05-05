package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.DriverFactory;

public class LogIn {
    WebDriver driver = DriverFactory.getDriver();

    public LogIn() {
    }

    public static LogIn getLogIn() {
        return new LogIn();
    }

    public LogIn inputEmail(String email) {
        WebElement inputElement = driver.findElement(By.id("Email"));
        inputElement.sendKeys(email);
        return this;
    }

    public LogIn inputPassword(String password) {
        WebElement inputElement = driver.findElement(By.id("Password"));
        inputElement.sendKeys(password);
        return this;
    }

    public LogIn buttonLogIn(){
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        return this;
    }
}
