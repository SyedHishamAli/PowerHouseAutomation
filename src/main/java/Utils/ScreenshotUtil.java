package Utils;

import com.microsoft.playwright.Page;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotUtil {
        public static void captureScreenshot(Page page, String testName){
        try{
            //Generate stamp to make the screenshot unique
            String timeStamp= LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            //Build a unique filename
            String fileName= "screenshots/"+testName+"_"+timeStamp+".png";

            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(fileName)).setFullPage(true));
            System.out.println("Screenshot saved:  "+fileName);
        } catch (Exception e){
            System.out.println("Failed to capture screenshot: "+e.getMessage());
        }
    }
}
