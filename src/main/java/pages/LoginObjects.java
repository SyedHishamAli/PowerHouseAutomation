package pages;

import Utils.Locators;
import base.Base;
import org.testng.Assert;

public class LoginObjects extends Base implements Locators {

    public void navigateToLoginPage() {
        setUp();
     page.navigate("https://prsl-dev.outsystemsenterprise.com/IAM/Login.aspx");
    }

    public void login(String username, String password) {
       page.locator(USERNAME_LOCATOR).fill(username);
       page.locator(PASSWORD_LOCATOR).fill(password);
       page.locator(remembermeCheckbox).click();
       page.locator(LOGIN_BUTTON_LOCATOR).click();
       Assert.assertEquals(page.url(),"https://prsl-dev.outsystemsenterprise.com/Dashboard/Homepage.aspx");
    }
}
