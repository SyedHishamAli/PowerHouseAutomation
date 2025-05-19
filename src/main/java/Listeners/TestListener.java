package Listeners;


import Utils.Base;
import Utils.ScreenshotUtil;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends Base implements ITestListener {

    public void onTestFailure(ITestResult result){
        ScreenshotUtil.captureScreenshot(getPage(), result.getName());
    }

}
