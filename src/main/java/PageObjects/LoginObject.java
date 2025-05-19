package PageObjects;

import Base.Base;

import java.lang.classfile.Signature;

public class LoginObject extends Base {
    public void setUp(){
        initiate();
        page.navigate("https://prsl-dev.outsystemsenterprise.com/IAM/Login.aspx");
    }
    public void validLogin(String username, String password){
        page.locator(usernameInput).fill(username);
        page.locator(passwordInput).fill(password);
        page.locator(remembermeCheckbox).click();
        page.locator(loginCTA).click();
    }
}
