import PageObjects.LoginObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends LoginObject {

    @BeforeMethod
    void beforeMethod(){
        setUp();
    }
    @Test(description = "Login to the site", priority = 1, groups = {"Smoke", "Sanity"})
    void testLogin(){
        validLogin("CORE_Administrator", "5y3ksd@S4V$D7Y55");
    }
    @AfterMethod
    void closeBrowser(){
        close();
    }
}
