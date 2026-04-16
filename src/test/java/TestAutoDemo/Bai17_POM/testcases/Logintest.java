package TestAutoDemo.Bai17_POM.testcases;

import TestAutoDemo.Bai17_POM.pages.LoginPage;
import TestAutoDemo.common.BaseTest;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Logintest extends BaseTest {

    private LoginPage loginpage;

    @Test(description = "TC001: Verify user can login with valid credentials")
    public void testLoginWithValidCredentials() {
        loginpage = new LoginPage(driver);
        loginpage.loginCRM("admin@example.com", "123456");
        loginpage.verifyLoginSuccess();

    }
}
