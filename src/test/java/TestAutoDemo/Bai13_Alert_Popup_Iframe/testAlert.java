package TestAutoDemo.Bai13_Alert_Popup_Iframe;

import TestAutoDemo.common.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testAlert extends BaseTest {
    // khong bat duoc element trong alert popup
    // alert popup: hien thi thong bao, chi co the click OK hoac Cancel
    // Không nằm trong DOM, cây thư mục của web nên sẽ không bắt dc.

    @Test
    public void demoHandleAlertAccept() throws InterruptedException {
        driver.get("https://www.lambdatest.com/selenium-playground/javascript-alert-box-demo");
        Thread.sleep(2000);

        //Click vào nút "Click Me" thứ nhất
        driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
        Thread.sleep(1000);

        //Khởi tạo class Alert
        Alert alert1 = driver.switchTo().alert();
        //Dùng hàm accept() để xác nhận Alert (tương ứng click vào nút OK)
        alert1.accept();

        Thread.sleep(1000);
    }

    @Test
    public void demoHandleAlertDismiss() throws InterruptedException {
        driver.get("https://www.lambdatest.com/selenium-playground/javascript-alert-box-demo");
        Thread.sleep(2000);

        //Click vào nút "Click Me" thứ hai
        driver.findElement(By.xpath("(//button[text()='Click Me'])[2]")).click();
        Thread.sleep(1000);

        //Khởi tạo class Alert
        Alert alert2 = driver.switchTo().alert();
        //Dùng hàm dismiss() để từ chối Alert (tương ứng click vào nút Cancel)
        alert2.dismiss();

        Thread.sleep(1000);
    }

    @Test
    public void demoHandleAlertInputText() throws InterruptedException {
        driver.get("https://www.lambdatest.com/selenium-playground/javascript-alert-box-demo");
        Thread.sleep(2000);

        //Mở Alert Input text, click nút Click Me thứ ba
        driver.findElement(By.xpath("(//button[text()='Click Me'])[3]")).click();
        Thread.sleep(1000);

        //Khởi tạo class Alert
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Anh Tester Demo Alert");
        Thread.sleep(1000);

        alert3.accept();

        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.xpath("//p[@id='prompt-demo']")).getText(),
                "You have entered 'Anh Tester Demo Alert' !",
                "Chưa điền được text");

        Thread.sleep(1000);
    }

}
