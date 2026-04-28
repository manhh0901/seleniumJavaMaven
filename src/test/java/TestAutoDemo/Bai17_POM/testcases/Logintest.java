package TestAutoDemo.Bai17_POM.testcases;

import TestAutoDemo.Bai17_POM.pages.LoginPage;
import TestAutoDemo.common.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Logintest extends BaseTest {

    private LoginPage loginpage;
    private WebDriver driver;

    @Test(priority = 1,description = "TC001: Verify user can login with valid credentials")
    public void testLoginWithValidCredentials() {
        loginpage = new LoginPage(driver);
        loginpage.loginCRM("admin@example.com", "123456");
        loginpage.verifyLoginSuccess();

    }

    @Test(priority = 2,description = "TC001: Verify user can login with invalid email")
    public void testLoginWithInValidEmail() {
        loginpage = new LoginPage(driver);
        loginpage.loginCRM("admin1@example.com", "123456");
        loginpage.verifyLoginFailedWithInvalidEmail();

    }

    @Test(priority = 3,description = "TC001: Verify user can login with invalid password")
    public void testLoginWithInValidPassword() {
        loginpage = new LoginPage(driver);
        loginpage.loginCRM("admin@example.com", "123456789");
        loginpage.verifyLoginFailedWithInvalidPassword();

    }

}
