package TestAutoDemo.Bai10_Annotations.testcases;

import TestAutoDemo.Bai5_Locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test (priority = 1)
    public void testLoginSuccess() throws InterruptedException {
        System.out.println("Login Test success");
        driver.get(LocatorsCRM.url);
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).submit();
    }

    @Test (priority = 2)
    public void testLoginFailed() throws InterruptedException {
        System.out.println("Login Test failed");
        driver.get(LocatorsCRM.url);
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin1@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).submit();
    }

}
