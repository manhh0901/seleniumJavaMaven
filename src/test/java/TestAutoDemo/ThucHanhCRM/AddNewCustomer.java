package TestAutoDemo.ThucHanhCRM;

import TestAutoDemo.Bai5_Locators.LocatorsCRM;
import TestAutoDemo.common.BaseTest;
import org.openqa.selenium.By;

import java.sql.Driver;

public class AddNewCustomer extends BaseTest {
    public static void loginCRM(){
        driver.get(LocatorsCRM.url);
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).submit();

    }

    public static void main(String[] args) throws InterruptedException {
        CreateDriver();
    }


}
