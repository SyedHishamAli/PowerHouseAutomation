import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginObjects;

public class LoginTest extends LoginObjects {

    @BeforeMethod
    void init() {
        navigateToLoginPage();
    }
    @Test(description = "Verify Login with valid credentials", priority = 1, groups = {"Smoke", "Sanity"})
    void verifyLogin() {
        login("CORE_Administrator", "5y3ksd@S4V$D7Y55");
        String expectedURL="https://prsl-dev.outsystemsenterprise.com/Dashboard/Homepage.aspx";
        Assert.assertEquals(page.url(),expectedURL);
    }
    @AfterMethod
    void tearDown() {
        closeBrowser();
    }
}
