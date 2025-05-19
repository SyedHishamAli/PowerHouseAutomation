package Utils;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Base implements Locators {
    private static ThreadLocal<Playwright> playwrightThread = new ThreadLocal<>();
    private static ThreadLocal<Browser> browserThread = new ThreadLocal<>();
    private static ThreadLocal<Page> pageThread = new ThreadLocal<>();
//
//        Playwright playwright;
//        Browser browser;
//        Page page;

    public void initiate(){
        Playwright playwright=Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page= browser.newPage();

        playwrightThread.set(playwright);
        browserThread.set(browser);
        pageThread.set(page);
    }
    public Page getPage() {
        return pageThread.get();  // <-- This method was defined here
    }

    public void close(){
        getPage().close();
        browserThread.get().close();
        playwrightThread.get().close();
    }
}
