package TestAutoDemo.ThucHanhCRM;

import TestAutoDemo.Bai5_Locators.LocatorsCRM;
import TestAutoDemo.common.BaseTest;
import org.openqa.selenium.By;

import java.sql.Driver;

public class AddNewCustomer extends BaseTest {
    public static void loginCRM() throws InterruptedException {
        driver.get(LocatorsCRM.url);
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).submit();

    }

    public static void AddNewCustomer() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();

    }

    public static void main(String[] args) throws InterruptedException {
        CreateDriver();
        loginCRM();
        AddNewCustomer();
    }
}
