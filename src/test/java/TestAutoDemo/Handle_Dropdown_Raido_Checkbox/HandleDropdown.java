package TestAutoDemo.Handle_Dropdown_Raido_Checkbox;

import TestAutoDemo.Bai5_Locators.LocatorsPM;
import TestAutoDemo.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class HandleDropdown extends BaseTest {

    @Test
    public static void DropdownStatic () throws InterruptedException {
        // so luong gia tri trong dropdown khong thay doi
        //https://demoqa.com/select-menu
        CreateDriver();
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(1000);

        //dropdown dung the select
        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
        Thread.sleep(1000);
        select.selectByVisibleText("Blue");
        System.out.println(select.getFirstSelectedOption().getText());
//      select.selectByValue("6");
//      select.selectByIndex(3);
        driver.quit();
    }

    public static void DropdownDynamic() throws InterruptedException {
        CreateDriver();
        driver.get("https://sbx-mc.payme.vn/login");
        driver.findElement(By.xpath(LocatorsPM.inputUserAccount)).sendKeys("0778748667");
        driver.findElement(By.xpath(LocatorsPM.inputPassword)).sendKeys("Mkpayme@0901");
        driver.findElement(By.xpath(LocatorsPM.btnLogin)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsPM.menuPayout)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsPM.btnCreatePayoutSingle)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@id,'react-select')]/ancestor::div[@class=' css-cs2711-container']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@id,'react-select') and contains(@class,'form-select__input')]")).sendKeys("saigon");
        Thread.sleep(1000);
        //cách Enter dùng trong trường hợp chỉ hển thị 1 giá trị lựa chọn
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
        //Actions hỗ trợ nhiều thuộc tính liên quan đến điều khiển bàn phím
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        //DropdownStatic();
         DropdownDynamic();
        // voi drop down khi re chuot vao la biet mat khong inspect dc
        //setTimeout(()=>{debugger},3000) tại thanh console
        //cách Enter dùng trong trường hợp chỉ hển thị 1 giá trị lựa chọn

    }
}
