package TestAutoDemo.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_Gettext {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();// khởi tạo ra môt browser mới chạy độc lập với trình duyệt
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).submit();
        // verify header page
       Thread.sleep(2000);
       driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();
        Thread.sleep(2000);
        System.out.println("Header customer page " + driver.findElement(By.xpath(LocatorsCRM.titleCustomerSummary)).getText());
        Thread.sleep(2000);
        driver.quit();
        //submit như chức năng enter khi user nhập hết form và nhấn enter

    }



}
