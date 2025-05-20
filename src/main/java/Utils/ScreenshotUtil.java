package Utils;

import com.microsoft.playwright.Page;

import java.nio.file.Paths;

public class ScreenshotUtil {
    public static void takeScreenshot(Page page, String testName) {
        try {
            String timestamp = String.valueOf(System.currentTimeMillis());
            String fileName = "screenshot/" + testName + "_" + timestamp + ".png";
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(fileName)).setFullPage(true));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}