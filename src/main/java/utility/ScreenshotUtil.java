package utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import base.BaseTest;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {


    public static String captureScreenshot(String testName) {
        WebDriver driver = BaseTest.driver; // Make sure driver is public static in BaseTest
        String screenshotPath = System.getProperty("user.dir") + "/screenshots/" + testName + ".png";

        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File(screenshotPath);
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }

        return screenshotPath;
    }
}
