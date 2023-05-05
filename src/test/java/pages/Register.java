package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import resources.DriverFactory;

public class Register {
    WebDriver driver = DriverFactory.getDriver();

    public Register() {
    }

    public static Register getRegister() {
        return new Register();
    }

    public Register radioButtonGender(){
        WebElement radioButton = driver.findElement(By.id("gender-male"));
        radioButton.click();
        return this;
    }

    public Register inputFirstName(String firstName) {
        WebElement inputElement = driver.findElement(By.id("FirstName"));
        inputElement.sendKeys(firstName);
        return this;
    }

    public Register inputLastName(String lastName) {
        WebElement inputElement = driver.findElement(By.id("LastName"));
        inputElement.sendKeys(lastName);
        return this;
    }

    public Register dropListDay(String day) {
        WebElement dropdown = driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(day);
        return this;
    }

    public Register dropListMonth(String month) {
        WebElement dropdown = driver.findElement(By.name("DateOfBirthMonth"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(month);
        return this;
    }

    public Register dropListYear(String year) {
        WebElement dropdown = driver.findElement(By.name("DateOfBirthYear"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(year);
        return this;
    }

    public Register inputEmail(String email) {
        WebElement inputElement = driver.findElement(By.id("Email"));
        inputElement.sendKeys(email);
        return this;
    }

    public Register inputCompany(String company) {
        WebElement inputElement = driver.findElement(By.id("Company"));
        inputElement.sendKeys(company);
        return this;
    }

    public Register inputPassword(String password) {
        WebElement inputElement = driver.findElement(By.id("Password"));
        inputElement.sendKeys(password);
        WebElement inputElementConfirm = driver.findElement(By.id("ConfirmPassword"));
        inputElementConfirm.sendKeys(password);
        return this;
    }

    public Register buttonRegister(){
        driver.findElement(By.id("register-button")).click();
        return this;
    }


}
