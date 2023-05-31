package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWait {
    public static WebDriverWait driverWait;

    public DriverWait() {
    }

    public static WebDriverWait getDriverWait(WebDriver driver, int timeSeconds){
        driverWait = new WebDriverWait(driver,timeSeconds);
        return driverWait;
    }
//     Esperar hasta que un elemento esté visible
//    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element_id"))); // Cambia "element_id" por el ID de tu elemento
//
//     También puedes personalizar el tiempo de espera
//    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element_id")), 5); // Cambia "element_id" por el ID de tu elemento y "5" por el tiempo de espera deseado

}
