package TestAutoDemo.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

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
        CreateDriver();
    }
}
