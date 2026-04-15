package TestAutoDemo;

import TestAutoDemo.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Bai14_JavascriptExcutor extends BaseTest {

    // dùng để thao tác element khi có điểm che
    @Test
    public void testJSEx() throws InterruptedException {
        driver.get("https://anhtester.com");
        WebElement buttonLogin = driver.findElement(By.xpath("//a[@id='btn-login']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        // HÀM CLICK
        //js.executeScript("document.getElementById('id_of_element').click();");
        //hoặc
        js.executeScript("arguments[0].click();", buttonLogin);
        Thread.sleep(2000);

        // HÀM SENDKEY
        js.executeScript("document.getElementById('email').setAttribute('value','admin02@mailinator.com');");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('password').setAttribute('value','123456');");
        Thread.sleep(2000);

    }

    @Test
    public void testJSExSendKeys() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(3000);
        // HÀM SENDKEY
        js.executeScript("document.getElementById('email').setAttribute('value','admin02@mailinator.com');");
        Thread.sleep(3000);
        js.executeScript("document.getElementById('password').setAttribute('value','123456');");
        Thread.sleep(3000);

    }

    @Test
    public void testJSExCheckBox() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(3000);
        // CHECKBOX


    }


    @Test
    public void testJSExScroll() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://anhtester.com");
        Thread.sleep(3000);
        // CHECKBOX

        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Tất Cả Khóa Học')]"));
        js.executeScript("arguments[0].scrollIntoView(false);", element);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(3000);
    }



}
