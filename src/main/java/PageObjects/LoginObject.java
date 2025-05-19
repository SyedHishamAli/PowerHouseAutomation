package PageObjects;

import Utils.Base;
import org.testng.Assert;

public class LoginObject extends Base {
    public void setUp(){
        initiate();
    }
    public void validLogin(String username, String password){
        page.locator(usernameInput).fill(username);
        page.locator(passwordInput).fill(password);
        page.locator(remembermeCheckbox).click();
        page.locator(loginCTA).click();
        String expectedURL="https://prsl-dev.outsystemsenterprise.com/Dashboard/Homepage.aspx";
        Assert.assertEquals(page.url(), expectedURL);
    }
}
