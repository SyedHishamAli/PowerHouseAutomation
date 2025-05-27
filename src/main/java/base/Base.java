package base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Base {
    protected Playwright playwright;
    protected Browser browser;
    protected Page page;

  public void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }

    public void closeBrowser() {
        page.close();
        browser.close();
        playwright.close();
    }
}
