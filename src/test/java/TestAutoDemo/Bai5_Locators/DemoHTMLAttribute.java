package TestAutoDemo.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoHTMLAttribute {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Xin chao!");

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/authentication/login");

        driver.findElement(By.id("email")).sendKeys("admin@example.com");

        WebElement inputPwd = driver.findElement(By.name("password"));

        driver.findElement(By.name("password")).sendKeys("123456");

        // textlinks
        driver.findElement(By.linkText("Forgot Password?")).click();

        // partial textlinks
        driver.findElement(By.partialLinkText("Forgot")).click();


        Thread.sleep(2000);
        driver.quit();
    }
}
