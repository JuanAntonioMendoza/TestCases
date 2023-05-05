package resources;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Ashot {
    WebDriver driver = DriverFactory.getDriver();

    public Ashot() {
    }

    public void newAshot(String folderName, String screenshotName) {
        Screenshot screenshot = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(1000))
                .takeScreenshot(driver);

        //File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            //FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir") + "\\screenshot\\" + folderName + "\\" + screenshotName + ".png"));
            ImageIO.write(screenshot.getImage(), "PNG", new File(System.getProperty("user.dir") + "\\screenshot\\" + folderName + "\\" + screenshotName + ".png"));
            System.out.println("Screenshot Successful");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
