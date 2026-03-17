package TestAutoDemo.Bai6_Webdriver_Function;

import TestAutoDemo.Bai5_Locators.LocatorsCRM;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Demo_WebDriver_Function {
    //web driver là trình điều khiển
    // ví dụ là dieu huong toi mot tab moi, khong phai la element

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        driver.get("https://crm.anhtester.com/admin/authentication");
//        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
//        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
//        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).sendKeys("123456");
//        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();
//
//
//        List <WebElement> menuList = driver.findElements(By.xpath("//ul[@id = 'side-menu']/li[contains(@class,'menu-item')]"));
//
//        for (WebElement list  : menuList ){
//
//            System.out.println(list.getText());
//
//        }

        driver.manage().window().setPosition(new Point(100,100));
        driver.manage().window().setSize(new Dimension(1300, 1000));

        driver.navigate().to("https://anhtester.com");
        Thread.sleep(1000);
        driver.findElement(By.id("btn-login")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();

        System.out.println("Get page title: " + driver.getTitle());
        System.out.println("Get page URL: " + driver.getCurrentUrl());

        System.out.println("=====================================");
        System.out.println(driver.getPageSource().contains("Login | Anh Tester Blog"));
        driver.quit();
    }

}
