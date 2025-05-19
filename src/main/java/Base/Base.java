package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Base implements Locators {
    protected Playwright playwright;
    protected Browser browser;
    protected Page page;

    public void initiate(){
        playwright=Playwright.create();
        browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page= browser.newPage();
    }

    public void close(){
        page.close();
        browser.close();
    }
}
