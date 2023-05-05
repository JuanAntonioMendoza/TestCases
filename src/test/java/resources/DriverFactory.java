package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverFactory {
    public static WebDriver driver;

    @BeforeMethod
    public void Initial() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    public DriverFactory() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    @AfterMethod
    public void Ending() {
        // driver.close();
    }
}
