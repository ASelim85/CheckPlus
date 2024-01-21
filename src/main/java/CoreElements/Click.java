package CoreElements;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Click extends Found {

    public static void click1(By locator) {
        waitElement1(locator);
        find1(locator).click();
//        try {
//            TakesScreenshot screenshot = (TakesScreenshot) driver;
//            File src = screenshot.getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(src, new File(
//                    ".\\TestData\\ScreenShots\\" + getClass().getSimpleName() + "\\" + new Throwable().getStackTrace()[0].getMethodName() + "_" + getCurrentDate() + ".png"));
//        } catch (Exception ignored) {
//        }
    }
}