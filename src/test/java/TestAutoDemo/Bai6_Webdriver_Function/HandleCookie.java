package TestAutoDemo.Bai6_Webdriver_Function;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleCookie {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/");
        Thread.sleep(2000);

        driver.manage().addCookie(new Cookie("sp_session", "f077a816d92a8c05b5df05982c931e9f09ff87b9"));
        driver.get("https://crm.anhtester.com/admin/");
        driver.navigate().refresh();
        Thread.sleep(2000);
//        System.out.println(driver.manage().getCookies());
//        Thread.sleep(2000);
//        System.out.println(driver.getTitle());
//        Thread.sleep(2000);
//        driver.manage().deleteCookieNamed("sp_session");
//        System.out.println(driver.manage().getCookies());
//
//        driver.manage().deleteAllCookies();
//        System.out.println(driver.manage().getCookies());

        driver.quit();
    }
}
