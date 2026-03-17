package TestAutoDemo.Bai6_Webdriver_Function;

import TestAutoDemo.Bai5_Locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class HandleListElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        Cookie cookieValue = driver.manage().getCookieNamed("sp_session");


        List<WebElement> menuList = driver.findElements(By.xpath("//ul[@id = 'side-menu']/li[contains(@class,'menu-item')]"));
        List <WebElement> DashBoardSummaryList = driver.findElements(By.xpath("//div[@id ='widget-top_stats']//div[contains(@class, 'quick-stats')]"));
        System.out.println("=========DASHBOARD SUMMARY LIST======================");
        for (WebElement list  : DashBoardSummaryList ){
            System.out.println(list.getText());
        }
        System.out.println("=========MENU LIST======================");
        for (int i = 0; i < menuList.size(); i++){
            System.out.println("Menu " + (i+1) + ": " + menuList.get(i).getText());
        }

        driver.quit();

        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver2.get("https://crm.anhtester.com/admin/authentication");
        // add cookie
        Thread.sleep(4000);

        driver2.manage().addCookie(new Cookie(cookieValue.getName(), cookieValue.getValue()));
        System.out.println(cookieValue.getName());
        System.out.println(cookieValue.getValue());
        Thread.sleep(4000);
        driver2.quit();







    }
}
