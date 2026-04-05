package TestAutoDemo.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import TestAutoDemo.Bai5_Locators.LocatorsCRM;
import TestAutoDemo.common.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Testloginh_Assert extends BaseTest {

    @Test
    public void LoginSuccess (){
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        //boolean checkDashboard = driver.findElement(By.xpath(LocatorsCRM.menuDashboard)).isDisplayed();
        //Assert.assertTrue(checkDashboard,"Failed: Menu dashboard is not displayed");

        List < WebElement> check = driver.findElements(By.xpath(LocatorsCRM.menuDashboard));
        System.out.println("Number of menu :" + check.size());
        Assert.assertTrue(check.size() >0,"Failed: Menu dashboard is not displayed");

        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();
        boolean title = driver.findElement(By.xpath(LocatorsCRM.titleCustomerSummary)).isDisplayed();
        String titleText = driver.findElement(By.xpath(LocatorsCRM.titleCustomerSummary)).getText();
        System.out.println(titleText + " is found");
        Assert.assertTrue(title,"Title Customer Summary is not found");
        Assert.assertEquals(titleText, "Customers Summary");


        // verify header page
        driver.quit();
    }

}
