package TestAutoDemo.Assert;

import TestAutoDemo.Bai5_Locators.LocatorsCRM;
import TestAutoDemo.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class Soft_Assert extends BaseTest {
    @Test
    public void LoginSuccess () throws InterruptedException {
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        SoftAssert softassert = new SoftAssert();

        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();
        boolean title = driver.findElement(By.xpath(LocatorsCRM.titleCustomerSummary)).isDisplayed();
        String titleText = driver.findElement(By.xpath(LocatorsCRM.titleCustomerSummary)).getText();
        softassert.assertTrue(title,"Title Customer Summary is not found");
        softassert.assertEquals(titleText, "Customer Summary");
        driver.findElement(By.xpath(LocatorsCRM.addNewCus)).click();
        // verify header page
        driver.quit();
    }
}
