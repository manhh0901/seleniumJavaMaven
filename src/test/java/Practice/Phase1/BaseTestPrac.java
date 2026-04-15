package Practice.Phase1;

import TestAutoDemo.Assert.Soft_Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTestPrac {
    public static WebDriver driver;
    SoftAssert SoftAsserPrac = new SoftAssert();

    @BeforeMethod
    public static void createDriver() throws InterruptedException {
        System.out.println("Create Driver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void quitDriver( ) {
        System.out.println("Quit Driver");
        driver.quit();
        SoftAsserPrac.assertAll();

    }
}
