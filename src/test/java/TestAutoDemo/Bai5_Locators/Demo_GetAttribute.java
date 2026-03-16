package TestAutoDemo.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_GetAttribute {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();// khởi tạo ra môt browser mới chạy độc lập với trình duyệt
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        //get attribute
        String attributeValueEmail = driver.findElement(By.xpath(LocatorsCRM.inputEmail)).getAttribute("value");
        System.out.println("Attribute value email is " + attributeValueEmail);

        String attributeValuePassword = driver.findElement(By.xpath(LocatorsCRM.inputPwd)).getAttribute("value");
        System.out.println("Attribute value password is " + attributeValuePassword);

        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).submit();
        // verify header page

        driver.quit();
    }



}
