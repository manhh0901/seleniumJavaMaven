package TestAutoDemo.Bai6_Webdriver_Function;

import TestAutoDemo.Bai5_Locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleNewWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://anhtester.com");

        Thread.sleep(1000);
        //driver.switchTo().newWindow(WindowType.TAB); //ví dụ nhận mail otp thì cần phải mở tab mới
        driver.switchTo().newWindow(WindowType.WINDOW); //
        Thread.sleep(1000);
        driver.navigate().to("https://google.com");

        driver.quit();
    }
}
