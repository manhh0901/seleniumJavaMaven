package TestAutoDemo.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    @BeforeClass
    public void runBeforeClassBase() throws InterruptedException {
        System.out.println("BASE TEST:  @BeforeClass ");
    }

    @AfterClass
    public void runAfterClassBase() throws InterruptedException {
        System.out.println("BASE TEST:  @AfterClass ");
    }

    public static void CreateDriver () throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Create Driver");
        Thread.sleep(1000);
    }

    public  static void QuitDriver(){

    }

    public static void main(String[] args) throws InterruptedException {

    }
}
