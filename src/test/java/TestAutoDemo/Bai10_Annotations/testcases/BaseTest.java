package TestAutoDemo.Bai10_Annotations.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;


    @BeforeMethod
    public void CreateDriver() throws InterruptedException {
        System.out.println("Create Driver");
        Thread.sleep(1000);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
    }

    @AfterMethod
    public void CloseDriver() throws InterruptedException {
        System.out.println("Close Driver");
        driver.quit();

    }
}
