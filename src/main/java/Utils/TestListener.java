package Utils;

import base.Base;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends Base implements ITestListener {
    public void onTestFailure(ITestResult result){
        ScreenshotUtil.takeScreenshot(page, result.getTestName());
    }
}
